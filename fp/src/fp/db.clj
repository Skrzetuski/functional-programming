(ns fp.db)

(defonce persons-atom (atom {}))

(defn add-person!
  [email first-name last-name city street nr-street post-code]
  (swap! persons-atom assoc
         email {:first-name first-name
                :last-name   last-name
                :city city
                :street street
                :nr-street nr-street
                :post-code post-code}
                ))

(defn first-name
  [email]
  (:first-name (@persons-atom email)))

(defn last-name
  [email]
  (:last-name (@persons-atom email)))

(defn address
  [email]
  (str (:city (@persons-atom email))      ", "
       (:street (@persons-atom email))    " "
       (:nr-street (@persons-atom email)) " "
       (:post-code (@persons-atom email))))

(defn -main
  [& args]
  (println persons-atom)
  (add-person! "kkk@gmail.com" "Kordian" "Graba" "Lodz" "Li(s)powa" "6/9" "91-200")
  (add-person! "doma@gmail.com" "Jan" "Dom" "Lodz" "Paul" "21/37" "22-031")
  (add-person! "opium@gmail.com" "Ludomir" "Leono" "Lodz" "Zachlapana" "6" "91-430")
  (println persons-atom)
  (println str "\n"
           (first-name "doma@gmail.com")
           (last-name "doma@gmail.com")
           (address "doma@gmail.com")))