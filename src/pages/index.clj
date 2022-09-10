(ns pages.index
  (:require
   [clojure.java.io :as io]
   [hiccup2.core :as h]))

(spit
 "public/index.html"
 (format
  (slurp (io/resource "base.html"))
  (h/html
   [:div
    [:h1 "Yerba mate is love"]
    [:h2 "Prepare"]
    [:div "Put some herb into the gourd."]
    [:div
     "Shake and move the herb to one side.
 Awake the herb with cold water.
 Be patient and do not stir the mate."]
    [:div
     {:style
      {"font-weight" "bold" "color" "OrangeRed" "font-size" "2em"}}
     "Really, never stir it, for real!"]])))
