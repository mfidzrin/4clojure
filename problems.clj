;; Problem 1, Nothing but the Truth
;; (= __ true)
(= true true)

;; answer = true

;; Problem 2, Simple Math
;; (= (- 10 (* 2 3)) __)
(= (- 10 (* 2 3)) 4)

;; answer = 4

;; Problem 3, Strings
;; (= __ (.toUpperCase "hello world"))
(= "HELLO WORLD" (.toUpperCase "hello world"))


;; answer = "HELLO WORLD"

;; Problem 4, Lists
;; (= (list __) '(:a :b :c))

(= (list :a :b :c) '(:a :b :c))

;; answer = :a :b :c


;; Problem 5, conj on lists
;; (= __ (conj '(2 3 4) 1))
;; (= __ (conj '(3 4) 2 1))

(= '(1 2 3 4) (conj '(2 3 4) 1))
(= '(1 2 3 4) (conj '(3 4) 2 1))

;; answer = '(1 2 3 4)

;; Problem 6, Vectors
;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;; answer = :a :b :c
