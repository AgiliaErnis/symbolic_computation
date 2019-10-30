;; Example 1
(filter even?
  (range 1 10))

;; Example 2
(let [thing1 "some stuff"
      thing2 "other stuff"]
  (foo thing1 thing2))

;; Example 3
(when something
  (something-else)
  )

;; Example 4
(ns examples.ns
  (:use clojure.zip))

;; Example 5
{:name "Bruce" :age 30}
