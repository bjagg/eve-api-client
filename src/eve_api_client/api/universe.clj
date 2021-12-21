(ns eve-api-client.api.universe
  (:require
    [eve-api-client.core :refer [call-api]]
    [eve-swagger-interface.core :refer [check-required-params with-collection-format]])
  (:import
    (java.io File)))

(defn get-universe-ancestries-with-http-info
  "Get ancestries
  Get all character ancestries

---

This route expires daily at 11:05"
  ([] (get-universe-ancestries-with-http-info nil))
  ([{:keys [accept-language datasource if-none-match language ]}]
   (call-api "/v1/universe/ancestries/" :get
             {:path-params   {}
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-ancestries
  "Get ancestries
  Get all character ancestries

---

This route expires daily at 11:05"
  ([] (get-universe-ancestries nil))
  ([optional-params]
   (:data (get-universe-ancestries-with-http-info optional-params))))

(defn get-universe-asteroid-belts-asteroid-belt-id-with-http-info
  "Get asteroid belt information
  Get information on an asteroid belt

---

This route expires daily at 11:05"
  ([asteroid-belt-id ] (get-universe-asteroid-belts-asteroid-belt-id-with-http-info asteroid-belt-id nil))
  ([asteroid-belt-id {:keys [datasource if-none-match ]}]
   (check-required-params asteroid-belt-id)
   (call-api "/v1/universe/asteroid_belts/{asteroid_belt_id}/" :get
             {:path-params   {"asteroid_belt_id" asteroid-belt-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-asteroid-belts-asteroid-belt-id
  "Get asteroid belt information
  Get information on an asteroid belt

---

This route expires daily at 11:05"
  ([asteroid-belt-id ] (get-universe-asteroid-belts-asteroid-belt-id asteroid-belt-id nil))
  ([asteroid-belt-id optional-params]
   (:data (get-universe-asteroid-belts-asteroid-belt-id-with-http-info asteroid-belt-id optional-params))))

(defn get-universe-bloodlines-with-http-info
  "Get bloodlines
  Get a list of bloodlines

---

This route expires daily at 11:05"
  ([] (get-universe-bloodlines-with-http-info nil))
  ([{:keys [accept-language datasource if-none-match language ]}]
   (call-api "/v1/universe/bloodlines/" :get
             {:path-params   {}
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-bloodlines
  "Get bloodlines
  Get a list of bloodlines

---

This route expires daily at 11:05"
  ([] (get-universe-bloodlines nil))
  ([optional-params]
   (:data (get-universe-bloodlines-with-http-info optional-params))))

(defn get-universe-categories-with-http-info
  "Get item categories
  Get a list of item categories

---

This route expires daily at 11:05"
  ([] (get-universe-categories-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/universe/categories/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-categories
  "Get item categories
  Get a list of item categories

---

This route expires daily at 11:05"
  ([] (get-universe-categories nil))
  ([optional-params]
   (:data (get-universe-categories-with-http-info optional-params))))

(defn get-universe-categories-category-id-with-http-info
  "Get item category information
  Get information of an item category

---

This route expires daily at 11:05"
  ([category-id ] (get-universe-categories-category-id-with-http-info category-id nil))
  ([category-id {:keys [accept-language datasource if-none-match language ]}]
   (check-required-params category-id)
   (call-api "/v1/universe/categories/{category_id}/" :get
             {:path-params   {"category_id" category-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-categories-category-id
  "Get item category information
  Get information of an item category

---

This route expires daily at 11:05"
  ([category-id ] (get-universe-categories-category-id category-id nil))
  ([category-id optional-params]
   (:data (get-universe-categories-category-id-with-http-info category-id optional-params))))

(defn get-universe-constellations-with-http-info
  "Get constellations
  Get a list of constellations

---

This route expires daily at 11:05"
  ([] (get-universe-constellations-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/universe/constellations/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-constellations
  "Get constellations
  Get a list of constellations

---

This route expires daily at 11:05"
  ([] (get-universe-constellations nil))
  ([optional-params]
   (:data (get-universe-constellations-with-http-info optional-params))))

(defn get-universe-constellations-constellation-id-with-http-info
  "Get constellation information
  Get information on a constellation

---

This route expires daily at 11:05"
  ([constellation-id ] (get-universe-constellations-constellation-id-with-http-info constellation-id nil))
  ([constellation-id {:keys [accept-language datasource if-none-match language ]}]
   (check-required-params constellation-id)
   (call-api "/v1/universe/constellations/{constellation_id}/" :get
             {:path-params   {"constellation_id" constellation-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-constellations-constellation-id
  "Get constellation information
  Get information on a constellation

---

This route expires daily at 11:05"
  ([constellation-id ] (get-universe-constellations-constellation-id constellation-id nil))
  ([constellation-id optional-params]
   (:data (get-universe-constellations-constellation-id-with-http-info constellation-id optional-params))))

(defn get-universe-factions-with-http-info
  "Get factions
  Get a list of factions

---

This route expires daily at 11:05"
  ([] (get-universe-factions-with-http-info nil))
  ([{:keys [accept-language datasource if-none-match language ]}]
   (call-api "/v2/universe/factions/" :get
             {:path-params   {}
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-factions
  "Get factions
  Get a list of factions

---

This route expires daily at 11:05"
  ([] (get-universe-factions nil))
  ([optional-params]
   (:data (get-universe-factions-with-http-info optional-params))))

(defn get-universe-graphics-with-http-info
  "Get graphics
  Get a list of graphics

---

This route expires daily at 11:05"
  ([] (get-universe-graphics-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/universe/graphics/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-graphics
  "Get graphics
  Get a list of graphics

---

This route expires daily at 11:05"
  ([] (get-universe-graphics nil))
  ([optional-params]
   (:data (get-universe-graphics-with-http-info optional-params))))

(defn get-universe-graphics-graphic-id-with-http-info
  "Get graphic information
  Get information on a graphic

---

This route expires daily at 11:05"
  ([graphic-id ] (get-universe-graphics-graphic-id-with-http-info graphic-id nil))
  ([graphic-id {:keys [datasource if-none-match ]}]
   (check-required-params graphic-id)
   (call-api "/v1/universe/graphics/{graphic_id}/" :get
             {:path-params   {"graphic_id" graphic-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-graphics-graphic-id
  "Get graphic information
  Get information on a graphic

---

This route expires daily at 11:05"
  ([graphic-id ] (get-universe-graphics-graphic-id graphic-id nil))
  ([graphic-id optional-params]
   (:data (get-universe-graphics-graphic-id-with-http-info graphic-id optional-params))))

(defn get-universe-groups-with-http-info
  "Get item groups
  Get a list of item groups

---

This route expires daily at 11:05"
  ([] (get-universe-groups-with-http-info nil))
  ([{:keys [datasource if-none-match page ]}]
   (call-api "/v1/universe/groups/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-groups
  "Get item groups
  Get a list of item groups

---

This route expires daily at 11:05"
  ([] (get-universe-groups nil))
  ([optional-params]
   (:data (get-universe-groups-with-http-info optional-params))))

(defn get-universe-groups-group-id-with-http-info
  "Get item group information
  Get information on an item group

---

This route expires daily at 11:05"
  ([group-id ] (get-universe-groups-group-id-with-http-info group-id nil))
  ([group-id {:keys [accept-language datasource if-none-match language ]}]
   (check-required-params group-id)
   (call-api "/v1/universe/groups/{group_id}/" :get
             {:path-params   {"group_id" group-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-groups-group-id
  "Get item group information
  Get information on an item group

---

This route expires daily at 11:05"
  ([group-id ] (get-universe-groups-group-id group-id nil))
  ([group-id optional-params]
   (:data (get-universe-groups-group-id-with-http-info group-id optional-params))))

(defn get-universe-moons-moon-id-with-http-info
  "Get moon information
  Get information on a moon

---

This route expires daily at 11:05"
  ([moon-id ] (get-universe-moons-moon-id-with-http-info moon-id nil))
  ([moon-id {:keys [datasource if-none-match ]}]
   (check-required-params moon-id)
   (call-api "/v1/universe/moons/{moon_id}/" :get
             {:path-params   {"moon_id" moon-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-moons-moon-id
  "Get moon information
  Get information on a moon

---

This route expires daily at 11:05"
  ([moon-id ] (get-universe-moons-moon-id moon-id nil))
  ([moon-id optional-params]
   (:data (get-universe-moons-moon-id-with-http-info moon-id optional-params))))

(defn get-universe-planets-planet-id-with-http-info
  "Get planet information
  Get information on a planet

---

This route expires daily at 11:05"
  ([planet-id ] (get-universe-planets-planet-id-with-http-info planet-id nil))
  ([planet-id {:keys [datasource if-none-match ]}]
   (check-required-params planet-id)
   (call-api "/v1/universe/planets/{planet_id}/" :get
             {:path-params   {"planet_id" planet-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-planets-planet-id
  "Get planet information
  Get information on a planet

---

This route expires daily at 11:05"
  ([planet-id ] (get-universe-planets-planet-id planet-id nil))
  ([planet-id optional-params]
   (:data (get-universe-planets-planet-id-with-http-info planet-id optional-params))))

(defn get-universe-races-with-http-info
  "Get character races
  Get a list of character races

---

This route expires daily at 11:05"
  ([] (get-universe-races-with-http-info nil))
  ([{:keys [accept-language datasource if-none-match language ]}]
   (call-api "/v1/universe/races/" :get
             {:path-params   {}
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-races
  "Get character races
  Get a list of character races

---

This route expires daily at 11:05"
  ([] (get-universe-races nil))
  ([optional-params]
   (:data (get-universe-races-with-http-info optional-params))))

(defn get-universe-regions-with-http-info
  "Get regions
  Get a list of regions

---

This route expires daily at 11:05"
  ([] (get-universe-regions-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/universe/regions/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-regions
  "Get regions
  Get a list of regions

---

This route expires daily at 11:05"
  ([] (get-universe-regions nil))
  ([optional-params]
   (:data (get-universe-regions-with-http-info optional-params))))

(defn get-universe-regions-region-id-with-http-info
  "Get region information
  Get information on a region

---

This route expires daily at 11:05"
  ([region-id ] (get-universe-regions-region-id-with-http-info region-id nil))
  ([region-id {:keys [accept-language datasource if-none-match language ]}]
   (check-required-params region-id)
   (call-api "/v1/universe/regions/{region_id}/" :get
             {:path-params   {"region_id" region-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-regions-region-id
  "Get region information
  Get information on a region

---

This route expires daily at 11:05"
  ([region-id ] (get-universe-regions-region-id region-id nil))
  ([region-id optional-params]
   (:data (get-universe-regions-region-id-with-http-info region-id optional-params))))

(defn get-universe-stargates-stargate-id-with-http-info
  "Get stargate information
  Get information on a stargate

---

This route expires daily at 11:05"
  ([stargate-id ] (get-universe-stargates-stargate-id-with-http-info stargate-id nil))
  ([stargate-id {:keys [datasource if-none-match ]}]
   (check-required-params stargate-id)
   (call-api "/v1/universe/stargates/{stargate_id}/" :get
             {:path-params   {"stargate_id" stargate-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-stargates-stargate-id
  "Get stargate information
  Get information on a stargate

---

This route expires daily at 11:05"
  ([stargate-id ] (get-universe-stargates-stargate-id stargate-id nil))
  ([stargate-id optional-params]
   (:data (get-universe-stargates-stargate-id-with-http-info stargate-id optional-params))))

(defn get-universe-stars-star-id-with-http-info
  "Get star information
  Get information on a star

---

This route expires daily at 11:05"
  ([star-id ] (get-universe-stars-star-id-with-http-info star-id nil))
  ([star-id {:keys [datasource if-none-match ]}]
   (check-required-params star-id)
   (call-api "/v1/universe/stars/{star_id}/" :get
             {:path-params   {"star_id" star-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-stars-star-id
  "Get star information
  Get information on a star

---

This route expires daily at 11:05"
  ([star-id ] (get-universe-stars-star-id star-id nil))
  ([star-id optional-params]
   (:data (get-universe-stars-star-id-with-http-info star-id optional-params))))

(defn get-universe-stations-station-id-with-http-info
  "Get station information
  Get information on a station

---

This route expires daily at 11:05"
  ([station-id ] (get-universe-stations-station-id-with-http-info station-id nil))
  ([station-id {:keys [datasource if-none-match ]}]
   (check-required-params station-id)
   (call-api "/v2/universe/stations/{station_id}/" :get
             {:path-params   {"station_id" station-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-stations-station-id
  "Get station information
  Get information on a station

---

This route expires daily at 11:05"
  ([station-id ] (get-universe-stations-station-id station-id nil))
  ([station-id optional-params]
   (:data (get-universe-stations-station-id-with-http-info station-id optional-params))))

(defn get-universe-structures-with-http-info
  "List all public structures
  List all public structures

---

This route is cached for up to 3600 seconds"
  ([] (get-universe-structures-with-http-info nil))
  ([{:keys [datasource filter if-none-match ]}]
   (call-api "/v1/universe/structures/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "filter" filter }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-structures
  "List all public structures
  List all public structures

---

This route is cached for up to 3600 seconds"
  ([] (get-universe-structures nil))
  ([optional-params]
   (:data (get-universe-structures-with-http-info optional-params))))

(defn get-universe-structures-structure-id-with-http-info
  "Get structure information
  Returns information on requested structure if you are on the ACL. Otherwise, returns \"Forbidden\" for all inputs.

---

This route is cached for up to 3600 seconds"
  ([structure-id ] (get-universe-structures-structure-id-with-http-info structure-id nil))
  ([structure-id {:keys [datasource if-none-match token ]}]
   (check-required-params structure-id)
   (call-api "/v2/universe/structures/{structure_id}/" :get
             {:path-params   {"structure_id" structure-id }
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "token" token }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    ["evesso"]})))

(defn get-universe-structures-structure-id
  "Get structure information
  Returns information on requested structure if you are on the ACL. Otherwise, returns \"Forbidden\" for all inputs.

---

This route is cached for up to 3600 seconds"
  ([structure-id ] (get-universe-structures-structure-id structure-id nil))
  ([structure-id optional-params]
   (:data (get-universe-structures-structure-id-with-http-info structure-id optional-params))))

(defn get-universe-system-jumps-with-http-info
  "Get system jumps
  Get the number of jumps in solar systems within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with jumps will be listed

---

This route is cached for up to 3600 seconds"
  ([] (get-universe-system-jumps-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/universe/system_jumps/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-system-jumps
  "Get system jumps
  Get the number of jumps in solar systems within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with jumps will be listed

---

This route is cached for up to 3600 seconds"
  ([] (get-universe-system-jumps nil))
  ([optional-params]
   (:data (get-universe-system-jumps-with-http-info optional-params))))

(defn get-universe-system-kills-with-http-info
  "Get system kills
  Get the number of ship, pod and NPC kills per solar system within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with kills will be listed

---

This route is cached for up to 3600 seconds"
  ([] (get-universe-system-kills-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v2/universe/system_kills/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-system-kills
  "Get system kills
  Get the number of ship, pod and NPC kills per solar system within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with kills will be listed

---

This route is cached for up to 3600 seconds"
  ([] (get-universe-system-kills nil))
  ([optional-params]
   (:data (get-universe-system-kills-with-http-info optional-params))))

(defn get-universe-systems-with-http-info
  "Get solar systems
  Get a list of solar systems

---

This route expires daily at 11:05"
  ([] (get-universe-systems-with-http-info nil))
  ([{:keys [datasource if-none-match ]}]
   (call-api "/v1/universe/systems/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-systems
  "Get solar systems
  Get a list of solar systems

---

This route expires daily at 11:05"
  ([] (get-universe-systems nil))
  ([optional-params]
   (:data (get-universe-systems-with-http-info optional-params))))

(defn get-universe-systems-system-id-with-http-info
  "Get solar system information
  Get information on a solar system.

---

This route expires daily at 11:05"
  ([system-id ] (get-universe-systems-system-id-with-http-info system-id nil))
  ([system-id {:keys [accept-language datasource if-none-match language ]}]
   (check-required-params system-id)
   (call-api "/v4/universe/systems/{system_id}/" :get
             {:path-params   {"system_id" system-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-systems-system-id
  "Get solar system information
  Get information on a solar system.

---

This route expires daily at 11:05"
  ([system-id ] (get-universe-systems-system-id system-id nil))
  ([system-id optional-params]
   (:data (get-universe-systems-system-id-with-http-info system-id optional-params))))

(defn get-universe-types-with-http-info
  "Get types
  Get a list of type ids

---

This route expires daily at 11:05"
  ([] (get-universe-types-with-http-info nil))
  ([{:keys [datasource if-none-match page ]}]
   (call-api "/v1/universe/types/" :get
             {:path-params   {}
              :header-params {"If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "page" page }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-types
  "Get types
  Get a list of type ids

---

This route expires daily at 11:05"
  ([] (get-universe-types nil))
  ([optional-params]
   (:data (get-universe-types-with-http-info optional-params))))

(defn get-universe-types-type-id-with-http-info
  "Get type information
  Get information on a type

---

This route expires daily at 11:05"
  ([type-id ] (get-universe-types-type-id-with-http-info type-id nil))
  ([type-id {:keys [accept-language datasource if-none-match language ]}]
   (check-required-params type-id)
   (call-api "/v3/universe/types/{type_id}/" :get
             {:path-params   {"type_id" type-id }
              :header-params {"Accept-Language" accept-language "If-None-Match" if-none-match }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-universe-types-type-id
  "Get type information
  Get information on a type

---

This route expires daily at 11:05"
  ([type-id ] (get-universe-types-type-id type-id nil))
  ([type-id optional-params]
   (:data (get-universe-types-type-id-with-http-info type-id optional-params))))

(defn post-universe-ids-with-http-info
  "Bulk names to IDs
  Resolve a set of names to IDs in the following categories: agents, alliances, characters, constellations, corporations factions, inventory_types, regions, stations, and systems. Only exact matches will be returned. All names searched for are cached for 12 hours

---"
  ([names ] (post-universe-ids-with-http-info names nil))
  ([names {:keys [accept-language datasource language ]}]
   (check-required-params names)
   (call-api "/v1/universe/ids/" :post
             {:path-params   {}
              :header-params {"Accept-Language" accept-language }
              :query-params  {"datasource" datasource "language" language }
              :form-params   {}
              :body-param    names
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn post-universe-ids
  "Bulk names to IDs
  Resolve a set of names to IDs in the following categories: agents, alliances, characters, constellations, corporations factions, inventory_types, regions, stations, and systems. Only exact matches will be returned. All names searched for are cached for 12 hours

---"
  ([names ] (post-universe-ids names nil))
  ([names optional-params]
   (:data (post-universe-ids-with-http-info names optional-params))))

(defn post-universe-names-with-http-info
  "Get names and categories for a set of IDs
  Resolve a set of IDs to names and categories. Supported ID's for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types, Factions

---"
  ([ids ] (post-universe-names-with-http-info ids nil))
  ([ids {:keys [datasource ]}]
   (check-required-params ids)
   (call-api "/v3/universe/names/" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"datasource" datasource }
              :form-params   {}
              :body-param    ids
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn post-universe-names
  "Get names and categories for a set of IDs
  Resolve a set of IDs to names and categories. Supported ID's for resolving are: Characters, Corporations, Alliances, Stations, Solar Systems, Constellations, Regions, Types, Factions

---"
  ([ids ] (post-universe-names ids nil))
  ([ids optional-params]
   (:data (post-universe-names-with-http-info ids optional-params))))

