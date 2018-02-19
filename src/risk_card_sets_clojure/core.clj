(ns risk-card-sets-clojure.core
  (:gen-class)
  (:require [clojure.string :as str]))

(def valid-cards ["H" "S" "C" "J"])

(defn- split [set-of-cards]
  (str/split set-of-cards #"-"))

(defn replace-jocker [card set]
  (map (fn [c]
    (if (= "J" c)
    card
    c)) set))


(defn all-equal? [current-set]
  (reduce (fn [acc v] (or acc v))
          (map
            (fn [card] (every? #(= card %) current-set))
            valid-cards)))


(defn is-valid-set? [set-of-cards]
  (let [current-set (split set-of-cards)]
   (or
    (and (some #(= % "H") current-set)
         (some #(= % "S") current-set)
         (some #(= % "C") current-set))
    (or (all-equal? (replace-jocker "C" current-set))
        (all-equal? (replace-jocker "S" current-set))
        (all-equal? (replace-jocker "H" current-set))))))
