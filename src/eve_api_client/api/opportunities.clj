(ns eve-api-client.api.opportunities
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-api-client.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-characters-character-id-opportunities-with-http-info
  "Get a character's completed tasks
  Return a list of tasks finished by a character

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-opportunities-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/opportunities/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-opportunities
  "Get a character's completed tasks
  Return a list of tasks finished by a character

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-opportunities character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-opportunities-with-http-info character-id optional-params))))

(defn get-opportunities-groups-with-http-info
  "Get opportunities groups
  Return a list of opportunities groups

---

This route expires daily at 11:05"
  ([] (get-opportunities-groups-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/opportunities/groups/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-opportunities-groups
  "Get opportunities groups
  Return a list of opportunities groups

---

This route expires daily at 11:05"
  ([] (get-opportunities-groups nil))
  ([optional-params]
   (:data (get-opportunities-groups-with-http-info optional-params))))

(defn get-opportunities-groups-group-id-with-http-info
  "Get opportunities group
  Return information of an opportunities group

---

This route expires daily at 11:05"
  ([group-id ] (get-opportunities-groups-group-id-with-http-info group-id nil))
  ([group-id {:keys [accept-language datasource if-none-match language ]}]
   (check-required-params group-id)
   (call-api "/v1/opportunities/groups/{group_id}/" :get
             {:path-params   {"group_id" group-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-opportunities-groups-group-id
  "Get opportunities group
  Return information of an opportunities group

---

This route expires daily at 11:05"
  ([group-id ] (get-opportunities-groups-group-id group-id nil))
  ([group-id optional-params]
   (:data (get-opportunities-groups-group-id-with-http-info group-id optional-params))))

(defn get-opportunities-tasks-with-http-info
  "Get opportunities tasks
  Return a list of opportunities tasks

---

This route expires daily at 11:05"
  ([] (get-opportunities-tasks-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/opportunities/tasks/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-opportunities-tasks
  "Get opportunities tasks
  Return a list of opportunities tasks

---

This route expires daily at 11:05"
  ([] (get-opportunities-tasks nil))
  ([optional-params]
   (:data (get-opportunities-tasks-with-http-info optional-params))))

(defn get-opportunities-tasks-task-id-with-http-info
  "Get opportunities task
  Return information of an opportunities task

---

This route expires daily at 11:05"
  ([task-id ] (get-opportunities-tasks-task-id-with-http-info task-id nil))
  ([task-id {:keys [datasource if-none-match ]}]
   (check-required-params task-id)
   (call-api "/v1/opportunities/tasks/{task_id}/" :get
             {:path-params   {"task_id" task-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-opportunities-tasks-task-id
  "Get opportunities task
  Return information of an opportunities task

---

This route expires daily at 11:05"
  ([task-id ] (get-opportunities-tasks-task-id task-id nil))
  ([task-id optional-params]
   (:data (get-opportunities-tasks-task-id-with-http-info task-id optional-params))))

