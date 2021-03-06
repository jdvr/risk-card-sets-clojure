(ns risk-card-sets-clojure.core-test
  (:require [clojure.test :refer :all]
            [risk-card-sets-clojure.core :refer :all]))

(deftest validate-card-set
  (testing "given H-H-H it should return true"
    (is (= true (is-valid-set? "H-H-H"))))
  (testing "given H-H-S it should return false"
    (is (= false (is-valid-set? "H-H-S"))))
  (testing "given S-S-S it should return true"
    (is (= true (is-valid-set? "S-S-S"))))
  (testing "given C-H-S it should return true"
    (is (= true (is-valid-set? "C-H-S"))))
  (testing "given C-C-C it should return true"
    (is (= true (is-valid-set? "C-C-C"))))
  (testing "given C-J-C it should return true"
    (is (= true (is-valid-set? "C-J-C"))))
  (testing "given H-J-J it should return true"
    (is (= true (is-valid-set? "H-J-J"))))
  (testing "given H-J-S it should return false"
    (is (= false (is-valid-set? "H-J-S")))))
