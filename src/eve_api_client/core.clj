(ns eve-api-client.core
  (:require
    [cheshire.core :refer [generate-string parse-string]]
    [clj-http.client :as client]
    [clojure.string :as str]
    [eve-swagger-interface.core :refer :all])
  (:import
    (com.fasterxml.jackson.core JsonParseException)
    (java.io File)
    (java.util Date TimeZone)
    (java.time ZonedDateTime)
    (java.time.format DateTimeFormatter)
    (java.text SimpleDateFormat)))

(defn build-req-opts
  "Reconstitute opts appropriate for request call from a general set of opts, path and method"
  [path method {:keys [path-params body-param content-types accepts auth-names] :as opts}]
  (let [{:keys [debug]} *api-context*
        {:keys [req-opts query-params header-params form-params]} (auths->opts auth-names)
        query-params (merge query-params (:query-params opts))
        header-params (merge header-params (:header-params opts) (:headers opts))
        form-params (merge form-params (:form-params opts))
        url (make-url path path-params)
        content-type (or (json-preferred-mime content-types) (and body-param :json))
        accept (or (json-preferred-mime accepts) :json)
        multipart? (= "multipart/form-data" content-type)
        req-opts (cond-> req-opts
                   true (assoc :url url :method method)
                   accept (assoc :accept accept)
                   (seq query-params) (assoc :query-params (normalize-params query-params))
                   (seq header-params) (assoc :headers (normalize-params header-params))
                   (and content-type (not multipart?)) (assoc :content-type content-type)
                   multipart? (assoc :multipart (-> form-params normalize-params form-params->multipart))
                   (and (not multipart?) (seq form-params)) (assoc :form-params (normalize-params form-params))
                   body-param (assoc :body (serialize body-param content-type))
                   debug (assoc :debug true :debug-body true))]
    req-opts))

(defn build-cache-key
  "Create a cache key based on API values that make each call distinct."
  [req-opts]
  (let [{:keys [debug]} *api-context*
        {:keys [url method query-params]} req-opts
        key-map {:url url :method method :query-params query-params}]
    (when debug
      (println "Key values: ")
      (println key-map)
      (println "Key hash: ")
      (println (hash key-map)))
    (hash key-map)))

(def req-cache (agent {}))

(defn parse-expires [s]
  (ZonedDateTime/parse s (DateTimeFormatter/RFC_1123_DATE_TIME)))

(defn cache-get
  "For a given req-opt, see if there is a cached value. Do not check if expired"
  [req-opts]
  (let [token (or (some-> req-opts :query-params (get "token")) 0)
        req-key (build-cache-key req-opts)]
    (get-in @req-cache [token req-key])))

(defn cache-put!
  "Cache the request based on the req-opt map"
  [req-opts resp]
  (let [token (or (some-> req-opts :query-params (get "token")) 0)
        req-key (build-cache-key req-opts)]
    (send req-cache assoc-in [token req-key] resp)
    resp))

(defn filter-key-fn ;; TODO: re-purpose in new method to remove expired, non-token responses
  "Create a reduce-kv function that filters the map by the given token"
  [token]
  (fn [m k v]
    (if (= (:token v) token)
      m
      (assoc m k v))))

(defn cache-clear-by-token
  "Remove any responses associated with the token parameter"
  [token]
  (let [{:keys [debug]} *api-context*
        filter-token (filter-key-fn token)]
    (send req-cache dissoc token)))

(defn call-api
  "Call an API by making HTTP request and return its response."
  [path method opts]
  (let [{:keys [debug]} *api-context*
        req-opts (build-req-opts path method opts)
        cached-resp (cache-get req-opts)
        expires (some-> cached-resp :headers (get "Expires") (parse-expires))
        not-expired (and expires (.isBefore (ZonedDateTime/now) expires))]
    (when debug
      (print "Expired? ")
      (print (not not-expired))
      (print " ")
      (print (some-> cached-resp :headers (get "Expires")))
      (print " ")
      (println (:url req-opts)))
    (if not-expired
      cached-resp
      (let [etag (some-> cached-resp :headers (get "Etag"))
            req-opts-plus-etag (cond-> req-opts
                                 etag (assoc-in [:headers "If-None-Match"] etag))]
        (try
          (let [resp (client/request req-opts-plus-etag)]
            #_(println (:status resp))
            (case (:status resp)
              304 cached-resp
              200 (cache-put! req-opts-plus-etag (assoc resp :data (deserialize resp)))
              (println (str  "bad status: " (:status resp)))))
          (catch Exception e (println e)))))))
