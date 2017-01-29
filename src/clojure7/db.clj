(ns clojure7.db
  (:use korma.db))

  (defdb db (mysql
            { :classname "com.mysql.jdbc.Driver"
              :subprotocol "mysql"
              :subname "//localhost/clojure7"
              :user "root"
              :password ""}))