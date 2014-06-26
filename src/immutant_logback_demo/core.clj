(ns immutant-logback-demo.core
  (:require [clojure.tools.logging :as log]
            [compojure.core :refer [defroutes GET]]))

(defroutes app
  (GET "/" [:as request]
    (log/debug "Debug")
    (log/info "Info")
    (log/warn "Warn")
    (log/error "Error")
    (log/fatal "Just kidding")
    "How much wood would a woodchuck chuck if a woodchuck could chuck wood?"))
