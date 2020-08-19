(ns phone-crawler.controller.health-check
  (:require [phone-crawler.controller.string-response :refer [ok internal-server-error]]
            [phone-crawler.controller.curl :refer [curl]]
            [phone-crawler.controller.time :refer [date-and-time-hr]]))




(defn health-check []
  (try
    (curl "https://www.google.com/")
    (ok (str "It's working! It's working!\n" (date-and-time-hr) "\n"))
    (catch Exception e
      (println (.getMessage e))
      (internal-server-error
       (str "I don't think the system works.\n" (date-and-time-hr) "\n")))))
