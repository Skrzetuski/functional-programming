(ns fp.heron)

(defn steps-limit?
  [steps]
  (= 0 steps))

(defn avg
  [x y]
  (/ (+ x y) 2))

(defn improve
  [y x]
  (avg y (/ x y)))

(defn heron-sqrt-steps
  "Heron limited at execution"
  [y x steps]
  (if (steps-limit? steps)
    y
    (heron-sqrt-steps (improve y x) x (dec steps))))