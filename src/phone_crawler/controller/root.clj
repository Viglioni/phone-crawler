(ns phone-crawler.controller.root
  (:require [phone-crawler.controller.string-response :refer [ok]]))

(defn hello-world []
  (ok "Hello There\n"))
