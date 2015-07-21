"11.Sequence Comprehension"

(= [0 1 4 ] (for [index (range 3)] (* index index)))
(= [0 1 4] (map (fn [index] (* index index)) (range 3)))
(= [1 3 5 7 9] (filter odd? (range 10)))
(= [1 3 5 7 9] (for [index (range 10) :when (odd? index)] index))
(= [1 9 25 49 81]  (for [index (range 10) :when (odd? index)] (* index index)))
(= [[:top :left] [:top :middle] [:middle :left] [:middle :middle]]
   (for [row [:top :middle]
         column [:left :middle]] [row column]))
