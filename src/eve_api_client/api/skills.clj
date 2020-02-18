(ns eve-api-client.api.skills
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-characters-character-id-attributes-with-http-info
  "Get character attributes
  Return attributes of a character

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-attributes-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/attributes/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-attributes
  "Get character attributes
  Return attributes of a character

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-attributes character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-attributes-with-http-info character-id optional-params))))

(defn get-characters-character-id-skillqueue-with-http-info
  "Get character's skill queue
  List the configured skill queue for the given character

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-skillqueue-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/skillqueue/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-skillqueue
  "Get character's skill queue
  List the configured skill queue for the given character

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-skillqueue character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-skillqueue-with-http-info character-id optional-params))))

(defn get-characters-character-id-skills-with-http-info
  "Get character skills
  List all trained skills for the given character

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-skills-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v4/characters/{character_id}/skills/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-skills
  "Get character skills
  List all trained skills for the given character

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-skills character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-skills-with-http-info character-id optional-params))))

