(ns phone-crawler.service.health-check
  (:require [compojure.core :refer [GET context]]
            [phone-crawler.controller.health-check :as controller]))

(def health-check
  (context
   "/health-check" []
   (GET "/" [] (controller/health-check))))

