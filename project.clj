(defproject immutant-logback-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :resource-paths ["resources"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [ring "1.2.2"]
                 [org.slf4j/slf4j-api "1.7.7"]
                 [org.slf4j/jul-to-slf4j "1.7.7"]
                 [org.slf4j/jcl-over-slf4j "1.7.7"]
                 [org.slf4j/log4j-over-slf4j "1.7.7"]
                 [ch.qos.logback/logback-core "1.1.2"]
                 [ch.qos.logback/logback-classic "1.1.2"]
                 [org.clojure/tools.logging "0.2.6"]]

  :exclusions [org.slf4j/slf4j-log4j12
               org.slf4j/slf4j-api
               org.slf4j/slf4j-nop
               log4j/log4j
               log4j
               commons-logging/commons-logging
               org.clojure/tools.logging]
  :ring {:handler immutant-logback-demo.core/app}
  :immutant {:context-path "/"}
  :plugins [[lein-immutant "1.2.0"]]
  )
