(ns eve-api-client.api.contacts
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-swagger-interface.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn delete-characters-character-id-contacts-with-http-info
  "Delete contacts
  Bulk delete contacts

---"
  ([character-id contact-ids ] (delete-characters-character-id-contacts-with-http-info character-id contact-ids nil))
  ([character-id contact-ids {:keys [datasource token ]}]
   (check-required-params character-id contact-ids)
   (call-api "/v2/characters/{character_id}/contacts/" :delete
             {:path-params   {"character_id" character-id }
              :header-params {}
              :query-params  {"contact_ids" (with-collection-format contact-ids :multi) "datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn delete-characters-character-id-contacts
  "Delete contacts
  Bulk delete contacts

---"
  ([character-id contact-ids ] (delete-characters-character-id-contacts character-id contact-ids nil))
  ([character-id contact-ids optional-params]
   (:data (delete-characters-character-id-contacts-with-http-info character-id contact-ids optional-params))))

(defn get-alliances-alliance-id-contacts-with-http-info
  "Get alliance contacts
  Return contacts of an alliance

---

This route is cached for up to 300 seconds"
  ([alliance-id ] (get-alliances-alliance-id-contacts-with-http-info alliance-id nil))
  ([alliance-id {:keys [datasource if-none-match page token ]}]
   (check-required-params alliance-id)
   (call-api "/v2/alliances/{alliance_id}/contacts/" :get
             {:path-params   {"alliance_id" alliance-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-alliances-alliance-id-contacts
  "Get alliance contacts
  Return contacts of an alliance

---

This route is cached for up to 300 seconds"
  ([alliance-id ] (get-alliances-alliance-id-contacts alliance-id nil))
  ([alliance-id optional-params]
   (:data (get-alliances-alliance-id-contacts-with-http-info alliance-id optional-params))))

(defn get-alliances-alliance-id-contacts-labels-with-http-info
  "Get alliance contact labels
  Return custom labels for an alliance's contacts

---

This route is cached for up to 300 seconds"
  ([alliance-id ] (get-alliances-alliance-id-contacts-labels-with-http-info alliance-id nil))
  ([alliance-id {:keys [datasource if-none-match token ]}]
   (check-required-params alliance-id)
   (call-api "/v1/alliances/{alliance_id}/contacts/labels/" :get
             {:path-params   {"alliance_id" alliance-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-alliances-alliance-id-contacts-labels
  "Get alliance contact labels
  Return custom labels for an alliance's contacts

---

This route is cached for up to 300 seconds"
  ([alliance-id ] (get-alliances-alliance-id-contacts-labels alliance-id nil))
  ([alliance-id optional-params]
   (:data (get-alliances-alliance-id-contacts-labels-with-http-info alliance-id optional-params))))

(defn get-characters-character-id-contacts-with-http-info
  "Get contacts
  Return contacts of a character

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-contacts-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match page token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/contacts/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-contacts
  "Get contacts
  Return contacts of a character

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-contacts character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-contacts-with-http-info character-id optional-params))))

(defn get-characters-character-id-contacts-labels-with-http-info
  "Get contact labels
  Return custom labels for a character's contacts

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-contacts-labels-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/contacts/labels/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-contacts-labels
  "Get contact labels
  Return custom labels for a character's contacts

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-contacts-labels character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-contacts-labels-with-http-info character-id optional-params))))

(defn get-corporations-corporation-id-contacts-with-http-info
  "Get corporation contacts
  Return contacts of a corporation

---

This route is cached for up to 300 seconds"
  ([corporation-id ] (get-corporations-corporation-id-contacts-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match page token ]}]
   (check-required-params corporation-id)
   (call-api "/v2/corporations/{corporation_id}/contacts/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-contacts
  "Get corporation contacts
  Return contacts of a corporation

---

This route is cached for up to 300 seconds"
  ([corporation-id ] (get-corporations-corporation-id-contacts corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-contacts-with-http-info corporation-id optional-params))))

(defn get-corporations-corporation-id-contacts-labels-with-http-info
  "Get corporation contact labels
  Return custom labels for a corporation's contacts

---

This route is cached for up to 300 seconds"
  ([corporation-id ] (get-corporations-corporation-id-contacts-labels-with-http-info corporation-id nil))
  ([corporation-id {:keys [datasource if-none-match token ]}]
   (check-required-params corporation-id)
   (call-api "/v1/corporations/{corporation_id}/contacts/labels/" :get
             {:path-params   {"corporation_id" corporation-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-corporations-corporation-id-contacts-labels
  "Get corporation contact labels
  Return custom labels for a corporation's contacts

---

This route is cached for up to 300 seconds"
  ([corporation-id ] (get-corporations-corporation-id-contacts-labels corporation-id nil))
  ([corporation-id optional-params]
   (:data (get-corporations-corporation-id-contacts-labels-with-http-info corporation-id optional-params))))

(defn post-characters-character-id-contacts-with-http-info
  "Add contacts
  Bulk add contacts with same settings

---"
  ([character-id contact-ids standing ] (post-characters-character-id-contacts-with-http-info character-id contact-ids standing nil))
  ([character-id contact-ids standing {:keys [datasource label-ids token watched ]}]
   (check-required-params character-id contact-ids standing)
   (call-api "/v2/characters/{character_id}/contacts/" :post
             {:path-params   {"character_id" character-id }
              :header-params {}
              :query-params  {"datasource" datasource "label_ids" (with-collection-format label-ids :multi) "standing" standing "token" token "watched" watched }
              :form-params   {}
              :body-param    contact-ids
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-characters-character-id-contacts
  "Add contacts
  Bulk add contacts with same settings

---"
  ([character-id contact-ids standing ] (post-characters-character-id-contacts character-id contact-ids standing nil))
  ([character-id contact-ids standing optional-params]
   (:data (post-characters-character-id-contacts-with-http-info character-id contact-ids standing optional-params))))

(defn put-characters-character-id-contacts-with-http-info
  "Edit contacts
  Bulk edit contacts with same settings

---"
  ([character-id contact-ids standing ] (put-characters-character-id-contacts-with-http-info character-id contact-ids standing nil))
  ([character-id contact-ids standing {:keys [datasource label-ids token watched ]}]
   (check-required-params character-id contact-ids standing)
   (call-api "/v2/characters/{character_id}/contacts/" :put
             {:path-params   {"character_id" character-id }
              :header-params {}
              :query-params  {"datasource" datasource "label_ids" (with-collection-format label-ids :multi) "standing" standing "token" token "watched" watched }
              :form-params   {}
              :body-param    contact-ids
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn put-characters-character-id-contacts
  "Edit contacts
  Bulk edit contacts with same settings

---"
  ([character-id contact-ids standing ] (put-characters-character-id-contacts character-id contact-ids standing nil))
  ([character-id contact-ids standing optional-params]
   (:data (put-characters-character-id-contacts-with-http-info character-id contact-ids standing optional-params))))

