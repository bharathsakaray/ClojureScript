"2.Lists "

(= '(1 2 3) (list 1 2 3))
(= 3 (first '(1 3 4)))
(= '(2 3 4 5) (rest '(1 2 3 4 5)))
(= '(:a :b :c) (cons :a '(:b :c)))
(= :a (peek '(:a :b :c)))
(= 1 (peek '(1 2 3)))
(= '(2 3 4 5) (pop '(1 2 3 4 5)))
