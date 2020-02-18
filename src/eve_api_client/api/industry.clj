(ns eve-api-client.api.industry
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-characters-character-id-industry-jobs-with-http-info
  "List character industry jobs
  List industry jobs placed by a character

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-industry-jobs-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match include-completed token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/industry/jobs/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "include_completed" include-completed "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-industry-jobs
  "List character industry jobs
  List industry jobs placed by a character

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-industry-jobs character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-industry-jobs-with-http-info character-id optional-params))))

(defn get-characters-character-id-mining-with-http-info
  "Character mining ledger
  Paginated record of all mining done by a character for the past 30 days

---

This route is cached for up to 600 seconds"
  ([character-id ] (get-characters-character-id-mining-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match page token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/mining/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-mining
  "Character mining ledger
  Paginated record of all mining done by a character for the past 30 days

---

This route is cached for up to 600 seconds"
  ([character-id ] (get-characters-character-id-mining character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-mining-with-http-info character-id optional-params))))

(defn get-corporation-corporation-id-mining-extractions-with-http-info
  "Moon extraction timers
  Extraction timers for all moon chunks being extracted by refineries belonging to a corporation.

---

This route is cached for up to 1800 seconds

---
Requires one of the following EVE corporation role(s): Station_Manager"
  ([corporation-id ] (get-corporation-corporation-id-mining-extractions-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporation/{corporation_id}/mining/extractions/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporation-corporation-id-mining-extractions
  "Moon extraction timers
  Extraction timers for all moon chunks being extracted by refineries belonging to a corporation.

---

This route is cached for up to 1800 seconds

---
Requires one of the following EVE corporation role(s): Station_Manager"
  ([corporation-id ] (get-corporation-corporation-id-mining-extractions corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporation-corporation-id-mining-extractions-with-http-info corporation-id optional-params))))

(defn get-corporation-corporation-id-mining-observers-with-http-info
  "Corporation mining observers
  Paginated list of all entities capable of observing and recording mining for a corporation

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Accountant"
  ([corporation-id ] (get-corporation-corporation-id-mining-observers-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporation/{corporation_id}/mining/observers/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporation-corporation-id-mining-observers
  "Corporation mining observers
  Paginated list of all entities capable of observing and recording mining for a corporation

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Accountant"
  ([corporation-id ] (get-corporation-corporation-id-mining-observers corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporation-corporation-id-mining-observers-with-http-info corporation-id optional-params))))

(defn get-corporation-corporation-id-mining-observers-observer-id-with-http-info
  "Observed corporation mining
  Paginated record of all mining seen by an observer

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Accountant"
  ([corporation-id observer-id ] (get-corporation-corporation-id-mining-observers-observer-id-with-http-info corporation-id observer-id nil))
  ([corporation-id observer-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id observer-id)
   (call-api "/v1/corporation/{corporation_id}/mining/observers/{observer_id}/" :get
             {:path-params   {"corporation_id" corporation-id "observer_id" observer-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporation-corporation-id-mining-observers-observer-id
  "Observed corporation mining
  Paginated record of all mining seen by an observer

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Accountant"
  ([corporation-id observer-id ] (get-corporation-corporation-id-mining-observers-observer-id corporation-id observer-id nil))
  ([corporation-id observer-id optional-params]
   (:data (get-corporation-corporation-id-mining-observers-observer-id-with-http-info corporation-id observer-id optional-params))))

(defn get-corporations-corporation-id-industry-jobs-with-http-info
  "List corporation industry jobs
  List industry jobs run by a corporation

---

This route is cached for up to 300 seconds

---
Requires one of the following EVE corporation role(s): Factory_Manager"
  ([corporation-id ] (get-corporations-corporation-id-industry-jobs-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match include-completed page token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporations/{corporation_id}/industry/jobs/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "include_completed" include-completed "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-industry-jobs
  "List corporation industry jobs
  List industry jobs run by a corporation

---

This route is cached for up to 300 seconds

---
Requires one of the following EVE corporation role(s): Factory_Manager"
  ([corporation-id ] (get-corporations-corporation-id-industry-jobs corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-industry-jobs-with-http-info corporation-id optional-params))))

(defn get-industry-facilities-with-http-info
  "List industry facilities
  Return a list of industry facilities

---

This route is cached for up to 3600 seconds"
  ([] (get-industry-facilities-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/industry/facilities/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-industry-facilities
  "List industry facilities
  Return a list of industry facilities

---

This route is cached for up to 3600 seconds"
  ([] (get-industry-facilities nil))
  ([optional-params]
   (:data (get-industry-facilities-with-http-info optional-params))))

(defn get-industry-systems-with-http-info
  "List solar system cost indices
  Return cost indices for solar systems

---

This route is cached for up to 3600 seconds"
  ([] (get-industry-systems-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/industry/systems/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-industry-systems
  "List solar system cost indices
  Return cost indices for solar systems

---

This route is cached for up to 3600 seconds"
  ([] (get-industry-systems nil))
  ([optional-params]
   (:data (get-industry-systems-with-http-info optional-params))))

