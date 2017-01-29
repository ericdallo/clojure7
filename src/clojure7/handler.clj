(ns clojure7.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.json :refer [wrap-json-response wrap-json-body]]
            [clojure7.post.post :as post]))

(defroutes all-routes
  (GET "/" [] "Hello World")
  (GET "/posts" [] (post/find-all))
  (POST "/posts" req
  	(let [name (get-in req [:body "name"])
          category (get-in req [:body "category"])]
          (post/create name category)))
  (route/not-found "Not Found"))

(def app
  (-> all-routes
    wrap-json-response
    wrap-json-body))
