(ns fp.euler)

;;2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
;;What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

(def smallest-number 2520)

(defn inc20
  [number]
  (+ number 20))

(defn remainder
  [smallest-number]
  (reduce + (map mod (repeat 20 smallest-number) (range 2 21)))) ;;2->20

(defn div-number-in-range?
  [number div-start div-max]
  (if (and (not= 0 (mod number div-start)) (< div-start div-max))
    false
    (if (>= div-start div-max)
      true
      (recur number (inc div-start) div-max)))
  )

(defn euler
  [number]
  (if (zero? (remainder number))
    number
    (recur (inc20 number)))
  )

(defn faster-euler
  [number]
  (if (div-number-in-range? number 2 20)
    number
    (recur (inc20 number)))
  )

(defn -main
  [& args]
  ;;(time (println (faster-euler smallest-number))) 676 ms
  ;;(time (euler smallest-number)) ;; 26,5s
  )