(ns pages.index
  (:require
   [clojure.java.io :as io]
   [hiccup2.core :as h]))

(spit
 "public/index.html"
 (format
  (slurp (io/resource "base.html"))
  (h/html
   [:h1 "yerba mate is love"
    [:div
     [:h2 "Prepare"]
     [:div "Do not stir the mate"]
     [:div "Really do not stir it"]]])))
