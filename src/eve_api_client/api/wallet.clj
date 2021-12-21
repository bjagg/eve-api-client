(ns eve-api-client.api.wallet
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-swagger-interface.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-characters-character-id-wallet-with-http-info
  "Get a character's wallet balance
  Returns a character's wallet balance

---

This route is cached for up to 120 seconds

---
[Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/wallet/)"
  ([character-id ] (get-characters-character-id-wallet-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/wallet/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-wallet
  "Get a character's wallet balance
  Returns a character's wallet balance

---

This route is cached for up to 120 seconds

---
[Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/wallet/)"
  ([character-id ] (get-characters-character-id-wallet character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-wallet-with-http-info character-id optional-params))))

(defn get-characters-character-id-wallet-journal-with-http-info
  "Get character wallet journal
  Retrieve the given character's wallet journal going 30 days back

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-wallet-journal-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match page token ]}]
   (check-required-params character-id)
   (call-api "/v6/characters/{character_id}/wallet/journal/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-wallet-journal
  "Get character wallet journal
  Retrieve the given character's wallet journal going 30 days back

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-wallet-journal character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-wallet-journal-with-http-info character-id optional-params))))

(defn get-characters-character-id-wallet-transactions-with-http-info
  "Get wallet transactions
  Get wallet transactions of a character

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-wallet-transactions-with-http-info character-id nil))
  ([character-id {:keys [datasource from-id if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/wallet/transactions/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "from_id" from-id "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-wallet-transactions
  "Get wallet transactions
  Get wallet transactions of a character

---

This route is cached for up to 3600 seconds"
  ([character-id ] (get-characters-character-id-wallet-transactions character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-wallet-transactions-with-http-info character-id optional-params))))

(defn get-corporations-corporation-id-wallets-with-http-info
  "Returns a corporation's wallet balance
  Get a corporation's wallets

---

This route is cached for up to 300 seconds

---
Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant"
  ([corporation-id ] (get-corporations-corporation-id-wallets-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporations/{corporation_id}/wallets/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-wallets
  "Returns a corporation's wallet balance
  Get a corporation's wallets

---

This route is cached for up to 300 seconds

---
Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant"
  ([corporation-id ] (get-corporations-corporation-id-wallets corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-wallets-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-wallets-division-journal-with-http-info
  "Get corporation wallet journal
  Retrieve the given corporation's wallet journal for the given division going 30 days back

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant"
  ([corporation-id division ] (get-corporations-corporation-id-wallets-division-journal-with-http-info corporation-id division nil))
  ([corporation-id division {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id division)
   (call-api "/v4/corporations/{corporation_id}/wallets/{division}/journal/" :get
             {:path-params   {"corporation_id" corporation-id "division" division }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-wallets-division-journal
  "Get corporation wallet journal
  Retrieve the given corporation's wallet journal for the given division going 30 days back

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant"
  ([corporation-id division ] (get-corporations-corporation-id-wallets-division-journal corporation-id division nil))
  ([corporation-id division optional-params]
   (:data (get-corporations-corporation-id-wallets-division-journal-with-http-info corporation-id division optional-params))))

(defn get-corporations-corporation-id-wallets-division-transactions-with-http-info
  "Get corporation wallet transactions
  Get wallet transactions of a corporation

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant"
  ([corporation-id division ] (get-corporations-corporation-id-wallets-division-transactions-with-http-info corporation-id division nil))
  ([corporation-id division {:keys [datasource from-id if-none-match token ]}]
   (check-required-params corporation-id division)
   (call-api "/v1/corporations/{corporation_id}/wallets/{division}/transactions/" :get
             {:path-params   {"corporation_id" corporation-id "division" division }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "from_id" from-id "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-wallets-division-transactions
  "Get corporation wallet transactions
  Get wallet transactions of a corporation

---

This route is cached for up to 3600 seconds

---
Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant"
  ([corporation-id division ] (get-corporations-corporation-id-wallets-division-transactions corporation-id division nil))
  ([corporation-id division optional-params]
   (:data (get-corporations-corporation-id-wallets-division-transactions-with-http-info corporation-id division optional-params))))

