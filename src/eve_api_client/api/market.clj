(ns eve-api-client.api.market
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-characters-character-id-orders-with-http-info
  "List open orders from a character
  List open market orders placed by a character

---

This route is cached for up to 1200 seconds"
  ([character-id ] (get-characters-character-id-orders-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/orders/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-orders
  "List open orders from a character
  List open market orders placed by a character

---

This route is cached for up to 1200 seconds"
  ([character-id ] (get-characters-character-id-orders character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-orders-with-http-info character-id optional-params))))

(defn get-characters-character-id-orders-history-with-http-info
  "List historical orders by a character
  List cancelled and expired market orders placed by a character up to 90 days in the past.

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-orders-history-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match page token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/orders/history/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-orders-history
  "List historical orders by a character
  List cancelled and expired market orders placed by a character up to 90 days in the past.

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-orders-history character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-orders-history-with-http-info character-id optional-params))))

(defn get-corporations-corporation-id-orders-with-http-info
  "List open orders from a corporation
  List open market orders placed on behalf of a corporation

---

This route is cached for up to 1200 seconds

---
Requires one of the following EVE corporation role(s): Accountant, Trader"
  ([corporation-id ] (get-corporations-corporation-id-orders-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v3/corporations/{corporation_id}/orders/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-orders
  "List open orders from a corporation
  List open market orders placed on behalf of a corporation

---

This route is cached for up to 1200 seconds

---
Requires one of the following EVE corporation role(s): Accountant, Trader"
  ([corporation-id ] (get-corporations-corporation-id-orders corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-orders-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-orders-history-with-http-info
  "List historical orders from a corporation
  List cancelled and expired market orders placed on behalf of a corporation up to 90 days in the past.

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Accountant, Trader"
  ([corporation-id ] (get-corporations-corporation-id-orders-history-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/orders/history/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-orders-history
  "List historical orders from a corporation
  List cancelled and expired market orders placed on behalf of a corporation up to 90 days in the past.

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Accountant, Trader"
  ([corporation-id ] (get-corporations-corporation-id-orders-history corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-orders-history-with-http-info corporation-id optional-params))))

(defn get-markets-groups-with-http-info
  "Get item groups
  Get a list of item groups

---

This route expires daily at 11:05"
  ([] (get-markets-groups-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/markets/groups/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-markets-groups
  "Get item groups
  Get a list of item groups

---

This route expires daily at 11:05"
  ([] (get-markets-groups nil))
  ([optional-params]
   (:data (get-markets-groups-with-http-info optional-params))))

(defn get-markets-groups-market-group-id-with-http-info
  "Get item group information
  Get information on an item group

---

This route expires daily at 11:05"
  ([market-group-id ] (get-markets-groups-market-group-id-with-http-info market-group-id nil))
  ([market-group-id {:keys [accept-language datasource if-none-match language ]}]
   (check-required-params market-group-id)
   (call-api "/v1/markets/groups/{market_group_id}/" :get
             {:path-params   {"market_group_id" market-group-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-markets-groups-market-group-id
  "Get item group information
  Get information on an item group

---

This route expires daily at 11:05"
  ([market-group-id ] (get-markets-groups-market-group-id market-group-id nil))
  ([market-group-id optional-params]
   (:data (get-markets-groups-market-group-id-with-http-info market-group-id optional-params))))

(defn get-markets-prices-with-http-info
  "List market prices
  Return a list of prices

---

This route is cached for up to 3600 seconds"
  ([] (get-markets-prices-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/markets/prices/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-markets-prices
  "List market prices
  Return a list of prices

---

This route is cached for up to 3600 seconds"
  ([] (get-markets-prices nil))
  ([optional-params]
   (:data (get-markets-prices-with-http-info optional-params))))

(defn get-markets-region-id-history-with-http-info
  "List historical market statistics in a region
  Return a list of historical market statistics for the specified type in a region

---

This route expires daily at 11:05"
  ([region-id type-id ] (get-markets-region-id-history-with-http-info region-id type-id nil))
  ([region-id type-id {:keys [datasource if-none-match ]}]
   (check-required-params region-id type-id)
   (call-api "/v1/markets/{region_id}/history/" :get
             {:path-params   {"region_id" region-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "type_id" type-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-markets-region-id-history
  "List historical market statistics in a region
  Return a list of historical market statistics for the specified type in a region

---

This route expires daily at 11:05"
  ([region-id type-id ] (get-markets-region-id-history region-id type-id nil))
  ([region-id type-id optional-params]
   (:data (get-markets-region-id-history-with-http-info region-id type-id optional-params))))

(defn get-markets-region-id-orders-with-http-info
  "List orders in a region
  Return a list of orders in a region

---

This route is cached for up to 300 seconds"
  ([order-type region-id ] (get-markets-region-id-orders-with-http-info order-type region-id nil))
  ([order-type region-id {:keys [datasource if-none-match page type-id ]}]
   (check-required-params order-type region-id)
   (call-api "/v1/markets/{region_id}/orders/" :get
             {:path-params   {"region_id" region-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "order_type" order-type "page" page "type_id" type-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-markets-region-id-orders
  "List orders in a region
  Return a list of orders in a region

---

This route is cached for up to 300 seconds"
  ([order-type region-id ] (get-markets-region-id-orders order-type region-id nil))
  ([order-type region-id optional-params]
   (:data (get-markets-region-id-orders-with-http-info order-type region-id optional-params))))

(defn get-markets-region-id-types-with-http-info
  "List type IDs relevant to a market
  Return a list of type IDs that have active orders in the region, for efficient market indexing.

---

This route is cached for up to 600 seconds"
  ([region-id ] (get-markets-region-id-types-with-http-info region-id nil))
  ([region-id {:keys [datasource if-none-match page ]}]
   (check-required-params region-id)
   (call-api "/v1/markets/{region_id}/types/" :get
             {:path-params   {"region_id" region-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-markets-region-id-types
  "List type IDs relevant to a market
  Return a list of type IDs that have active orders in the region, for efficient market indexing.

---

This route is cached for up to 600 seconds"
  ([region-id ] (get-markets-region-id-types region-id nil))
  ([region-id optional-params]
   (:data (get-markets-region-id-types-with-http-info region-id optional-params))))

(defn get-markets-structures-structure-id-with-http-info
  "List orders in a structure
  Return all orders in a structure

---

This route is cached for up to 300 seconds"
  ([structure-id ] (get-markets-structures-structure-id-with-http-info structure-id nil))
  ([structure-id {:keys [datasource if-none-match page token ]}]
   (check-required-params structure-id)
   (call-api "/v1/markets/structures/{structure_id}/" :get
             {:path-params   {"structure_id" structure-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-markets-structures-structure-id
  "List orders in a structure
  Return all orders in a structure

---

This route is cached for up to 300 seconds"
  ([structure-id ] (get-markets-structures-structure-id structure-id nil))
  ([structure-id optional-params]
   (:data (get-markets-structures-structure-id-with-http-info structure-id optional-params))))

