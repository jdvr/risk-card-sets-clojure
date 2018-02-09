(ns risk-card-sets-clojure.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defn split [set-of-cards]
  (str/split set-of-cards #"-"))

(defn is-valid-set? [set-of-cards]
  (= (count (filter #(= "H" %) (split set-of-cards))) 3))
