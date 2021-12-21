(ns eve-api-client.api.dogma
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-swagger-interface.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-dogma-attributes-with-http-info
  "Get attributes
  Get a list of dogma attribute ids

---

This route expires daily at 11:05"
  ([] (get-dogma-attributes-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/dogma/attributes/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-dogma-attributes
  "Get attributes
  Get a list of dogma attribute ids

---

This route expires daily at 11:05"
  ([] (get-dogma-attributes nil))
  ([optional-params]
   (:data (get-dogma-attributes-with-http-info optional-params))))

(defn get-dogma-attributes-attribute-id-with-http-info
  "Get attribute information
  Get information on a dogma attribute

---

This route expires daily at 11:05"
  ([attribute-id ] (get-dogma-attributes-attribute-id-with-http-info attribute-id nil))
  ([attribute-id {:keys [datasource if-none-match ]}]
   (check-required-params attribute-id)
   (call-api "/v1/dogma/attributes/{attribute_id}/" :get
             {:path-params   {"attribute_id" attribute-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-dogma-attributes-attribute-id
  "Get attribute information
  Get information on a dogma attribute

---

This route expires daily at 11:05"
  ([attribute-id ] (get-dogma-attributes-attribute-id attribute-id nil))
  ([attribute-id optional-params]
   (:data (get-dogma-attributes-attribute-id-with-http-info attribute-id optional-params))))

(defn get-dogma-dynamic-items-type-id-item-id-with-http-info
  "Get dynamic item information
  Returns info about a dynamic item resulting from mutation with a mutaplasmid.

---

This route expires daily at 11:05"
  ([item-id type-id ] (get-dogma-dynamic-items-type-id-item-id-with-http-info item-id type-id nil))
  ([item-id type-id {:keys [datasource if-none-match ]}]
   (check-required-params item-id type-id)
   (call-api "/v1/dogma/dynamic/items/{type_id}/{item_id}/" :get
             {:path-params   {"item_id" item-id "type_id" type-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-dogma-dynamic-items-type-id-item-id
  "Get dynamic item information
  Returns info about a dynamic item resulting from mutation with a mutaplasmid.

---

This route expires daily at 11:05"
  ([item-id type-id ] (get-dogma-dynamic-items-type-id-item-id item-id type-id nil))
  ([item-id type-id optional-params]
   (:data (get-dogma-dynamic-items-type-id-item-id-with-http-info item-id type-id optional-params))))

(defn get-dogma-effects-with-http-info
  "Get effects
  Get a list of dogma effect ids

---

This route expires daily at 11:05"
  ([] (get-dogma-effects-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/dogma/effects/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-dogma-effects
  "Get effects
  Get a list of dogma effect ids

---

This route expires daily at 11:05"
  ([] (get-dogma-effects nil))
  ([optional-params]
   (:data (get-dogma-effects-with-http-info optional-params))))

(defn get-dogma-effects-effect-id-with-http-info
  "Get effect information
  Get information on a dogma effect

---

This route expires daily at 11:05"
  ([effect-id ] (get-dogma-effects-effect-id-with-http-info effect-id nil))
  ([effect-id {:keys [datasource if-none-match ]}]
   (check-required-params effect-id)
   (call-api "/v2/dogma/effects/{effect_id}/" :get
             {:path-params   {"effect_id" effect-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-dogma-effects-effect-id
  "Get effect information
  Get information on a dogma effect

---

This route expires daily at 11:05"
  ([effect-id ] (get-dogma-effects-effect-id effect-id nil))
  ([effect-id optional-params]
   (:data (get-dogma-effects-effect-id-with-http-info effect-id optional-params))))

