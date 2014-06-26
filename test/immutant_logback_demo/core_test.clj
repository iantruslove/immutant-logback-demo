(ns immutant-logback-demo.core-test
  (:require [immutant-logback-demo.core :refer :all]
            [clojure.test :refer :all]))

(deftest test-not-much
  (is (= 200 (:status (app {:uri "/" :request-method :get})))))
