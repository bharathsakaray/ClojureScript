"5.maps"

(= {} (hash-map))
(= {:a 3} (hash-map :a 3))
(= 2 (count {:a 1 :b 2}))
(= {:a 3 :b 4} {:a 3 :b 4})
(= 3 (get {:a 2 :b 4} :b))
(= 1 ({:a 1 :b 2} :a))
(= :not-found (get {:a 1 :b 2} :c :not-found))
(= true (contains? {:a nil :b 2} :a))
(= {1 "techno" 2 "identity"} (assoc {1 "techno"} 2 "identity"))
(= (list 1 2) (sort (keys {1 "techno" 2 "identity"})))
(= (list  "techno" "identity") (sort (vals {1 "techno" 2 "identity"})))
