(ns eve-api-client.api.bookmarks
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-swagger-interface.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-characters-character-id-bookmarks-with-http-info
  "List bookmarks
  A list of your character's personal bookmarks

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-bookmarks-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match page token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/bookmarks/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-bookmarks
  "List bookmarks
  A list of your character's personal bookmarks

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-bookmarks character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-bookmarks-with-http-info character-id optional-params))))

(defn get-characters-character-id-bookmarks-folders-with-http-info
  "List bookmark folders
  A list of your character's personal bookmark folders

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-bookmarks-folders-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match page token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/bookmarks/folders/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-bookmarks-folders
  "List bookmark folders
  A list of your character's personal bookmark folders

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-bookmarks-folders character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-bookmarks-folders-with-http-info character-id optional-params))))

(defn get-corporations-corporation-id-bookmarks-with-http-info
  "List corporation bookmarks
  A list of your corporation's bookmarks

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-bookmarks-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporations/{corporation_id}/bookmarks/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-bookmarks
  "List corporation bookmarks
  A list of your corporation's bookmarks

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-bookmarks corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-bookmarks-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-bookmarks-folders-with-http-info
  "List corporation bookmark folders
  A list of your corporation's bookmark folders

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-bookmarks-folders-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporations/{corporation_id}/bookmarks/folders/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-bookmarks-folders
  "List corporation bookmark folders
  A list of your corporation's bookmark folders

---

This route is cached for up to 3600 seconds"
  ([corporation-id ] (get-corporations-corporation-id-bookmarks-folders corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-bookmarks-folders-with-http-info corporation-id optional-params))))

