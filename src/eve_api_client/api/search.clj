(ns eve-api-client.api.search
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-swagger-interface.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-characters-character-id-search-with-http-info
  "Search on a string
  Search for entities that match a given sub-string.

---

This route is cached for up to 3600 seconds"
  ([categories character-id search ] (get-characters-character-id-search-with-http-info categories character-id search nil))
  ([categories character-id search {:keys [accept-language datasource if-none-match language strict token ]}]
   (check-required-params categories character-id search)
   (call-api "/v3/characters/{character_id}/search/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"categories" (with-collection-format categories :multi) "datasource" datasource "language" language "search" search "strict" strict "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-search
  "Search on a string
  Search for entities that match a given sub-string.

---

This route is cached for up to 3600 seconds"
  ([categories character-id search ] (get-characters-character-id-search categories character-id search nil))
  ([categories character-id search optional-params]
   (:data (get-characters-character-id-search-with-http-info categories character-id search optional-params))))

(defn get-search-with-http-info
  "Search on a string
  Search for entities that match a given sub-string.

---

This route is cached for up to 3600 seconds"
  ([categories search ] (get-search-with-http-info categories search nil))
  ([categories search {:keys [accept-language datasource if-none-match language strict ]}]
   (check-required-params categories search)
   (call-api "/v2/search/" :get
             {:path-params   {}
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"categories" (with-collection-format categories :multi) "datasource" datasource "language" language "search" search "strict" strict }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-search
  "Search on a string
  Search for entities that match a given sub-string.

---

This route is cached for up to 3600 seconds"
  ([categories search ] (get-search categories search nil))
  ([categories search optional-params]
   (:data (get-search-with-http-info categories search optional-params))))

