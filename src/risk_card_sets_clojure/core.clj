(ns risk-card-sets-clojure.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defn split [set-of-cards]
  (str/split set-of-cards #"-"))

(defn is-valid-set? [set-of-cards]
  (let [current-set (split set-of-cards)]
   (or
    (= (count (filter #(= "H" %) current-set)) 3)
    (= (count (filter #(= "S" %) current-set)) 3))))
