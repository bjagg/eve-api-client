(ns eve-api-client.api.routes
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-swagger-interface.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-route-origin-destination-with-http-info
  "Get route
  Get the systems between origin and destination

---

This route is cached for up to 86400 seconds"
  ([destination origin ] (get-route-origin-destination-with-http-info destination origin nil))
  ([destination origin {:keys [avoid connections datasource flag if-none-match ]}]
   (check-required-params destination origin)
   (call-api "/v1/route/{origin}/{destination}/" :get
             {:path-params   {"destination" destination "origin" origin }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"avoid" (with-collection-format avoid :multi) "connections" (with-collection-format connections :multi) "datasource" datasource "flag" flag }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-route-origin-destination
  "Get route
  Get the systems between origin and destination

---

This route is cached for up to 86400 seconds"
  ([destination origin ] (get-route-origin-destination destination origin nil))
  ([destination origin optional-params]
   (:data (get-route-origin-destination-with-http-info destination origin optional-params))))

