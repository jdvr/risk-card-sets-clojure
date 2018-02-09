(ns risk-card-sets-clojure.core-test
  (:require [clojure.test :refer :all]
            [risk-card-sets-clojure.core :refer :all]))

(deftest validate-card-set
  (testing "given H-H-H it should return true"
    (is (= true (is-valid-set? "H-H-H")))))
