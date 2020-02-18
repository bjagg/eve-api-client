(ns eve-api-client.api.fittings
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn delete-characters-character-id-fittings-fitting-id-with-http-info
  "Delete fitting
  Delete a fitting from a character

---"
  ([character-id fitting-id ] (delete-characters-character-id-fittings-fitting-id-with-http-info character-id fitting-id nil))
  ([character-id fitting-id {:keys [datasource token ]}]
   (check-required-params character-id fitting-id)
   (call-api "/v1/characters/{character_id}/fittings/{fitting_id}/" :delete
             {:path-params   {"character_id" character-id "fitting_id" fitting-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn delete-characters-character-id-fittings-fitting-id
  "Delete fitting
  Delete a fitting from a character

---"
  ([character-id fitting-id ] (delete-characters-character-id-fittings-fitting-id character-id fitting-id nil))
  ([character-id fitting-id optional-params]
   (:data (delete-characters-character-id-fittings-fitting-id-with-http-info character-id fitting-id optional-params))))

(defn get-characters-character-id-fittings-with-http-info
  "Get fittings
  Return fittings of a character

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-fittings-with-http-info character-id nil))
  ([character-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v2/characters/{character_id}/fittings/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-fittings
  "Get fittings
  Return fittings of a character

---

This route is cached for up to 300 seconds"
  ([character-id ] (get-characters-character-id-fittings character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-fittings-with-http-info character-id optional-params))))

(defn post-characters-character-id-fittings-with-http-info
  "Create fitting
  Save a new fitting for a character

---"
  ([character-id fitting ] (post-characters-character-id-fittings-with-http-info character-id fitting nil))
  ([character-id fitting {:keys [datasource token ]}]
   (check-required-params character-id fitting)
   (call-api "/v2/characters/{character_id}/fittings/" :post
             {:path-params   {"character_id" character-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    fitting
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-characters-character-id-fittings
  "Create fitting
  Save a new fitting for a character

---"
  ([character-id fitting ] (post-characters-character-id-fittings character-id fitting nil))
  ([character-id fitting optional-params]
   (:data (post-characters-character-id-fittings-with-http-info character-id fitting optional-params))))

