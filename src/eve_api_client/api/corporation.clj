(ns eve-api-client.api.corporation
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-api-client.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-corporations-corporation-id-with-http-info
  "Get corporation information
  Public information about a corporation

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match ]}]
   (check-required-params corporation-id)
   (call-api "/v5/corporations/{corporation_id}/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-corporations-corporation-id
  "Get corporation information
  Public information about a corporation

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-alliancehistory-with-http-info
  "Get alliance history
  Get a list of all the alliances a corporation has been a member of

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-alliancehistory-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match ]}]
   (check-required-params corporation-id)
   (call-api "/v3/corporations/{corporation_id}/alliancehistory/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-corporations-corporation-id-alliancehistory
  "Get alliance history
  Get a list of all the alliances a corporation has been a member of

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-alliancehistory corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-alliancehistory-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-blueprints-with-http-info
  "Get corporation blueprints
  Returns a list of blueprints the corporation owns

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-blueprints-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v3/corporations/{corporation_id}/blueprints/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-blueprints
  "Get corporation blueprints
  Returns a list of blueprints the corporation owns

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-blueprints corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-blueprints-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-containers-logs-with-http-info
  "Get all corporation ALSC logs
  Returns logs recorded in the past seven days from all audit log secure containers (ALSC) owned by a given corporation

---

This route is cached for up to 600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-containers-logs-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v3/corporations/{corporation_id}/containers/logs/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-containers-logs
  "Get all corporation ALSC logs
  Returns logs recorded in the past seven days from all audit log secure containers (ALSC) owned by a given corporation

---

This route is cached for up to 600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-containers-logs corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-containers-logs-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-divisions-with-http-info
  "Get corporation divisions
  Return corporation hangar and wallet division names, only show if a division is not using the default name

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-divisions-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/divisions/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-divisions
  "Get corporation divisions
  Return corporation hangar and wallet division names, only show if a division is not using the default name

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-divisions corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-divisions-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-facilities-with-http-info
  "Get corporation facilities
  Return a corporation's facilities

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Factory_Manager"
  ([corporation-id ] (get-corporations-corporation-id-facilities-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/facilities/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-facilities
  "Get corporation facilities
  Return a corporation's facilities

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Factory_Manager"
  ([corporation-id ] (get-corporations-corporation-id-facilities corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-facilities-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-icons-with-http-info
  "Get corporation icon
  Get the icon urls for a corporation

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-icons-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/icons/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-corporations-corporation-id-icons
  "Get corporation icon
  Get the icon urls for a corporation

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-icons corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-icons-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-medals-with-http-info
  "Get corporation medals
  Returns a corporation's medals

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-medals-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/medals/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-medals
  "Get corporation medals
  Returns a corporation's medals

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-medals corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-medals-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-medals-issued-with-http-info
  "Get corporation issued medals
  Returns medals issued by a corporation

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-medals-issued-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/medals/issued/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-medals-issued
  "Get corporation issued medals
  Returns medals issued by a corporation

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-medals-issued corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-medals-issued-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-members-with-http-info
  "Get corporation members
  Return the current member list of a corporation, the token's character need to be a member of the corporation.

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-members-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id)
   (call-api "/v4/corporations/{corporation_id}/members/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-members
  "Get corporation members
  Return the current member list of a corporation, the token's character need to be a member of the corporation.

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-members corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-members-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-members-limit-with-http-info
  "Get corporation member limit
  Return a corporation's member limit, not including CEO himself

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-members-limit-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/members/limit/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-members-limit
  "Get corporation member limit
  Return a corporation's member limit, not including CEO himself

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-members-limit corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-members-limit-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-members-titles-with-http-info
  "Get corporation's members' titles
  Returns a corporation's members' titles

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-members-titles-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/members/titles/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-members-titles
  "Get corporation's members' titles
  Returns a corporation's members' titles

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-members-titles corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-members-titles-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-membertracking-with-http-info
  "Track corporation members
  Returns additional information about a corporation's members which helps tracking their activities

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-membertracking-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/membertracking/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-membertracking
  "Track corporation members
  Returns additional information about a corporation's members which helps tracking their activities

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-membertracking corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-membertracking-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-roles-with-http-info
  "Get corporation member roles
  Return the roles of all members if the character has the personnel manager role or any grantable role.

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-roles-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/roles/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-roles
  "Get corporation member roles
  Return the roles of all members if the character has the personnel manager role or any grantable role.

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-roles corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-roles-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-roles-history-with-http-info
  "Get corporation member roles history
  Return how roles have changed for a coporation's members, up to a month

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-roles-history-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/roles/history/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-roles-history
  "Get corporation member roles history
  Return how roles have changed for a coporation's members, up to a month

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-roles-history corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-roles-history-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-shareholders-with-http-info
  "Get corporation shareholders
  Return the current shareholders of a corporation.

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-shareholders-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporations/{corporation_id}/shareholders/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-shareholders
  "Get corporation shareholders
  Return the current shareholders of a corporation.

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-shareholders corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-shareholders-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-standings-with-http-info
  "Get corporation standings
  Return corporation standings from agents, NPC corporations, and factions

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-standings-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/standings/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-standings
  "Get corporation standings
  Return corporation standings from agents, NPC corporations, and factions

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-standings corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-standings-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-starbases-with-http-info
  "Get corporation starbases (POSes)
  Returns list of corporation starbases (POSes)

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-starbases-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/starbases/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-starbases
  "Get corporation starbases (POSes)
  Returns list of corporation starbases (POSes)

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-starbases corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-starbases-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-starbases-starbase-id-with-http-info
  "Get starbase (POS) detail
  Returns various settings and fuels of a starbase (POS)

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id starbase-id system-id ] (get-corporations-corporation-id-starbases-starbase-id-with-http-info corporation-id starbase-id system-id nil))
  ([corporation-id starbase-id system-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id starbase-id system-id)
   (call-api "/v2/corporations/{corporation_id}/starbases/{starbase_id}/" :get
             {:path-params   {"corporation_id" corporation-id "starbase_id" starbase-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "system_id" system-id "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-starbases-starbase-id
  "Get starbase (POS) detail
  Returns various settings and fuels of a starbase (POS)

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id starbase-id system-id ] (get-corporations-corporation-id-starbases-starbase-id corporation-id starbase-id system-id nil))
  ([corporation-id starbase-id system-id optional-params]
   (:data (get-corporations-corporation-id-starbases-starbase-id-with-http-info corporation-id starbase-id system-id optional-params))))

(defn get-corporations-corporation-id-structures-with-http-info
  "Get corporation structures
  Get a list of corporation structures. This route's version includes the changes to structures detailed in this blog: https://www.eveonline.com/article/upwell-2.0-structures-changes-coming-on-february-13th

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Station_Manager"
  ([corporation-id ] (get-corporations-corporation-id-structures-with-http-info corporation-id nil))
  ([corporation-id {:keys [accept-language datasource if-none-match language page token ]}]
   (check-required-params corporation-id)
   (call-api "/v4/corporations/{corporation_id}/structures/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-structures
  "Get corporation structures
  Get a list of corporation structures. This route's version includes the changes to structures detailed in this blog: https://www.eveonline.com/article/upwell-2.0-structures-changes-coming-on-february-13th

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Station_Manager"
  ([corporation-id ] (get-corporations-corporation-id-structures corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-structures-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-titles-with-http-info
  "Get corporation titles
  Returns a corporation's titles

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-titles-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/titles/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-titles
  "Get corporation titles
  Returns a corporation's titles

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-titles corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-titles-with-http-info corporation-id optional-params))))

(defn get-corporations-npccorps-with-http-info
  "Get npc corporations
  Get a list of npc corporations

---

This route expires daily at 11:05"
  ([] (get-corporations-npccorps-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v2/corporations/npccorps/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-corporations-npccorps
  "Get npc corporations
  Get a list of npc corporations

---

This route expires daily at 11:05"
  ([] (get-corporations-npccorps nil))
  ([optional-params]
   (:data (get-corporations-npccorps-with-http-info optional-params))))

