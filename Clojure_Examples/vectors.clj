"3.Vectors"

(= 2 (count [23,23]))
(= [] (vec nil))
(= [1 2] (vec '(1,2)))
(= [12] (conj (vec nil) 12))
(= :techno (first [:techno :identity :solutions]))
(= :solutions (last [:techno :identity :solutions]))
(= :solutions (nth [:techno :identity :solutions] 2))
(=[:identity :solutions] (subvec [:techno :identity :solutions :ltd] 1 3))
(= (list 1 2 3) (vector 1 2 3))
