(ns phone-crawler.service.routes
  (:require [compojure.core :refer [defroutes]]
            [phone-crawler.service.root :refer [root]]
            [phone-crawler.service.health-check :refer [health-check]]
            [phone-crawler.service.not-found :refer [not-found]]
            [phone-crawler.service.page :refer [page]]))

(defroutes app-routes
  root
  health-check
  page
  not-found)

