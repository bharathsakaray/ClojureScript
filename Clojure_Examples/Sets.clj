"4.Sets"

(= #{} (set nil))
(= 2 count #{1 2 4})
(= #{1 2 3 4 5 6 } (clojure.set/union #{1 2 3 4} #{2 3 5 6}))
(= #{2 3 } (clojure.set/intersection #{1 2 3 4} #{2 3 5}))
(= #{1 4} (clojure.set/difference #{1 2 3 4 5} #{2 3 5}))
