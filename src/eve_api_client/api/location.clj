(ns eve-api-client.api.location
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-swagger-interface.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-characters-character-id-location-with-http-info
  "Get character location
  Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable

---

This route is cached for up to 5 seconds"
  ([character-id ] (get-characters-character-id-location-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/location/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-location
  "Get character location
  Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable

---

This route is cached for up to 5 seconds"
  ([character-id ] (get-characters-character-id-location character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-location-with-http-info character-id optional-params))))

(defn get-characters-character-id-online-with-http-info
  "Get character online
  Checks if the character is currently online

---

This route is cached for up to 60 seconds"
  ([character-id ] (get-characters-character-id-online-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/online/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-online
  "Get character online
  Checks if the character is currently online

---

This route is cached for up to 60 seconds"
  ([character-id ] (get-characters-character-id-online character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-online-with-http-info character-id optional-params))))

(defn get-characters-character-id-ship-with-http-info
  "Get current ship
  Get the current ship type, name and id

---

This route is cached for up to 5 seconds"
  ([character-id ] (get-characters-character-id-ship-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/ship/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-ship
  "Get current ship
  Get the current ship type, name and id

---

This route is cached for up to 5 seconds"
  ([character-id ] (get-characters-character-id-ship character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-ship-with-http-info character-id optional-params))))

