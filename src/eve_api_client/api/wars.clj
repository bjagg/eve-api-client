(ns eve-api-client.api.wars
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-api-client.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-wars-with-http-info
  "List wars
  Return a list of wars

---

This route is cached for up to 3600 seconds"
  ([] (get-wars-with-http-info nil))
  ([{:keys [datasource if-none-match max-war-id ]}]
   (call-api "/v1/wars/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "max_war_id" max-war-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-wars
  "List wars
  Return a list of wars

---

This route is cached for up to 3600 seconds"
  ([] (get-wars nil))
  ([optional-params]
   (:data (get-wars-with-http-info optional-params))))

(defn get-wars-war-id-with-http-info
  "Get war information
  Return details about a war

---

This route is cached for up to 3600 seconds"
  ([war-id ] (get-wars-war-id-with-http-info war-id nil))
  ([war-id {:keys [datasource if-none-match ]}]
   (check-required-params war-id)
   (call-api "/v1/wars/{war_id}/" :get
             {:path-params   {"war_id" war-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-wars-war-id
  "Get war information
  Return details about a war

---

This route is cached for up to 3600 seconds"
  ([war-id ] (get-wars-war-id war-id nil))
  ([war-id optional-params]
   (:data (get-wars-war-id-with-http-info war-id optional-params))))

(defn get-wars-war-id-killmails-with-http-info
  "List kills for a war
  Return a list of kills related to a war

---

This route is cached for up to 3600 seconds"
  ([war-id ] (get-wars-war-id-killmails-with-http-info war-id nil))
  ([war-id {:keys [datasource if-none-match page ]}]
   (check-required-params war-id)
   (call-api "/v1/wars/{war_id}/killmails/" :get
             {:path-params   {"war_id" war-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-wars-war-id-killmails
  "List kills for a war
  Return a list of kills related to a war

---

This route is cached for up to 3600 seconds"
  ([war-id ] (get-wars-war-id-killmails war-id nil))
  ([war-id optional-params]
   (:data (get-wars-war-id-killmails-with-http-info war-id optional-params))))

