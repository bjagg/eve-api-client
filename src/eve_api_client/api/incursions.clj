(ns eve-api-client.api.incursions
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-api-client.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-incursions-with-http-info
  "List incursions
  Return a list of current incursions

---

This route is cached for up to 300 seconds"
  ([] (get-incursions-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/incursions/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-incursions
  "List incursions
  Return a list of current incursions

---

This route is cached for up to 300 seconds"
  ([] (get-incursions nil))
  ([optional-params]
   (:data (get-incursions-with-http-info optional-params))))

