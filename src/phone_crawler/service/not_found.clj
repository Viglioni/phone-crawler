(ns phone-crawler.service.not-found
  (:require [compojure.core :refer [ANY]]
            [phone-crawler.controller.not-found :as controller]
            [compojure.route :as route]))


(def not-found
  (ANY "*" [] (controller/not-found)))
