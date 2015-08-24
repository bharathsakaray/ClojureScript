                                        ; CIDER 0.10.0snapshot (package: 20150719.2231) (Java 1.8.0_45, Clojure 1.6.0, nREPL 0.2.6)
(defn fib2 [n]
  (condp = n
    0 0
    1 1
    (+ (fib2 (- n 1)) (fib2 (- n 2)))
    ))






