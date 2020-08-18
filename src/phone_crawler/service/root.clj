(ns phone-crawler.service.root
  (:require [compojure.core :refer [GET context]]
            [phone-crawler.controller.root :as controller]))

(def root
  (context
   "/" []
   (GET "/" [] (controller/hello-world))))
