(defproject com.jaggedcode/eve-api-client "1.10.1.1"
  :description "An OpenAPI for EVE Online -- Clojure Client"
  :url "https://github.com/bjagg/eve-api-client"
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :scm {:name "git"
        :url "https://github.com/bjagg/eve-api-client"
        :developerConnection "scm:git:git@github.com:bjagg/eve-api-client.git"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [clj-http "3.12.3"]
                 [cheshire "5.10.1"]]
  :deploy-repositories [[ "clojars" {:url "https://repo.clojars.org/"
                                     :creds :gpg}]
                        ["releases" :clojars]
                        ["snapshots" :clojars]]
  :pom-location "target/")
