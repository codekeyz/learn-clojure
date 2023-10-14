(ns difference-of-squares)

(defn square-2 [number]
  (int (Math/pow number 2)))

(defn number-range [number]
  (range 1 (+ number 1)))

(defn sum-of-squares [number]
  (let [numbers (number-range number)]
    (reduce (fn [accumulator number]
              (+ accumulator (square-2 number))) numbers)))

(defn square-of-sum [number]
  (let [numbers (number-range number)]
    (square-2 (reduce + numbers))))

(defn difference [number]
  (- (square-of-sum number) (sum-of-squares number)))