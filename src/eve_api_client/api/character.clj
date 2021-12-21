(ns eve-api-client.api.character
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-swagger-interface.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-characters-character-id-with-http-info
  "Get character's public information
  Public information about a character

---

This route is cached for up to 86400 seconds"
  ([character-id ] (get-characters-character-id-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match ]}]
   (check-required-params character-id)
   (call-api "/v5/characters/{character_id}/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-characters-character-id
  "Get character's public information
  Public information about a character

---

This route is cached for up to 86400 seconds"
  ([character-id ] (get-characters-character-id character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-with-http-info character-id optional-params))))

(defn get-characters-character-id-agents-research-with-http-info
  "Get agents research
  Return a list of agents research information for a character. The formula for finding the current research points with an agent is: currentPoints = remainderPoints + pointsPerDay * days(currentTime - researchStartDate)

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-agents-research-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/agents_research/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-agents-research
  "Get agents research
  Return a list of agents research information for a character. The formula for finding the current research points with an agent is: currentPoints = remainderPoints + pointsPerDay * days(currentTime - researchStartDate)

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-agents-research character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-agents-research-with-http-info character-id optional-params))))

(defn get-characters-character-id-blueprints-with-http-info
  "Get blueprints
  Return a list of blueprints the character owns

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-blueprints-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match page token ]}]
   (check-required-params character-id)
   (call-api "/v3/characters/{character_id}/blueprints/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-blueprints
  "Get blueprints
  Return a list of blueprints the character owns

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-blueprints character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-blueprints-with-http-info character-id optional-params))))

(defn get-characters-character-id-corporationhistory-with-http-info
  "Get corporation history
  Get a list of all the corporations a character has been a member of

---

This route is cached for up to 86400 seconds"
  ([character-id ] (get-characters-character-id-corporationhistory-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/corporationhistory/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-characters-character-id-corporationhistory
  "Get corporation history
  Get a list of all the corporations a character has been a member of

---

This route is cached for up to 86400 seconds"
  ([character-id ] (get-characters-character-id-corporationhistory character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-corporationhistory-with-http-info character-id optional-params))))

(defn get-characters-character-id-fatigue-with-http-info
  "Get jump fatigue
  Return a character's jump activation and fatigue information

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-fatigue-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/fatigue/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-fatigue
  "Get jump fatigue
  Return a character's jump activation and fatigue information

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-fatigue character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-fatigue-with-http-info character-id optional-params))))

(defn get-characters-character-id-medals-with-http-info
  "Get medals
  Return a list of medals the character has

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-medals-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/medals/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-medals
  "Get medals
  Return a list of medals the character has

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-medals character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-medals-with-http-info character-id optional-params))))

(defn get-characters-character-id-notifications-with-http-info
  "Get character notifications
  Return character notifications

---

This route is cached for up to 600 seconds"
  ([character-id ] (get-characters-character-id-notifications-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v5/characters/{character_id}/notifications/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-notifications
  "Get character notifications
  Return character notifications

---

This route is cached for up to 600 seconds"
  ([character-id ] (get-characters-character-id-notifications character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-notifications-with-http-info character-id optional-params))))

(defn get-characters-character-id-notifications-contacts-with-http-info
  "Get new contact notifications
  Return notifications about having been added to someone's contact list

---

This route is cached for up to 600 seconds"
  ([character-id ] (get-characters-character-id-notifications-contacts-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/notifications/contacts/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-notifications-contacts
  "Get new contact notifications
  Return notifications about having been added to someone's contact list

---

This route is cached for up to 600 seconds"
  ([character-id ] (get-characters-character-id-notifications-contacts character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-notifications-contacts-with-http-info character-id optional-params))))

(defn get-characters-character-id-portrait-with-http-info
  "Get character portraits
  Get portrait urls for a character

---

This route expires daily at 11:05"
  ([character-id ] (get-characters-character-id-portrait-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/portrait/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-characters-character-id-portrait
  "Get character portraits
  Get portrait urls for a character

---

This route expires daily at 11:05"
  ([character-id ] (get-characters-character-id-portrait character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-portrait-with-http-info character-id optional-params))))

(defn get-characters-character-id-roles-with-http-info
  "Get character corporation roles
  Returns a character's corporation roles

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-roles-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v3/characters/{character_id}/roles/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-roles
  "Get character corporation roles
  Returns a character's corporation roles

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-roles character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-roles-with-http-info character-id optional-params))))

(defn get-characters-character-id-standings-with-http-info
  "Get standings
  Return character standings from agents, NPC corporations, and factions

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-standings-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/standings/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-standings
  "Get standings
  Return character standings from agents, NPC corporations, and factions

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-standings character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-standings-with-http-info character-id optional-params))))

(defn get-characters-character-id-titles-with-http-info
  "Get character corporation titles
  Returns a character's titles

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-titles-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/titles/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-titles
  "Get character corporation titles
  Returns a character's titles

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-titles character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-titles-with-http-info character-id optional-params))))

(defn post-characters-affiliation-with-http-info
  "Character affiliation
  Bulk lookup of character IDs to corporation, alliance and faction

---

This route is cached for up to 3600 seconds"
  ([characters ] (post-characters-affiliation-with-http-info characters nil))
  ([characters {:keys [datasource ]}]
   (check-required-params characters)
   (call-api "/v2/characters/affiliation/" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"datasource" datasource }
              :form-params   {}
              :body-param    characters
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn post-characters-affiliation
  "Character affiliation
  Bulk lookup of character IDs to corporation, alliance and faction

---

This route is cached for up to 3600 seconds"
  ([characters ] (post-characters-affiliation characters nil))
  ([characters optional-params]
   (:data (post-characters-affiliation-with-http-info characters optional-params))))

(defn post-characters-character-id-cspa-with-http-info
  "Calculate a CSPA charge cost
  Takes a source character ID in the url and a set of target character ID's in the body, returns a CSPA charge cost

---"
  ([character-id characters ] (post-characters-character-id-cspa-with-http-info character-id characters nil))
  ([character-id characters {:keys [datasource token ]}]
   (check-required-params character-id characters)
   (call-api "/v5/characters/{character_id}/cspa/" :post
             {:path-params   {"character_id" character-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    characters
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-characters-character-id-cspa
  "Calculate a CSPA charge cost
  Takes a source character ID in the url and a set of target character ID's in the body, returns a CSPA charge cost

---"
  ([character-id characters ] (post-characters-character-id-cspa character-id characters nil))
  ([character-id characters optional-params]
   (:data (post-characters-character-id-cspa-with-http-info character-id characters optional-params))))

