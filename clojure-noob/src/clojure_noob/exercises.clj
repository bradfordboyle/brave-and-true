(ns clojure-noob.exercises
  (:gen-class))

;;; Write a function that takes a number and adds 100 to it
(defn inc-by-100
  "Increment by 100"
  [x]
  (+ x 100))

;;; Write a function that works exactly like the function inc-maker except with
;;; subtraction
(defn dec-maker
  "Create a custom decremator"
  [dec-by]
  #(- % dec-by))

(def dec9 (dec-maker 9))

;;; Write a function that works like map except the return value is a set
(defn mapset
  [f coll]
  (set (map f coll)))

;;; Create a function that’s similar to symmetrize-body-parts except that it
;;; has to work with weird space aliens with radial symmetry. Instead of two
;;; eyes, arms, legs, and so on, they have five
(defn matching-parts-maker
  [prefix replacements]
  (fn  [part]
    (map  (fn  [r]
            {:name  (clojure.string/replace  (:name part) prefix r)
             :size  (:size part)}) replacements)))

;; using reduce with an anonymous functions
(defn symmetrize-body-parts
  "Expects a seq of maps that have a :name and :size"
  [matching-parts asym-body-parts]
  (reduce (fn [final-body-parts part]
            (into final-body-parts (set (conj (matching-parts part) part))))
          []
          asym-body-parts))

;; alien violence
(defn hit
  [sym-body-parts]
  (let [body-part-size-sum (reduce + (map :size sym-body-parts))
        target (rand body-part-size-sum)]
    (loop [[part & remaining] sym-body-parts
           accumulated-size (:size part)]
      (if (> accumulated-size target)
        part
        (recur remaining (+ accumulated-size (:size (first remaining))))))))
