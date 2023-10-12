(ns playground-test
  (:require [clojure.test :refer [deftest is]]
            [playground :as pg]))

(deftest hello-world-test
  (is (= "Hello, World!" (pg/hello-world))))
