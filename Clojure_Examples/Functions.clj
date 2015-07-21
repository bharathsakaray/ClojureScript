"6.functions"

(defn mutliply-by-ten [n] (* 10 n))

(= 20 (mutliply-by-ten 2))
(defn square [n] (* n n))
(= 4 (square 2))
(= 4 ((fn [n] (* n n)) 2))
(= 30 (#(* 15 %) 2))
(= 120 (#( * %1 %2 %3) 4 5 6))
(= ((fn [] ((fn [a b] (+ a b)) 4 5))))
(= 25 ((fn [f] (f 5)) (fn [n] (* n n))))
(= 25 ((fn [f] (f 5)) square))
