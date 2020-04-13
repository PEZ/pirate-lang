(ns pez.lab.reverse
  (:refer-clojure :exclude [reverse]))

;; We are Only allowed to use the
;; * first
;; * cons
;; * rest
;; * concat
;; * count

(defn reverse' [head tail]
  (if (empty? tail)
    head
    (reverse' (cons (first tail) head) (rest tail))))

(defn reverse [lst]
  (reverse' '() lst))

(comment
  (reverse (str 512345)))