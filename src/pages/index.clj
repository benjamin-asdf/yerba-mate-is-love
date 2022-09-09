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
    [:h1 "yerba mate is love"]
    [:h2 "Prepare"]
    [:div "Put some herb into the gourd."]
    [:div "Shake and move the mate to one side."]
    [:div "Awaken the mate with cold water."]
    [:div "Be patient and do not stir the mate."]
    [:div
     {:style {"font-weight" "bold" "color" "OrangeRed"}}
     "Really, do not stir it"]])))
