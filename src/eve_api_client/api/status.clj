(ns eve-api-client.api.status
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-api-client.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-status-with-http-info
  "Retrieve the uptime and player counts
  EVE Server status

---

This route is cached for up to 30 seconds"
  ([] (get-status-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/status/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-status
  "Retrieve the uptime and player counts
  EVE Server status

---

This route is cached for up to 30 seconds"
  ([] (get-status nil))
  ([optional-params]
   (:data (get-status-with-http-info optional-params))))

