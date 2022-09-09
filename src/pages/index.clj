(ns pages.index
  (:require
   [clojure.java.io :as io]
   [hiccup2.core :as h]))



(spit
 "public/index.html"
 (format
  (slurp (io/resource "base.html"))
  (h/html [:h1 "hello"])))
