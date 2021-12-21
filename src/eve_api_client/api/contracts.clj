(ns eve-api-client.api.contracts
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-swagger-interface.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-characters-character-id-contracts-with-http-info
  "Get contracts
  Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \"in_progress\".

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-contracts-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match page token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/contracts/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-contracts
  "Get contracts
  Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \"in_progress\".

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-contracts character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-contracts-with-http-info character-id optional-params))))

(defn get-characters-character-id-contracts-contract-id-bids-with-http-info
  "Get contract bids
  Lists bids on a particular auction contract

---

This route is cached for up to 300 seconds"
  ([character-id contract-id ] (get-characters-character-id-contracts-contract-id-bids-with-http-info character-id contract-id nil))
  ([character-id contract-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id contract-id)
   (call-api "/v1/characters/{character_id}/contracts/{contract_id}/bids/" :get
             {:path-params   {"character_id" character-id "contract_id" contract-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-contracts-contract-id-bids
  "Get contract bids
  Lists bids on a particular auction contract

---

This route is cached for up to 300 seconds"
  ([character-id contract-id ] (get-characters-character-id-contracts-contract-id-bids character-id contract-id nil))
  ([character-id contract-id optional-params]
   (:data (get-characters-character-id-contracts-contract-id-bids-with-http-info character-id contract-id optional-params))))

(defn get-characters-character-id-contracts-contract-id-items-with-http-info
  "Get contract items
  Lists items of a particular contract

---

This route is cached for up to 3600 seconds"
  ([character-id contract-id ] (get-characters-character-id-contracts-contract-id-items-with-http-info character-id contract-id nil))
  ([character-id contract-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id contract-id)
   (call-api "/v1/characters/{character_id}/contracts/{contract_id}/items/" :get
             {:path-params   {"character_id" character-id "contract_id" contract-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-contracts-contract-id-items
  "Get contract items
  Lists items of a particular contract

---

This route is cached for up to 3600 seconds"
  ([character-id contract-id ] (get-characters-character-id-contracts-contract-id-items character-id contract-id nil))
  ([character-id contract-id optional-params]
   (:data (get-characters-character-id-contracts-contract-id-items-with-http-info character-id contract-id optional-params))))

(defn get-contracts-public-bids-contract-id-with-http-info
  "Get public contract bids
  Lists bids on a public auction contract

---

This route is cached for up to 300 seconds"
  ([contract-id ] (get-contracts-public-bids-contract-id-with-http-info contract-id nil))
  ([contract-id {:keys [datasource if-none-match page ]}]
   (check-required-params contract-id)
   (call-api "/v1/contracts/public/bids/{contract_id}/" :get
             {:path-params   {"contract_id" contract-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-contracts-public-bids-contract-id
  "Get public contract bids
  Lists bids on a public auction contract

---

This route is cached for up to 300 seconds"
  ([contract-id ] (get-contracts-public-bids-contract-id contract-id nil))
  ([contract-id optional-params]
   (:data (get-contracts-public-bids-contract-id-with-http-info contract-id optional-params))))

(defn get-contracts-public-items-contract-id-with-http-info
  "Get public contract items
  Lists items of a public contract

---

This route is cached for up to 3600 seconds"
  ([contract-id ] (get-contracts-public-items-contract-id-with-http-info contract-id nil))
  ([contract-id {:keys [datasource if-none-match page ]}]
   (check-required-params contract-id)
   (call-api "/v1/contracts/public/items/{contract_id}/" :get
             {:path-params   {"contract_id" contract-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-contracts-public-items-contract-id
  "Get public contract items
  Lists items of a public contract

---

This route is cached for up to 3600 seconds"
  ([contract-id ] (get-contracts-public-items-contract-id contract-id nil))
  ([contract-id optional-params]
   (:data (get-contracts-public-items-contract-id-with-http-info contract-id optional-params))))

(defn get-contracts-public-region-id-with-http-info
  "Get public contracts
  Returns a paginated list of all public contracts in the given region

---

This route is cached for up to 1800 seconds"
  ([region-id ] (get-contracts-public-region-id-with-http-info region-id nil))
  ([region-id {:keys [datasource if-none-match page ]}]
   (check-required-params region-id)
   (call-api "/v1/contracts/public/{region_id}/" :get
             {:path-params   {"region_id" region-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-contracts-public-region-id
  "Get public contracts
  Returns a paginated list of all public contracts in the given region

---

This route is cached for up to 1800 seconds"
  ([region-id ] (get-contracts-public-region-id region-id nil))
  ([region-id optional-params]
   (:data (get-contracts-public-region-id-with-http-info region-id optional-params))))

(defn get-corporations-corporation-id-contracts-with-http-info
  "Get corporation contracts
  Returns contracts available to a corporation, only if the corporation is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \"in_progress\".

---

This route is cached for up to 300 seconds"
  ([corporation-id ] (get-corporations-corporation-id-contracts-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporations/{corporation_id}/contracts/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-contracts
  "Get corporation contracts
  Returns contracts available to a corporation, only if the corporation is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \"in_progress\".

---

This route is cached for up to 300 seconds"
  ([corporation-id ] (get-corporations-corporation-id-contracts corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-contracts-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-contracts-contract-id-bids-with-http-info
  "Get corporation contract bids
  Lists bids on a particular auction contract

---

This route is cached for up to 3600 seconds"
  ([contract-id corporation-id ] (get-corporations-corporation-id-contracts-contract-id-bids-with-http-info contract-id corporation-id nil))
  ([contract-id corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params contract-id corporation-id)
   (call-api "/v1/corporations/{corporation_id}/contracts/{contract_id}/bids/" :get
             {:path-params   {"contract_id" contract-id "corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-contracts-contract-id-bids
  "Get corporation contract bids
  Lists bids on a particular auction contract

---

This route is cached for up to 3600 seconds"
  ([contract-id corporation-id ] (get-corporations-corporation-id-contracts-contract-id-bids contract-id corporation-id nil))
  ([contract-id corporation-id optional-params]
   (:data (get-corporations-corporation-id-contracts-contract-id-bids-with-http-info contract-id corporation-id optional-params))))

(defn get-corporations-corporation-id-contracts-contract-id-items-with-http-info
  "Get corporation contract items
  Lists items of a particular contract

---

This route is cached for up to 3600 seconds"
  ([contract-id corporation-id ] (get-corporations-corporation-id-contracts-contract-id-items-with-http-info contract-id corporation-id nil))
  ([contract-id corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params contract-id corporation-id)
   (call-api "/v1/corporations/{corporation_id}/contracts/{contract_id}/items/" :get
             {:path-params   {"contract_id" contract-id "corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-contracts-contract-id-items
  "Get corporation contract items
  Lists items of a particular contract

---

This route is cached for up to 3600 seconds"
  ([contract-id corporation-id ] (get-corporations-corporation-id-contracts-contract-id-items contract-id corporation-id nil))
  ([contract-id corporation-id optional-params]
   (:data (get-corporations-corporation-id-contracts-contract-id-items-with-http-info contract-id corporation-id optional-params))))

