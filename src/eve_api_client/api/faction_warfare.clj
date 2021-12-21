(ns eve-api-client.api.faction-warfare
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-characters-character-id-fw-stats-with-http-info
  "Overview of a character involved in faction warfare
  Statistical overview of a character involved in faction warfare

---

This route expires daily at 11:05"
  ([character-id ] (get-characters-character-id-fw-stats-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/fw/stats/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-fw-stats
  "Overview of a character involved in faction warfare
  Statistical overview of a character involved in faction warfare

---

This route expires daily at 11:05"
  ([character-id ] (get-characters-character-id-fw-stats character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-fw-stats-with-http-info character-id optional-params))))

(defn get-corporations-corporation-id-fw-stats-with-http-info
  "Overview of a corporation involved in faction warfare
  Statistics about a corporation involved in faction warfare

---

This route expires daily at 11:05"
  ([corporation-id ] (get-corporations-corporation-id-fw-stats-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporations/{corporation_id}/fw/stats/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-fw-stats
  "Overview of a corporation involved in faction warfare
  Statistics about a corporation involved in faction warfare

---

This route expires daily at 11:05"
  ([corporation-id ] (get-corporations-corporation-id-fw-stats corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-fw-stats-with-http-info corporation-id optional-params))))

(defn get-fw-leaderboards-with-http-info
  "List of the top factions in faction warfare
  Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday

---

This route expires daily at 11:05"
  ([] (get-fw-leaderboards-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/fw/leaderboards/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-fw-leaderboards
  "List of the top factions in faction warfare
  Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday

---

This route expires daily at 11:05"
  ([] (get-fw-leaderboards nil))
  ([optional-params]
   (:data (get-fw-leaderboards-with-http-info optional-params))))

(defn get-fw-leaderboards-characters-with-http-info
  "List of the top pilots in faction warfare
  Top 100 leaderboard of pilots for kills and victory points separated by total, last week and yesterday

---

This route expires daily at 11:05"
  ([] (get-fw-leaderboards-characters-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/fw/leaderboards/characters/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-fw-leaderboards-characters
  "List of the top pilots in faction warfare
  Top 100 leaderboard of pilots for kills and victory points separated by total, last week and yesterday

---

This route expires daily at 11:05"
  ([] (get-fw-leaderboards-characters nil))
  ([optional-params]
   (:data (get-fw-leaderboards-characters-with-http-info optional-params))))

(defn get-fw-leaderboards-corporations-with-http-info
  "List of the top corporations in faction warfare
  Top 10 leaderboard of corporations for kills and victory points separated by total, last week and yesterday

---

This route expires daily at 11:05"
  ([] (get-fw-leaderboards-corporations-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/fw/leaderboards/corporations/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-fw-leaderboards-corporations
  "List of the top corporations in faction warfare
  Top 10 leaderboard of corporations for kills and victory points separated by total, last week and yesterday

---

This route expires daily at 11:05"
  ([] (get-fw-leaderboards-corporations nil))
  ([optional-params]
   (:data (get-fw-leaderboards-corporations-with-http-info optional-params))))

(defn get-fw-stats-with-http-info
  "An overview of statistics about factions involved in faction warfare
  Statistical overviews of factions involved in faction warfare

---

This route expires daily at 11:05"
  ([] (get-fw-stats-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/fw/stats/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-fw-stats
  "An overview of statistics about factions involved in faction warfare
  Statistical overviews of factions involved in faction warfare

---

This route expires daily at 11:05"
  ([] (get-fw-stats nil))
  ([optional-params]
   (:data (get-fw-stats-with-http-info optional-params))))

(defn get-fw-systems-with-http-info
  "Ownership of faction warfare systems
  An overview of the current ownership of faction warfare solar systems

---

This route is cached for up to 1800 seconds"
  ([] (get-fw-systems-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v2/fw/systems/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-fw-systems
  "Ownership of faction warfare systems
  An overview of the current ownership of faction warfare solar systems

---

This route is cached for up to 1800 seconds"
  ([] (get-fw-systems nil))
  ([optional-params]
   (:data (get-fw-systems-with-http-info optional-params))))

(defn get-fw-wars-with-http-info
  "Data about which NPC factions are at war
  Data about which NPC factions are at war

---

This route expires daily at 11:05"
  ([] (get-fw-wars-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/fw/wars/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-fw-wars
  "Data about which NPC factions are at war
  Data about which NPC factions are at war

---

This route expires daily at 11:05"
  ([] (get-fw-wars nil))
  ([optional-params]
   (:data (get-fw-wars-with-http-info optional-params))))

