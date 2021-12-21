(ns eve-api-client.api.calendar
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-api-client.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-characters-character-id-calendar-with-http-info
  "List calendar event summaries
  Get 50 event summaries from the calendar. If no from_event ID is given, the resource will return the next 50 chronological event summaries from now. If a from_event ID is specified, it will return the next 50 chronological event summaries from after that event

---

This route is cached for up to 5 seconds"
  ([character-id ] (get-characters-character-id-calendar-with-http-info character-id nil))
  ([character-id {:keys [datasource from-event if-none-match token ]}]
   (check-required-params character-id)
   (call-api "/v1/characters/{character_id}/calendar/" :get
             {:path-params   {"character_id" character-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "from_event" from-event "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-calendar
  "List calendar event summaries
  Get 50 event summaries from the calendar. If no from_event ID is given, the resource will return the next 50 chronological event summaries from now. If a from_event ID is specified, it will return the next 50 chronological event summaries from after that event

---

This route is cached for up to 5 seconds"
  ([character-id ] (get-characters-character-id-calendar character-id nil))
  ([character-id optional-params]
   (:data (get-characters-character-id-calendar-with-http-info character-id optional-params))))

(defn get-characters-character-id-calendar-event-id-with-http-info
  "Get an event
  Get all the information for a specific event

---

This route is cached for up to 5 seconds"
  ([character-id event-id ] (get-characters-character-id-calendar-event-id-with-http-info character-id event-id nil))
  ([character-id event-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id event-id)
   (call-api "/v3/characters/{character_id}/calendar/{event_id}/" :get
             {:path-params   {"character_id" character-id "event_id" event-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-calendar-event-id
  "Get an event
  Get all the information for a specific event

---

This route is cached for up to 5 seconds"
  ([character-id event-id ] (get-characters-character-id-calendar-event-id character-id event-id nil))
  ([character-id event-id optional-params]
   (:data (get-characters-character-id-calendar-event-id-with-http-info character-id event-id optional-params))))

(defn get-characters-character-id-calendar-event-id-attendees-with-http-info
  "Get attendees
  Get all invited attendees for a given event

---

This route is cached for up to 600 seconds"
  ([character-id event-id ] (get-characters-character-id-calendar-event-id-attendees-with-http-info character-id event-id nil))
  ([character-id event-id {:keys [datasource if-none-match token ]}]
   (check-required-params character-id event-id)
   (call-api "/v1/characters/{character_id}/calendar/{event_id}/attendees/" :get
             {:path-params   {"character_id" character-id "event_id" event-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-characters-character-id-calendar-event-id-attendees
  "Get attendees
  Get all invited attendees for a given event

---

This route is cached for up to 600 seconds"
  ([character-id event-id ] (get-characters-character-id-calendar-event-id-attendees character-id event-id nil))
  ([character-id event-id optional-params]
   (:data (get-characters-character-id-calendar-event-id-attendees-with-http-info character-id event-id optional-params))))

(defn put-characters-character-id-calendar-event-id-with-http-info
  "Respond to an event
  Set your response status to an event

---

This route is cached for up to 5 seconds"
  ([character-id event-id response ] (put-characters-character-id-calendar-event-id-with-http-info character-id event-id response nil))
  ([character-id event-id response {:keys [datasource token ]}]
   (check-required-params character-id event-id response)
   (call-api "/v3/characters/{character_id}/calendar/{event_id}/" :put
             {:path-params   {"character_id" character-id "event_id" event-id }
              :header-params {}
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :body-param    response
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn put-characters-character-id-calendar-event-id
  "Respond to an event
  Set your response status to an event

---

This route is cached for up to 5 seconds"
  ([character-id event-id response ] (put-characters-character-id-calendar-event-id character-id event-id response nil))
  ([character-id event-id response optional-params]
   (:data (put-characters-character-id-calendar-event-id-with-http-info character-id event-id response optional-params))))

