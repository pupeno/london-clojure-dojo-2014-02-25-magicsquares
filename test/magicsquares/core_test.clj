(ns magicsquares.core-test
  (:require [clojure.test :refer :all]
            [magicsquares.core :refer :all]))

(deftest simple-test
  (is (magic-square? [[2 7 6]
                      [9 5 1]
                      [4 3 8]])))

(deftest bigger-test
  (is (magic-square? [[7 12 1 14]
                      [2 13 8 11]
                      [16 3 10 5]
                      [9 6 15 4]])))

(deftest negative-simple-test
  (is (not (magic-square? [[2 7 6]
                           [9 5 1]
                           [4 3 1]]))))

;(deftest breaking-square
;  (is (not (magic-square? [[2 7 6]
;                           [9 1]
;                           [4 3 8]]))))
