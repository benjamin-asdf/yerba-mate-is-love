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
    (into [:div] (repeat 10 [:div "trollolol "]))
    [:h2 "Prepare"]
    [:div "Put some herb into the gourd."]
    [:div
     "Shake and move the herb to one side.
 Awake the herb with cold water.
 Be patient and do not stir the mate."]
    [:div
     {:style
      {"font-weight" "bold" "color" "OrangeRed" "font-size" "2em"}}
<<<<<<< HEAD
     "Really, never stir it, for real!"]])))
=======
     "Really, never stir it"]
    [:img
     {:src
      "https://i.imgur.com/0z7vdvs.png"}]])))
>>>>>>> e5c7a4daf61bd4de9cd6548da274f87746922661
