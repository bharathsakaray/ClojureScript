"13.Recursion"

(defn is-even? [n]
  (if (= n 0) true
      (not (is-even? (dec n)))))

(= true (is-even? 0))
(= false (is-even? 1))

(defn is-even-bigint? [n]
  (loop [n n acc true]
    (if (= n 0)
      (recur (dec n) (not acc)))))

(= false (is-even-bigint? 100003N))
(defn factorial [n]
  (loop [n n acc 1]
    (if (= 0 n)
      acc
      (recur (dec n) (* n acc)))))
(= 1 (factorial 1))
