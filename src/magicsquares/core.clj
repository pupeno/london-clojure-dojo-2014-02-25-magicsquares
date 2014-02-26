(ns magicsquares.core
  (:gen-class))

; This can actually be written as (apply map vector ms)
(defn verticals [ms]
  (map (fn [idx]
         (map (fn [row] (nth row idx))
              ms))
       (range (count ms))))

(defn diagonals [ms]
  [(map nth
        ms (range (count ms)))
   (map nth
        ms (reverse (range (count ms))))])

(defn magic-square? [ms]
  (apply = (map (fn [x] (apply + x))
                (concat ms
                        (verticals ms)
                        (diagonals ms)))))