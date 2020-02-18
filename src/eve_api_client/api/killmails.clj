(ns eve-api-client.api.killmails
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-characters-character-id-killmails-recent-with-http-info
  "Get a character's recent kills and losses
  Return a list of a character's kills and losses going back 90 days

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-killmails-recent-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match page token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/killmails/recent/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-killmails-recent
  "Get a character's recent kills and losses
  Return a list of a character's kills and losses going back 90 days

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-killmails-recent character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-killmails-recent-with-http-info character-id optional-params))))

(defn get-corporations-corporation-id-killmails-recent-with-http-info
  "Get a corporation's recent kills and losses
  Get a list of a corporation's kills and losses going back 90 days

---

This route is cached for up to 300 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-killmails-recent-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporations/{corporation_id}/killmails/recent/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-killmails-recent
  "Get a corporation's recent kills and losses
  Get a list of a corporation's kills and losses going back 90 days

---

This route is cached for up to 300 seconds

---
Requires one of the following EVE corporation role(s): Director"
  ([corporation-id ] (get-corporations-corporation-id-killmails-recent corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-killmails-recent-with-http-info corporation-id optional-params))))

(defn get-killmails-killmail-id-killmail-hash-with-http-info
  "Get a single killmail
  Return a single killmail from its ID and hash

---

This route is cached for up to 30758400 seconds"
  ([killmail-hash killmail-id ] (get-killmails-killmail-id-killmail-hash-with-http-info killmail-hash killmail-id nil))
  ([killmail-hash killmail-id {:keys [datasource if-none-match ]}]
   (check-required-params killmail-hash killmail-id)
   (call-api "/v1/killmails/{killmail_id}/{killmail_hash}/" :get
             {:path-params   {"killmail_hash" killmail-hash "killmail_id" killmail-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-killmails-killmail-id-killmail-hash
  "Get a single killmail
  Return a single killmail from its ID and hash

---

This route is cached for up to 30758400 seconds"
  ([killmail-hash killmail-id ] (get-killmails-killmail-id-killmail-hash killmail-hash killmail-id nil))
  ([killmail-hash killmail-id optional-params]
   (:data (get-killmails-killmail-id-killmail-hash-with-http-info killmail-hash killmail-id optional-params))))

