(def fibonacci
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0N 1N])))
(nth fibonacci 2)
