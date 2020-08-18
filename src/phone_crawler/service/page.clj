(ns phone-crawler.service.page
  (:require [compojure.core :refer [context GET]]
            [phone-crawler.controller.page :as controller]))

(def page
  (context
   "/page" []
   (GET "/" [page-url]
        (controller/phones page-url ))
   ))
