(ns eve-api-client.api.clones
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-characters-character-id-clones-with-http-info
  "Get clones
  A list of the character's clones

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-clones-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v3/characters/{character_id}/clones/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-clones
  "Get clones
  A list of the character's clones

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-clones character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-clones-with-http-info character-id optional-params))))

(defn get-characters-character-id-implants-with-http-info
  "Get active implants
  Return implants on the active clone of a character

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-implants-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/implants/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-implants
  "Get active implants
  Return implants on the active clone of a character

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-implants character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-implants-with-http-info character-id optional-params))))

