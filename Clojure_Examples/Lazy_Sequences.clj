"10.Lazy sequences"

(= '(1 2 3 4) (range 1 5))
(= '(0 1 2 3 4) (range 5))
(= [0 1 2 3 4 5 6 7 8 9] (take 10 (range 100 )))
(= [95 96 97 98 99] (drop 95 (range 100)))
(= (range 20) (take 20 (iterate inc 0)))
(= [:a :a :a] (repeat 3 :a))
(= (repeat 100 :foo) (take 100 (iterate identity :foo)))
