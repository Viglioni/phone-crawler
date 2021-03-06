(ns phone-crawler.controller.page
  (:require [ring.util.http-response :refer [ok]]
            [phone-crawler.controller.string-response :as resp]
            [phone-crawler.logic.phone-info :as logic]
            [phone-crawler.controller.curl :refer [curl]]
            [phone-crawler.controller.time :refer [date-and-time-js]]))

(defn page
  "Curls a page"
  [page-url]
  (curl page-url))


(defn bad-request []
  (resp/bad-request "I find your lack of page-url disturbing.\n"))


(defn phones [page-url]
  (if (or (not page-url) (= "" page-url))
    (bad-request)
    (try
      (let [html (page page-url)
            caught-phones (logic/phones html)]
        (ok {:phones caught-phones}))
      (catch Exception e
        (resp/internal-server-error (str "Cannot crawl " page-url))))))


