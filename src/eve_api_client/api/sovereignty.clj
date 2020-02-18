(ns eve-api-client.api.sovereignty
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-sovereignty-campaigns-with-http-info
  "List sovereignty campaigns
  Shows sovereignty data for campaigns.

---

This route is cached for up to 5 seconds"
  ([] (get-sovereignty-campaigns-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/sovereignty/campaigns/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-sovereignty-campaigns
  "List sovereignty campaigns
  Shows sovereignty data for campaigns.

---

This route is cached for up to 5 seconds"
  ([] (get-sovereignty-campaigns nil))
  ([optional-params]
   (:data (get-sovereignty-campaigns-with-http-info optional-params))))

(defn get-sovereignty-map-with-http-info
  "List sovereignty of systems
  Shows sovereignty information for solar systems

---

This route is cached for up to 3600 seconds"
  ([] (get-sovereignty-map-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/sovereignty/map/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-sovereignty-map
  "List sovereignty of systems
  Shows sovereignty information for solar systems

---

This route is cached for up to 3600 seconds"
  ([] (get-sovereignty-map nil))
  ([optional-params]
   (:data (get-sovereignty-map-with-http-info optional-params))))

(defn get-sovereignty-structures-with-http-info
  "List sovereignty structures
  Shows sovereignty data for structures.

---

This route is cached for up to 120 seconds"
  ([] (get-sovereignty-structures-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/sovereignty/structures/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-sovereignty-structures
  "List sovereignty structures
  Shows sovereignty data for structures.

---

This route is cached for up to 120 seconds"
  ([] (get-sovereignty-structures nil))
  ([optional-params]
   (:data (get-sovereignty-structures-with-http-info optional-params))))

