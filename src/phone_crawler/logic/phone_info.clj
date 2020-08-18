(ns phone-crawler.logic.phone-info)

(def region-code-pattern #"\(?[0-9]{2}\)? ?")
(def phone-base-patern "[0-9]{4,5}-[0-9]{4}")
(def phone-pattern
  (re-pattern
   (str phone-base-patern "|" region-code-pattern phone-base-patern)))


(defn phones [html]
  (re-seq phone-pattern (str html)))

