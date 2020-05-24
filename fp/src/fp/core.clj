(ns fp.core
  (:gen-class)
  (:require [fp.heron :as heron])
  (:require [fp.cube :as cube])
  (:require [fp.euler :as euler5]))

(defn -main
  [& args]
  ;; First task: Heron limited in steps
  (println "Task 1.")
  (print "heron-sqrt-steps(5) 100 = ")
  (println (double (heron/heron-sqrt-steps 1 100 5))) ;; 10.03257851096061
  (print "heron-sqrt-steps(7) 25 = ")
  (println (double (heron/heron-sqrt-steps 1 25 7)))  ;; 5.0
  (print "heron-sqrt-steps(3) 2 = ")
  (println (double (heron/heron-sqrt-steps 1 2 3)))   ;; 1.41421568627451
  ;; Second task: cube root Heron method
  (println "Task 2.")
  (print "cube-root 27 = ")
  (println (double (cube/heron-cube 1 27)))   ;;3.001274406506175
  (print "cube-root 125 = ")
  (println (double (cube/heron-cube 1 125)))  ;;5.000037942835659
  (print "cube-root 64 = ")
  (println (double (cube/heron-cube 1 64)))   ;;4.000017449510738
  ;; Third task: Euler 5 problem
  (println "Task 3.")
  (println (str "Euler5 = " (euler5/faster-euler 2520)))    ;;232792560
  )
