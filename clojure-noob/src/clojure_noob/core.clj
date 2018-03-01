(ns clojure-noob.core
  (:gen-class))
(load "hobbit")

  (defn error-message
    [severity]
    (str "OH GOD! IT'S A DISASTER! WE'RE "
         (if (= severity :mild)
           "MILDLY INCONVENIENCED!"
           "DOOOOOOOOOOMED!")))

  (def name "Chewbacca")
  (str "\"Uggllglglglglglglglll\" - " name)

  (defn too-enthusiastic
    "Return a cheer that might be a bit too enthusiastic"
    [name]
    (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY LIKE THE BEST "
         "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))

  (defn no-params
    []
    "I take no parameters!")

  (defn one-param
    [x]
    (str "I take one parameter : " x))

  (defn two-params
    [x y]
    (str "Two parameters! That's nothing! Pah! I will smoosh them "
         "together to spite you! " x y))

  ;; arity overloading
  (defn x-chop
    "Describe the kind of chop your're inflicting on someone"
    ([name chop-type]
      (str "I " chop-type " chop " name "! Take that!"))
    ([name]
      (x-chop name "karate")))

  ;; example of rest parameter
  (defn codger-communication
    [whippersnapper]
    (str "Get off my lawn, " whippersnapper "!!!"))

  (defn codger
    [& whippersnappers]
    (map codger-communication whippersnappers))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (do
    (println "I'm a little teapot")
    (println (error-message :mild))
    (println (error-message :severe))
    (println (too-enthusiastic "Alice"))
    (println (no-params))
    (println (one-param "Bob"))
    (println (two-params "Charlie" "Eve"))
    (println (x-chop "Kanye"))
    (println (x-chop "Kanye" "judo"))
    (doall  (map println (codger "Alice" "Bob" "Charlie" "Eve")))
    (println "--------------------------------------------------")
    (doseq [_ (range 10)] (println (hit asym-hobbit-body-parts)))
    ))

