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

(defn euler
  [numb]
  (if (zero? (remainder numb))
    (println numb)
    (recur (inc20 numb)))
  )

(defn -main
  [& args]
  (time (euler smallest-number)) ;; 26,5s
  )