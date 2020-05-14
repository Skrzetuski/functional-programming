(ns fp.cube)

(def precision 0.1)

(defn cube [x]
  (* x x x))

(defn good-enough?
  [y x]
  (< (Math/abs ^double (- x (cube y))) precision))

(defn improve
  [y x]
  (/ (+ (/ x (* y y )) (* y 2)) 3))

(defn heron-cube
  "Estimating the cube root by Heron method"
  [y x]
  (if (good-enough? y x)
    y
    (heron-cube (improve y x) x)))