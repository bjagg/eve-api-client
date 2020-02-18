(ns eve-api-client.api.planetary-interaction
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-characters-character-id-planets-with-http-info
  "Get colonies
  Returns a list of all planetary colonies owned by a character.

---

This route is cached for up to 600 seconds"
  ([character-id ] (get-characters-character-id-planets-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/planets/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-planets
  "Get colonies
  Returns a list of all planetary colonies owned by a character.

---

This route is cached for up to 600 seconds"
  ([character-id ] (get-characters-character-id-planets character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-planets-with-http-info character-id optional-params))))

(defn get-characters-character-id-planets-planet-id-with-http-info
  "Get colony layout
  Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.

---

This route is cached for up to 600 seconds"
  ([character-id planet-id ] (get-characters-character-id-planets-planet-id-with-http-info character-id planet-id nil))
  ([character-id planet-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id planet-id)
   (call-api "/v3/characters/{character_id}/planets/{planet_id}/" :get
             {:path-params   {"character_id" character-id "planet_id" planet-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-planets-planet-id
  "Get colony layout
  Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.

---

This route is cached for up to 600 seconds"
  ([character-id planet-id ] (get-characters-character-id-planets-planet-id character-id planet-id nil))
  ([character-id planet-id optional-params]
   (:data (get-characters-character-id-planets-planet-id-with-http-info character-id planet-id optional-params))))

(defn get-corporations-corporation-id-customs-offices-with-http-info
  "List corporation customs offices
  List customs offices owned by a corporation

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-customs-offices-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporations/{corporation_id}/customs_offices/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-customs-offices
  "List corporation customs offices
  List customs offices owned by a corporation

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-customs-offices corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-customs-offices-with-http-info corporation-id optional-params))))

(defn get-universe-schematics-schematic-id-with-http-info
  "Get schematic information
  Get information on a planetary factory schematic

---

This route is cached for up to 3600 seconds"
  ([schematic-id ] (get-universe-schematics-schematic-id-with-http-info schematic-id nil))
  ([schematic-id {:keys [datasource if-none-match ]}]
   (check-required-params schematic-id)
   (call-api "/v1/universe/schematics/{schematic_id}/" :get
             {:path-params   {"schematic_id" schematic-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-schematics-schematic-id
  "Get schematic information
  Get information on a planetary factory schematic

---

This route is cached for up to 3600 seconds"
  ([schematic-id ] (get-universe-schematics-schematic-id schematic-id nil))
  ([schematic-id optional-params]
   (:data (get-universe-schematics-schematic-id-with-http-info schematic-id optional-params))))

