(defproject org.clojars.bjagg/eve-api-client "1.3.8"
  :description "An OpenAPI for EVE Online -- Clojure Client"
  :url "https://github.com/bjagg/eve-api-client"
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clj-http "3.6.0"]
                 [cheshire "5.5.0"]]
  :deploy-repositories [[ "clojars" {:url "https://repo.clojars.org" :creds :gpg}]])
