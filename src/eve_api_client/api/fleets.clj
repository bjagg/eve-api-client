(ns eve-api-client.api.fleets
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn delete-fleets-fleet-id-members-member-id-with-http-info
  "Kick fleet member
  Kick a fleet member

---"
  ([fleet-id member-id ] (delete-fleets-fleet-id-members-member-id-with-http-info fleet-id member-id nil))
  ([fleet-id member-id {:keys [datasource token ]}]
   (check-required-params fleet-id member-id)
   (call-api "/v1/fleets/{fleet_id}/members/{member_id}/" :delete
             {:path-params   {"fleet_id" fleet-id "member_id" member-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn delete-fleets-fleet-id-members-member-id
  "Kick fleet member
  Kick a fleet member

---"
  ([fleet-id member-id ] (delete-fleets-fleet-id-members-member-id fleet-id member-id nil))
  ([fleet-id member-id optional-params]
   (:data (delete-fleets-fleet-id-members-member-id-with-http-info fleet-id member-id optional-params))))

(defn delete-fleets-fleet-id-squads-squad-id-with-http-info
  "Delete fleet squad
  Delete a fleet squad, only empty squads can be deleted

---"
  ([fleet-id squad-id ] (delete-fleets-fleet-id-squads-squad-id-with-http-info fleet-id squad-id nil))
  ([fleet-id squad-id {:keys [datasource token ]}]
   (check-required-params fleet-id squad-id)
   (call-api "/v1/fleets/{fleet_id}/squads/{squad_id}/" :delete
             {:path-params   {"fleet_id" fleet-id "squad_id" squad-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn delete-fleets-fleet-id-squads-squad-id
  "Delete fleet squad
  Delete a fleet squad, only empty squads can be deleted

---"
  ([fleet-id squad-id ] (delete-fleets-fleet-id-squads-squad-id fleet-id squad-id nil))
  ([fleet-id squad-id optional-params]
   (:data (delete-fleets-fleet-id-squads-squad-id-with-http-info fleet-id squad-id optional-params))))

(defn delete-fleets-fleet-id-wings-wing-id-with-http-info
  "Delete fleet wing
  Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty

---"
  ([fleet-id wing-id ] (delete-fleets-fleet-id-wings-wing-id-with-http-info fleet-id wing-id nil))
  ([fleet-id wing-id {:keys [datasource token ]}]
   (check-required-params fleet-id wing-id)
   (call-api "/v1/fleets/{fleet_id}/wings/{wing_id}/" :delete
             {:path-params   {"fleet_id" fleet-id "wing_id" wing-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn delete-fleets-fleet-id-wings-wing-id
  "Delete fleet wing
  Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty

---"
  ([fleet-id wing-id ] (delete-fleets-fleet-id-wings-wing-id fleet-id wing-id nil))
  ([fleet-id wing-id optional-params]
   (:data (delete-fleets-fleet-id-wings-wing-id-with-http-info fleet-id wing-id optional-params))))

(defn get-characters-character-id-fleet-with-http-info
  "Get character fleet info
  Return the fleet ID the character is in, if any.

---

This route is cached for up to 60 seconds

---
Warning: This route has an upgrade available

---
[Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/fleet/)"
  ([character-id ] (get-characters-character-id-fleet-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/fleet/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-fleet
  "Get character fleet info
  Return the fleet ID the character is in, if any.

---

This route is cached for up to 60 seconds

---
Warning: This route has an upgrade available

---
[Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/fleet/)"
  ([character-id ] (get-characters-character-id-fleet character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-fleet-with-http-info character-id optional-params))))

(defn get-fleets-fleet-id-with-http-info
  "Get fleet information
  Return details about a fleet

---

This route is cached for up to 5 seconds"
  ([fleet-id ] (get-fleets-fleet-id-with-http-info fleet-id nil))
  ([fleet-id {:keys [datasource if-none-match token ]}]
   (check-required-params fleet-id)
   (call-api "/v1/fleets/{fleet_id}/" :get
             {:path-params   {"fleet_id" fleet-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-fleets-fleet-id
  "Get fleet information
  Return details about a fleet

---

This route is cached for up to 5 seconds"
  ([fleet-id ] (get-fleets-fleet-id fleet-id nil))
  ([fleet-id optional-params]
   (:data (get-fleets-fleet-id-with-http-info fleet-id optional-params))))

(defn get-fleets-fleet-id-members-with-http-info
  "Get fleet members
  Return information about fleet members

---

This route is cached for up to 5 seconds"
  ([fleet-id ] (get-fleets-fleet-id-members-with-http-info fleet-id nil))
  ([fleet-id {:keys [accept-language datasource if-none-match language token ]}]
   (check-required-params fleet-id)
   (call-api "/v1/fleets/{fleet_id}/members/" :get
             {:path-params   {"fleet_id" fleet-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-fleets-fleet-id-members
  "Get fleet members
  Return information about fleet members

---

This route is cached for up to 5 seconds"
  ([fleet-id ] (get-fleets-fleet-id-members fleet-id nil))
  ([fleet-id optional-params]
   (:data (get-fleets-fleet-id-members-with-http-info fleet-id optional-params))))

(defn get-fleets-fleet-id-wings-with-http-info
  "Get fleet wings
  Return information about wings in a fleet

---

This route is cached for up to 5 seconds"
  ([fleet-id ] (get-fleets-fleet-id-wings-with-http-info fleet-id nil))
  ([fleet-id {:keys [accept-language datasource if-none-match language token ]}]
   (check-required-params fleet-id)
   (call-api "/v1/fleets/{fleet_id}/wings/" :get
             {:path-params   {"fleet_id" fleet-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-fleets-fleet-id-wings
  "Get fleet wings
  Return information about wings in a fleet

---

This route is cached for up to 5 seconds"
  ([fleet-id ] (get-fleets-fleet-id-wings fleet-id nil))
  ([fleet-id optional-params]
   (:data (get-fleets-fleet-id-wings-with-http-info fleet-id optional-params))))

(defn post-fleets-fleet-id-members-with-http-info
  "Create fleet invitation
  Invite a character into the fleet. If a character has a CSPA charge set it is not possible to invite them to the fleet using ESI

---"
  ([fleet-id invitation ] (post-fleets-fleet-id-members-with-http-info fleet-id invitation nil))
  ([fleet-id invitation {:keys [datasource token ]}]
   (check-required-params fleet-id invitation)
   (call-api "/v1/fleets/{fleet_id}/members/" :post
             {:path-params   {"fleet_id" fleet-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    invitation
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-fleets-fleet-id-members
  "Create fleet invitation
  Invite a character into the fleet. If a character has a CSPA charge set it is not possible to invite them to the fleet using ESI

---"
  ([fleet-id invitation ] (post-fleets-fleet-id-members fleet-id invitation nil))
  ([fleet-id invitation optional-params]
   (:data (post-fleets-fleet-id-members-with-http-info fleet-id invitation optional-params))))

(defn post-fleets-fleet-id-wings-with-http-info
  "Create fleet wing
  Create a new wing in a fleet

---"
  ([fleet-id ] (post-fleets-fleet-id-wings-with-http-info fleet-id nil))
  ([fleet-id {:keys [datasource token ]}]
   (check-required-params fleet-id)
   (call-api "/v1/fleets/{fleet_id}/wings/" :post
             {:path-params   {"fleet_id" fleet-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-fleets-fleet-id-wings
  "Create fleet wing
  Create a new wing in a fleet

---"
  ([fleet-id ] (post-fleets-fleet-id-wings fleet-id nil))
  ([fleet-id optional-params]
   (:data (post-fleets-fleet-id-wings-with-http-info fleet-id optional-params))))

(defn post-fleets-fleet-id-wings-wing-id-squads-with-http-info
  "Create fleet squad
  Create a new squad in a fleet

---"
  ([fleet-id wing-id ] (post-fleets-fleet-id-wings-wing-id-squads-with-http-info fleet-id wing-id nil))
  ([fleet-id wing-id {:keys [datasource token ]}]
   (check-required-params fleet-id wing-id)
   (call-api "/v1/fleets/{fleet_id}/wings/{wing_id}/squads/" :post
             {:path-params   {"fleet_id" fleet-id "wing_id" wing-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-fleets-fleet-id-wings-wing-id-squads
  "Create fleet squad
  Create a new squad in a fleet

---"
  ([fleet-id wing-id ] (post-fleets-fleet-id-wings-wing-id-squads fleet-id wing-id nil))
  ([fleet-id wing-id optional-params]
   (:data (post-fleets-fleet-id-wings-wing-id-squads-with-http-info fleet-id wing-id optional-params))))

(defn put-fleets-fleet-id-with-http-info
  "Update fleet
  Update settings about a fleet

---"
  ([fleet-id new-settings ] (put-fleets-fleet-id-with-http-info fleet-id new-settings nil))
  ([fleet-id new-settings {:keys [datasource token ]}]
   (check-required-params fleet-id new-settings)
   (call-api "/v1/fleets/{fleet_id}/" :put
             {:path-params   {"fleet_id" fleet-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    new-settings
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn put-fleets-fleet-id
  "Update fleet
  Update settings about a fleet

---"
  ([fleet-id new-settings ] (put-fleets-fleet-id fleet-id new-settings nil))
  ([fleet-id new-settings optional-params]
   (:data (put-fleets-fleet-id-with-http-info fleet-id new-settings optional-params))))

(defn put-fleets-fleet-id-members-member-id-with-http-info
  "Move fleet member
  Move a fleet member around

---"
  ([fleet-id member-id movement ] (put-fleets-fleet-id-members-member-id-with-http-info fleet-id member-id movement nil))
  ([fleet-id member-id movement {:keys [datasource token ]}]
   (check-required-params fleet-id member-id movement)
   (call-api "/v1/fleets/{fleet_id}/members/{member_id}/" :put
             {:path-params   {"fleet_id" fleet-id "member_id" member-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    movement
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn put-fleets-fleet-id-members-member-id
  "Move fleet member
  Move a fleet member around

---"
  ([fleet-id member-id movement ] (put-fleets-fleet-id-members-member-id fleet-id member-id movement nil))
  ([fleet-id member-id movement optional-params]
   (:data (put-fleets-fleet-id-members-member-id-with-http-info fleet-id member-id movement optional-params))))

(defn put-fleets-fleet-id-squads-squad-id-with-http-info
  "Rename fleet squad
  Rename a fleet squad

---"
  ([fleet-id naming squad-id ] (put-fleets-fleet-id-squads-squad-id-with-http-info fleet-id naming squad-id nil))
  ([fleet-id naming squad-id {:keys [datasource token ]}]
   (check-required-params fleet-id naming squad-id)
   (call-api "/v1/fleets/{fleet_id}/squads/{squad_id}/" :put
             {:path-params   {"fleet_id" fleet-id "squad_id" squad-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    naming
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn put-fleets-fleet-id-squads-squad-id
  "Rename fleet squad
  Rename a fleet squad

---"
  ([fleet-id naming squad-id ] (put-fleets-fleet-id-squads-squad-id fleet-id naming squad-id nil))
  ([fleet-id naming squad-id optional-params]
   (:data (put-fleets-fleet-id-squads-squad-id-with-http-info fleet-id naming squad-id optional-params))))

(defn put-fleets-fleet-id-wings-wing-id-with-http-info
  "Rename fleet wing
  Rename a fleet wing

---"
  ([fleet-id naming wing-id ] (put-fleets-fleet-id-wings-wing-id-with-http-info fleet-id naming wing-id nil))
  ([fleet-id naming wing-id {:keys [datasource token ]}]
   (check-required-params fleet-id naming wing-id)
   (call-api "/v1/fleets/{fleet_id}/wings/{wing_id}/" :put
             {:path-params   {"fleet_id" fleet-id "wing_id" wing-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    naming
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn put-fleets-fleet-id-wings-wing-id
  "Rename fleet wing
  Rename a fleet wing

---"
  ([fleet-id naming wing-id ] (put-fleets-fleet-id-wings-wing-id fleet-id naming wing-id nil))
  ([fleet-id naming wing-id optional-params]
   (:data (put-fleets-fleet-id-wings-wing-id-with-http-info fleet-id naming wing-id optional-params))))

