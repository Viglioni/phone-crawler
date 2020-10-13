(ns phone-crawler.logic.phone-info-test
  (:require [phone-crawler.logic.phone-info :refer [phones]]
            [clojure.test :refer :all]
            [clojure.string :refer [join]]))


(def valid-phones
  (list "(11) 1111-1111"
        "(11) 11111-1111"
        "(11)1111-1111"
        "(11)11111-1111"
        "11 1111-1111"
        "11 11111-1111"
        "1111-1111"
        "11111-1111"))

(deftest valid-phones
  (println valid-phones)
  (println (join "," valid-phones))
  (is true))
