(ns eve-api-client.api.user-interface
  (:require [eve-api-client.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn post-ui-autopilot-waypoint-with-http-info
  "Set Autopilot Waypoint
  Set a solar system as autopilot waypoint

---"
  ([add-to-beginning clear-other-waypoints destination-id ] (post-ui-autopilot-waypoint-with-http-info add-to-beginning clear-other-waypoints destination-id nil))
  ([add-to-beginning clear-other-waypoints destination-id {:keys [datasource token ]}]
   (check-required-params add-to-beginning clear-other-waypoints destination-id)
   (call-api "/v2/ui/autopilot/waypoint/" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"add_to_beginning" add-to-beginning "clear_other_waypoints" clear-other-waypoints "datasource" datasource "destination_id" destination-id "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-ui-autopilot-waypoint
  "Set Autopilot Waypoint
  Set a solar system as autopilot waypoint

---"
  ([add-to-beginning clear-other-waypoints destination-id ] (post-ui-autopilot-waypoint add-to-beginning clear-other-waypoints destination-id nil))
  ([add-to-beginning clear-other-waypoints destination-id optional-params]
   (:data (post-ui-autopilot-waypoint-with-http-info add-to-beginning clear-other-waypoints destination-id optional-params))))

(defn post-ui-openwindow-contract-with-http-info
  "Open Contract Window
  Open the contract window inside the client

---"
  ([contract-id ] (post-ui-openwindow-contract-with-http-info contract-id nil))
  ([contract-id {:keys [datasource token ]}]
   (check-required-params contract-id)
   (call-api "/v1/ui/openwindow/contract/" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"contract_id" contract-id "datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-ui-openwindow-contract
  "Open Contract Window
  Open the contract window inside the client

---"
  ([contract-id ] (post-ui-openwindow-contract contract-id nil))
  ([contract-id optional-params]
   (:data (post-ui-openwindow-contract-with-http-info contract-id optional-params))))

(defn post-ui-openwindow-information-with-http-info
  "Open Information Window
  Open the information window for a character, corporation or alliance inside the client

---"
  ([target-id ] (post-ui-openwindow-information-with-http-info target-id nil))
  ([target-id {:keys [datasource token ]}]
   (check-required-params target-id)
   (call-api "/v1/ui/openwindow/information/" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"datasource" datasource "target_id" target-id "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-ui-openwindow-information
  "Open Information Window
  Open the information window for a character, corporation or alliance inside the client

---"
  ([target-id ] (post-ui-openwindow-information target-id nil))
  ([target-id optional-params]
   (:data (post-ui-openwindow-information-with-http-info target-id optional-params))))

(defn post-ui-openwindow-marketdetails-with-http-info
  "Open Market Details
  Open the market details window for a specific typeID inside the client

---"
  ([type-id ] (post-ui-openwindow-marketdetails-with-http-info type-id nil))
  ([type-id {:keys [datasource token ]}]
   (check-required-params type-id)
   (call-api "/v1/ui/openwindow/marketdetails/" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"datasource" datasource "token" token "type_id" type-id }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-ui-openwindow-marketdetails
  "Open Market Details
  Open the market details window for a specific typeID inside the client

---"
  ([type-id ] (post-ui-openwindow-marketdetails type-id nil))
  ([type-id optional-params]
   (:data (post-ui-openwindow-marketdetails-with-http-info type-id optional-params))))

(defn post-ui-openwindow-newmail-with-http-info
  "Open New Mail Window
  Open the New Mail window, according to settings from the request if applicable

---"
  ([new-mail ] (post-ui-openwindow-newmail-with-http-info new-mail nil))
  ([new-mail {:keys [datasource token ]}]
   (check-required-params new-mail)
   (call-api "/v1/ui/openwindow/newmail/" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    new-mail
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn post-ui-openwindow-newmail
  "Open New Mail Window
  Open the New Mail window, according to settings from the request if applicable

---"
  ([new-mail ] (post-ui-openwindow-newmail new-mail nil))
  ([new-mail optional-params]
   (:data (post-ui-openwindow-newmail-with-http-info new-mail optional-params))))

