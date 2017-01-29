(ns clojure7.post.post
  (:require [korma.db :refer :all]
            [korma.core :refer :all]
            [clojure7.db :refer :all]))

(defentity post)

(defn find-all
  []
  (select post))

(defn create
  [name category]
  (insert post
    (values {:name name :category category})))