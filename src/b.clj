(ns b
  (:require [a :as a]))

(defn bfn
  []
  (a/afn 1)
  (try (a/afn 1)
       (finally)))