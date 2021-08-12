(ns pez.lab.sicp.heron)

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn average [a1 a2]
  (/ (+ a1 a2) 2))

(defn square [x]
  (* x x))

(defn sqrt [x]
  (let [improve (fn [guess]
                  (average guess (/ x guess)))
        good-enough? (fn [guess]
                       (< (abs (- (square guess) x))
                          1/1000000000))
        try-guess (fn try-guess [guess]
                    (if (good-enough? guess)
                      guess
                      (try-guess (improve guess))))]
    #_ (improve 1)
    (try-guess 1)))

(comment
  (defn sqrt [x]
    (let [improve (fn [guess]
                    (average guess (/ x guess)))
          good-enough? (fn [guess]
                         (< (abs (- (square guess) x))
                            1/1000))
          try-guess (fn try-guess [guess]
                      (if (good-enough? guess)
                        guess
                        (try-guess (improve guess))))]
      #_(improve 1)
    (try-guess 1)))

  (sqrt 1) ; => 1
  (sqrt 2) ; => 577/408
  (sqrt 3) ; => 97/56
  (sqrt 4) ; => 21523361/10761680
  (sqrt 9) ; => 65537/21845
)