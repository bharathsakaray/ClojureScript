"8.Higher order functions"

(= [4 8 12] (map (fn [x] (* 4 x)) [1 2 3]))
(= [1 4 9] (map (fn [x] (* x x)) [1 2 3]))
(= '(:abc) (filter (fn [x] false ) '(:abc :def :ghi)))
(= [10 20 30] (filter (fn [x] (<  x 40)) [10 20 30 40 50]))
(= [10 20 30] (map (fn [x] (* x 10)) (filter (fn [x] (< x 4)) [1 2 3 4 5 6 7 8])))
(= 24  (reduce (fn [a b] (* a b)) [1 2 3 4]))
(= 2400  (reduce (fn [a b] (* a b)) 100 [1 2 3 4]))
