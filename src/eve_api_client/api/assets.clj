(ns eve-api-client.api.assets
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-characters-character-id-assets-with-http-info
  "Get character assets
  Return a list of the characters assets

---

This route is cached for up to 3600 seconds

---
Warning: This route has an upgrade available

---
[Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/assets/)"
  ([character-id ] (get-characters-character-id-assets-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match page token ]}]
   (check-required-params character-id)
   (call-api "/v3/characters/{character_id}/assets/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-assets
  "Get character assets
  Return a list of the characters assets

---

This route is cached for up to 3600 seconds

---
Warning: This route has an upgrade available

---
[Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/assets/)"
  ([character-id ] (get-characters-character-id-assets character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-assets-with-http-info character-id optional-params))))

(defn get-corporations-corporation-id-assets-with-http-info
  "Get corporation assets
  Return a list of the corporation assets

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director

---
Warning: This route has an upgrade available

---
[Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/corporations/{corporation_id}/assets/)"
  ([corporation-id ] (get-corporations-corporation-id-assets-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v3/corporations/{corporation_id}/assets/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-assets
  "Get corporation assets
  Return a list of the corporation assets

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Director

---
Warning: This route has an upgrade available

---
[Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/corporations/{corporation_id}/assets/)"
  ([corporation-id ] (get-corporations-corporation-id-assets corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-assets-with-http-info corporation-id optional-params))))

(defn post-characters-character-id-assets-locations-with-http-info
  "Get character asset locations
  Return locations for a set of item ids, which you can get from character assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)

---"
  ([character-id item-ids ] (post-characters-character-id-assets-locations-with-http-info character-id item-ids nil))
  ([character-id item-ids {:keys [datasource token ]}]
   (check-required-params character-id item-ids)
   (call-api "/v2/characters/{character_id}/assets/locations/" :post
             {:path-params   {"character_id" character-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    item-ids
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-characters-character-id-assets-locations
  "Get character asset locations
  Return locations for a set of item ids, which you can get from character assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)

---"
  ([character-id item-ids ] (post-characters-character-id-assets-locations character-id item-ids nil))
  ([character-id item-ids optional-params]
   (:data (post-characters-character-id-assets-locations-with-http-info character-id item-ids optional-params))))

(defn post-characters-character-id-assets-names-with-http-info
  "Get character asset names
  Return names for a set of item ids, which you can get from character assets endpoint. Typically used for items that can customize names, like containers or ships.

---"
  ([character-id item-ids ] (post-characters-character-id-assets-names-with-http-info character-id item-ids nil))
  ([character-id item-ids {:keys [datasource token ]}]
   (check-required-params character-id item-ids)
   (call-api "/v1/characters/{character_id}/assets/names/" :post
             {:path-params   {"character_id" character-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    item-ids
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-characters-character-id-assets-names
  "Get character asset names
  Return names for a set of item ids, which you can get from character assets endpoint. Typically used for items that can customize names, like containers or ships.

---"
  ([character-id item-ids ] (post-characters-character-id-assets-names character-id item-ids nil))
  ([character-id item-ids optional-params]
   (:data (post-characters-character-id-assets-names-with-http-info character-id item-ids optional-params))))

(defn post-corporations-corporation-id-assets-locations-with-http-info
  "Get corporation asset locations
  Return locations for a set of item ids, which you can get from corporation assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)

---

Requires one of the following EVE corporation role(s): Director"
  ([corporation-id item-ids ] (post-corporations-corporation-id-assets-locations-with-http-info corporation-id item-ids nil))
  ([corporation-id item-ids {:keys [datasource token ]}]
   (check-required-params corporation-id item-ids)
   (call-api "/v2/corporations/{corporation_id}/assets/locations/" :post
             {:path-params   {"corporation_id" corporation-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    item-ids
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-corporations-corporation-id-assets-locations
  "Get corporation asset locations
  Return locations for a set of item ids, which you can get from corporation assets endpoint. Coordinates for items in hangars or stations are set to (0,0,0)

---

Requires one of the following EVE corporation role(s): Director"
  ([corporation-id item-ids ] (post-corporations-corporation-id-assets-locations corporation-id item-ids nil))
  ([corporation-id item-ids optional-params]
   (:data (post-corporations-corporation-id-assets-locations-with-http-info corporation-id item-ids optional-params))))

(defn post-corporations-corporation-id-assets-names-with-http-info
  "Get corporation asset names
  Return names for a set of item ids, which you can get from corporation assets endpoint. Only valid for items that can customize names, like containers or ships

---

Requires one of the following EVE corporation role(s): Director"
  ([corporation-id item-ids ] (post-corporations-corporation-id-assets-names-with-http-info corporation-id item-ids nil))
  ([corporation-id item-ids {:keys [datasource token ]}]
   (check-required-params corporation-id item-ids)
   (call-api "/v1/corporations/{corporation_id}/assets/names/" :post
             {:path-params   {"corporation_id" corporation-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    item-ids
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-corporations-corporation-id-assets-names
  "Get corporation asset names
  Return names for a set of item ids, which you can get from corporation assets endpoint. Only valid for items that can customize names, like containers or ships

---

Requires one of the following EVE corporation role(s): Director"
  ([corporation-id item-ids ] (post-corporations-corporation-id-assets-names corporation-id item-ids nil))
  ([corporation-id item-ids optional-params]
   (:data (post-corporations-corporation-id-assets-names-with-http-info corporation-id item-ids optional-params))))

