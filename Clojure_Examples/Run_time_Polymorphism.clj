"9. Run time Polymorphism "

(defn hello_example
  ([] "Hello world")
  ([a]  (str "this is " a )))
(= "Hello world" (hello_example))
(= "this is bharath" (hello_example "bharath"))
(defn hello_example2
  ([a & more]
   (str "Hello to welcome to this group"
        (apply str  (interpose "," (concat (list a) more ))) "!")))

(= "Hello to welcome to this grouparun,bharath!" (hello_example2 "arun" "bharath"))


(defmulti example (fn [x] (:eater x)))
(defmethod example :herbivore [a] (str (:name a) " eats veggies."))
(defmethod example :verbicore [a] "")
(defmethod example :default [a] (str "idont know what " (:name a)))

(= "" (example {:species "deer" :name  "Bambi" :age 1 :eater :verbivore}))
(= "idont know what Bharath" (example {:name "Bharath"}))
