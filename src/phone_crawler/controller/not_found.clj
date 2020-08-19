(ns phone-crawler.controller.not-found
  (:require [phone-crawler.controller.string-response :as resp]))

(defn not-found []
  (resp/not-found "These aren't the droids you're looking for.\n"))
