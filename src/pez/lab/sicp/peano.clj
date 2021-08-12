(ns pez.lab.sicp.peano)

(defn plus-a [x y]
  (if (zero? x)
    y
    (plus-a (dec x) (inc y))))

(comment
  (plus-a -4 5.5))

(defn plus-b [x y]
  (if (zero? x)
    y
    (inc (plus-b (dec x) y))))

(comment
  (plus-b 4.5 5.5))
  
