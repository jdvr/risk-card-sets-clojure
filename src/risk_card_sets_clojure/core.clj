(ns risk-card-sets-clojure.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defn split [set-of-cards]
  (str/split set-of-cards #"-"))

(defn is-valid-set? [set-of-cards]
  (let [current-set (split set-of-cards)]
   (or
    (and (some #(= % "H") current-set) (some #(= % "S") current-set) (some #(= % "C") current-set))
    (= (count (filter #(= "H" %) current-set)) 3)
    (= (count (filter #(= "S" %) current-set)) 3))))
