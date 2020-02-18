(ns eve-api-client.api.mail
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn delete-characters-character-id-mail-labels-label-id-with-http-info
  "Delete a mail label
  Delete a mail label

---"
  ([character-id label-id ] (delete-characters-character-id-mail-labels-label-id-with-http-info character-id label-id nil))
  ([character-id label-id {:keys [datasource token ]}]
   (check-required-params character-id label-id)
   (call-api "/v1/characters/{character_id}/mail/labels/{label_id}/" :delete
             {:path-params   {"character_id" character-id "label_id" label-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn delete-characters-character-id-mail-labels-label-id
  "Delete a mail label
  Delete a mail label

---"
  ([character-id label-id ] (delete-characters-character-id-mail-labels-label-id character-id label-id nil))
  ([character-id label-id optional-params]
   (:data (delete-characters-character-id-mail-labels-label-id-with-http-info character-id label-id optional-params))))

(defn delete-characters-character-id-mail-mail-id-with-http-info
  "Delete a mail
  Delete a mail

---"
  ([character-id mail-id ] (delete-characters-character-id-mail-mail-id-with-http-info character-id mail-id nil))
  ([character-id mail-id {:keys [datasource token ]}]
   (check-required-params character-id mail-id)
   (call-api "/v1/characters/{character_id}/mail/{mail_id}/" :delete
             {:path-params   {"character_id" character-id "mail_id" mail-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn delete-characters-character-id-mail-mail-id
  "Delete a mail
  Delete a mail

---"
  ([character-id mail-id ] (delete-characters-character-id-mail-mail-id character-id mail-id nil))
  ([character-id mail-id optional-params]
   (:data (delete-characters-character-id-mail-mail-id-with-http-info character-id mail-id optional-params))))

(defn get-characters-character-id-mail-with-http-info
  "Return mail headers
  Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards

---

This route is cached for up to 30 seconds"
  ([character-id ] (get-characters-character-id-mail-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match labels last-mail-id token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/mail/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "labels" (with-collection-format labels :multi) "last_mail_id" last-mail-id "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-mail
  "Return mail headers
  Return the 50 most recent mail headers belonging to the character that match the query criteria. Queries can be filtered by label, and last_mail_id can be used to paginate backwards

---

This route is cached for up to 30 seconds"
  ([character-id ] (get-characters-character-id-mail character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-mail-with-http-info character-id optional-params))))

(defn get-characters-character-id-mail-labels-with-http-info
  "Get mail labels and unread counts
  Return a list of the users mail labels, unread counts for each label and a total unread count.

---

This route is cached for up to 30 seconds"
  ([character-id ] (get-characters-character-id-mail-labels-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v3/characters/{character_id}/mail/labels/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-mail-labels
  "Get mail labels and unread counts
  Return a list of the users mail labels, unread counts for each label and a total unread count.

---

This route is cached for up to 30 seconds"
  ([character-id ] (get-characters-character-id-mail-labels character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-mail-labels-with-http-info character-id optional-params))))

(defn get-characters-character-id-mail-lists-with-http-info
  "Return mailing list subscriptions
  Return all mailing lists that the character is subscribed to

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-mail-lists-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/mail/lists/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-mail-lists
  "Return mailing list subscriptions
  Return all mailing lists that the character is subscribed to

---

This route is cached for up to 120 seconds"
  ([character-id ] (get-characters-character-id-mail-lists character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-mail-lists-with-http-info character-id optional-params))))

(defn get-characters-character-id-mail-mail-id-with-http-info
  "Return a mail
  Return the contents of an EVE mail

---

This route is cached for up to 30 seconds"
  ([character-id mail-id ] (get-characters-character-id-mail-mail-id-with-http-info character-id mail-id nil))
  ([character-id mail-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id mail-id)
   (call-api "/v1/characters/{character_id}/mail/{mail_id}/" :get
             {:path-params   {"character_id" character-id "mail_id" mail-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-mail-mail-id
  "Return a mail
  Return the contents of an EVE mail

---

This route is cached for up to 30 seconds"
  ([character-id mail-id ] (get-characters-character-id-mail-mail-id character-id mail-id nil))
  ([character-id mail-id optional-params]
   (:data (get-characters-character-id-mail-mail-id-with-http-info character-id mail-id optional-params))))

(defn post-characters-character-id-mail-with-http-info
  "Send a new mail
  Create and send a new mail

---"
  ([character-id mail ] (post-characters-character-id-mail-with-http-info character-id mail nil))
  ([character-id mail {:keys [datasource token ]}]
   (check-required-params character-id mail)
   (call-api "/v1/characters/{character_id}/mail/" :post
             {:path-params   {"character_id" character-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    mail
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-characters-character-id-mail
  "Send a new mail
  Create and send a new mail

---"
  ([character-id mail ] (post-characters-character-id-mail character-id mail nil))
  ([character-id mail optional-params]
   (:data (post-characters-character-id-mail-with-http-info character-id mail optional-params))))

(defn post-characters-character-id-mail-labels-with-http-info
  "Create a mail label
  Create a mail label

---"
  ([character-id label ] (post-characters-character-id-mail-labels-with-http-info character-id label nil))
  ([character-id label {:keys [datasource token ]}]
   (check-required-params character-id label)
   (call-api "/v2/characters/{character_id}/mail/labels/" :post
             {:path-params   {"character_id" character-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    label
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-characters-character-id-mail-labels
  "Create a mail label
  Create a mail label

---"
  ([character-id label ] (post-characters-character-id-mail-labels character-id label nil))
  ([character-id label optional-params]
   (:data (post-characters-character-id-mail-labels-with-http-info character-id label optional-params))))

(defn put-characters-character-id-mail-mail-id-with-http-info
  "Update metadata about a mail
  Update metadata about a mail

---"
  ([character-id contents mail-id ] (put-characters-character-id-mail-mail-id-with-http-info character-id contents mail-id nil))
  ([character-id contents mail-id {:keys [datasource token ]}]
   (check-required-params character-id contents mail-id)
   (call-api "/v1/characters/{character_id}/mail/{mail_id}/" :put
             {:path-params   {"character_id" character-id "mail_id" mail-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    contents
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn put-characters-character-id-mail-mail-id
  "Update metadata about a mail
  Update metadata about a mail

---"
  ([character-id contents mail-id ] (put-characters-character-id-mail-mail-id character-id contents mail-id nil))
  ([character-id contents mail-id optional-params]
   (:data (put-characters-character-id-mail-mail-id-with-http-info character-id contents mail-id optional-params))))

