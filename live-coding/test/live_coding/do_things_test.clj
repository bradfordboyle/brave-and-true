(ns live-coding.do-things-test
  (:require [clojure.test :refer [deftest is]]
            [live-coding.do-things :as do-things]))

(deftest it-increments-by-100
  (is (= 123 (do-things/inc-by-100 23)))
  (is (= 234 (do-things/inc-by-100 134))))

(deftest test-dec-maker
  (let [dec-by-10 (do-things/dec-maker 10)
        dec-by-101 (do-things/dec-maker 101)]
    (is (= 13 (dec-by-10 23)))
    (is (= -78 (dec-by-101 23)))))
