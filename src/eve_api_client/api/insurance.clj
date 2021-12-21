(ns eve-api-client.api.insurance
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-api-client.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-insurance-prices-with-http-info
  "List insurance levels
  Return available insurance levels for all ship types

---

This route is cached for up to 3600 seconds"
  ([] (get-insurance-prices-with-http-info nil))
  ([{:keys [accept-language datasource if-none-match language ]}]
   (call-api "/v1/insurance/prices/" :get
             {:path-params   {}
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-insurance-prices
  "List insurance levels
  Return available insurance levels for all ship types

---

This route is cached for up to 3600 seconds"
  ([] (get-insurance-prices nil))
  ([optional-params]
   (:data (get-insurance-prices-with-http-info optional-params))))

