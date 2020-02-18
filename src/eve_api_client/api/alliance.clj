(ns eve-api-client.api.alliance
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-alliances-with-http-info
  "List all alliances
  List all active player alliances

---

This route is cached for up to 3600 seconds"
  ([] (get-alliances-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/alliances/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-alliances
  "List all alliances
  List all active player alliances

---

This route is cached for up to 3600 seconds"
  ([] (get-alliances nil))
  ([optional-params]
   (:data (get-alliances-with-http-info optional-params))))

(defn get-alliances-alliance-id-with-http-info
  "Get alliance information
  Public information about an alliance

---

This route is cached for up to 3600 seconds"
  ([alliance-id ] (get-alliances-alliance-id-with-http-info alliance-id nil))
  ([alliance-id {:keys [datasource if-none-match ]}]
   (check-required-params alliance-id)
   (call-api "/v3/alliances/{alliance_id}/" :get
             {:path-params   {"alliance_id" alliance-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-alliances-alliance-id
  "Get alliance information
  Public information about an alliance

---

This route is cached for up to 3600 seconds"
  ([alliance-id ] (get-alliances-alliance-id alliance-id nil))
  ([alliance-id optional-params]
   (:data (get-alliances-alliance-id-with-http-info alliance-id optional-params))))

(defn get-alliances-alliance-id-corporations-with-http-info
  "List alliance's corporations
  List all current member corporations of an alliance

---

This route is cached for up to 3600 seconds"
  ([alliance-id ] (get-alliances-alliance-id-corporations-with-http-info alliance-id nil))
  ([alliance-id {:keys [datasource if-none-match ]}]
   (check-required-params alliance-id)
   (call-api "/v1/alliances/{alliance_id}/corporations/" :get
             {:path-params   {"alliance_id" alliance-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-alliances-alliance-id-corporations
  "List alliance's corporations
  List all current member corporations of an alliance

---

This route is cached for up to 3600 seconds"
  ([alliance-id ] (get-alliances-alliance-id-corporations alliance-id nil))
  ([alliance-id optional-params]
   (:data (get-alliances-alliance-id-corporations-with-http-info alliance-id optional-params))))

(defn get-alliances-alliance-id-icons-with-http-info
  "Get alliance icon
  Get the icon urls for a alliance

---

This route expires daily at 11:05"
  ([alliance-id ] (get-alliances-alliance-id-icons-with-http-info alliance-id nil))
  ([alliance-id {:keys [datasource if-none-match ]}]
   (check-required-params alliance-id)
   (call-api "/v1/alliances/{alliance_id}/icons/" :get
             {:path-params   {"alliance_id" alliance-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-alliances-alliance-id-icons
  "Get alliance icon
  Get the icon urls for a alliance

---

This route expires daily at 11:05"
  ([alliance-id ] (get-alliances-alliance-id-icons alliance-id nil))
  ([alliance-id optional-params]
   (:data (get-alliances-alliance-id-icons-with-http-info alliance-id optional-params))))

