(ns fp.euler)

;;2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
;;What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

;;TODO: Works for JVM -Xss1024m but I guess it's not suitable xD
(def smallest-number 2520)  ;;232792560

(defn inc20
  [number]
  (+ number 20))

(defn remainder
  [smallest-number]
  (reduce + (map mod (repeat 20 smallest-number) (range 2 21))))

(defn euler
  [smallest-number]
  (if (= 0 (remainder smallest-number))
    smallest-number
    (euler (inc20 smallest-number))))

(defn -main
  [& args]
  (println (euler smallest-number)))