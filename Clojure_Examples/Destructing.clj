"14.Destructuring"

(= ":bar:foo"((fn [[a b]] (str b a)) [:foo :bar]))
(= (str "fp php, "
        "sp c++, "
        "tp .net program")
   ((fn [[a b c]] (str "fp "a", "
                      "sp "b ", "
                      "tp "c " program"))
    ["php" "c++" ".net"]))

(def address {:street-address "tarnaka" :city "Secundrabad" :state "Telangana"})
(= "tarnaka,Secundrabad,Telangana"
   (let [{street-address :street-address, city :city, state :state} address] (str street-address "," city "," state)))

(= "tarnaka,Secundrabad,Telangana"
   (let [{:keys [street-address city state]} address]
     (str street-address "," city "," state)))
(= "techno identity aka vandeep aka rk aka solutions"
   (let [[first-name last-name & aliases] (list "techno" "identity" "vandeep" "rk" "solutions")] (str first-name " " last-name (apply str (map #(str " aka " %) aliases)))))
(= {:original-parts ["Steven" "Hawking"]
    :named-parts {:first "Steven" :last "Hawking"}}
   (let [[first-name last-name :as full-name] ["Steven" "Hawking"]]
     {:original-parts full-name
      :named-parts {:first first-name :last last-name}}))
(= "tarnaka,Secundrabad,Telangana"
   (let [{street-address :street-address, city :city,state :state} address]
     (str street-address "," city "," state)))
