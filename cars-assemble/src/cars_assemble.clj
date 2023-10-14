(ns cars-assemble)


(def cars-per-hour 221)

(defn success-rate [speed]
  (-> (cond
        (<= speed 4) (* speed cars-per-hour)
        (<= speed 8) (* speed cars-per-hour 0.9)
        (= speed 9) (* speed cars-per-hour 0.8)
        (= speed 10) (* speed cars-per-hour 0.77)
        :else 0)
      (double)))

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (success-rate speed))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (/ (success-rate speed) 60)))
