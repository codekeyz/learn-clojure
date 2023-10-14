(ns difference-of-squares)

(defn square-2 [number]
  (int (Math/pow number 2)))

(defn from-one-to-number [number]
  (range 1 (+ number 1)))

(defn sum-of-squares [number]
  (let [numbers (from-one-to-number number)]
    (reduce (fn [accumulator number]
              (+ accumulator (square-2 number))) numbers)))

(defn square-of-sum [number]
  (let [numbers (from-one-to-number number)]
    (square-2 (reduce + numbers))))

(defn difference [number]
  (- (square-of-sum number) (sum-of-squares number)))