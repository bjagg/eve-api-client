(ns eve-api-client.api.loyalty
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-api-client.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-characters-character-id-loyalty-points-with-http-info
  "Get loyalty points
  Return a list of loyalty points for all corporations the character has worked for

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-loyalty-points-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/loyalty/points/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-loyalty-points
  "Get loyalty points
  Return a list of loyalty points for all corporations the character has worked for

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-loyalty-points character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-loyalty-points-with-http-info character-id optional-params))))

(defn get-loyalty-stores-corporation-id-offers-with-http-info
  "List loyalty store offers
  Return a list of offers from a specific corporation's loyalty store

---

This route expires daily at 11:05"
  ([corporation-id ] (get-loyalty-stores-corporation-id-offers-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match ]}]
   (check-required-params corporation-id)
   (call-api "/v1/loyalty/stores/{corporation_id}/offers/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-loyalty-stores-corporation-id-offers
  "List loyalty store offers
  Return a list of offers from a specific corporation's loyalty store

---

This route expires daily at 11:05"
  ([corporation-id ] (get-loyalty-stores-corporation-id-offers corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-loyalty-stores-corporation-id-offers-with-http-info corporation-id optional-params))))

