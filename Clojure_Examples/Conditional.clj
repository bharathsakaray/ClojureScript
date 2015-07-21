"7.conditional"

(= :b (if (false? (= 5 5)) :a :b))
(= []  (if (> 4 3) []))
(= nil (if (nil? 0) [:a :b :c]))
(= :identity (if (not (empty? ())) :abcd :efg))
(defn example [term]
  (case term
    :add :addition
    :sub :substraction
    :divisiion
    ))
(= :addition (example :add))
(= :divisiion (example :div))
