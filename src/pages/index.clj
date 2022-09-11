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
    [:h1 "Yerba mate is love"
     {:style {"align" "center"}}]
    [:div.slideshow-container
     [:div.mySlides.fade
      [:img
       {:style "width:100%", :src "https://i.imgur.com/4HTThIp.jpeg"}]]
     [:div.mySlides.fade
      [:img
       {:style "width:100%", :src "https://i.imgur.com/3TDlK1R.jpeg"}]]
    [:a.prev {:onclick "plusSlides(-1)"} "❮"]
    [:a.next {:onclick "plusSlides(1)"} "❯"]]
   [:br]
   [:div
    {:style "text-align:center"}
    [:span.dot {:onclick "currentSlide(1)"}]
    [:span.dot {:onclick "currentSlide(2)"}]]]
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
     "Really, never stir it, for real!"]
    [:img
     {:src
      "https://i.imgur.com/0z7vdvs.png"}])))
