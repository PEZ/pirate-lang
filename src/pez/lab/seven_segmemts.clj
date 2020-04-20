(ns pez.lab.seven-segments
  (:require [clojure.string :as string]))

(defn transpose [v]
  (->> v
       (remove nil?)
       (apply mapv vector)))

(def seven-segment-alphabet
  {\a ["#### "
       "#  # "
       "#### "
       "#  # "
       "#  # "]
   \b ["#    "
       "#    "
       "#### "
       "#  # "
       "#### "]
   \c ["#### "
       "#    "
       "#    "
       "#    "
       "#### "]
   \d ["   # "
       "   # "
       "#### "
       "#  # "
       "#### "]
   \e ["#### "
       "#    "
       "#### "
       "#    "
       "#### "]
   \f ["#### "
       "#    "
       "#### "
       "#    "
       "#    "]
   \h ["#  # "
       "#  # "
       "#### "
       "#  # "
       "#  # "]
   \i ["#    "
       "#    "
       "#    "
       "#    "
       "#    "]
   \j ["   # "
       "   # "
       "   # "
       "   # "
       "#### "]
   \l ["#    "
       "#    "
       "#    "
       "#    "
       "#### "]
   \n ["#### "
       "#  # "
       "#  # "
       "#  # "
       "#  # "]
   \o ["     "
       "     "
       "#### "
       "#  # "
       "#### "]
   \p ["#### "
       "#  # "
       "#### "
       "#    "
       "#    "]
   \q ["#### "
       "#  # "
       "#### "
       "   # "
       "   # "]
   \r ["     "
       "     "
       "#### "
       "#    "
       "#    "]
   \s ["#### "
       "#    "
       "#### "
       "   # "
       "#### "]
   \t ["#    "
       "#    "
       "#### "
       "#    "
       "#### "]
   \u ["#  # "
       "#  # "
       "#  # "
       "#  # "
       "#### "]
   \y ["#  # "
       "#  # "
       "#### "
       "   # "
       "#### "]
   \space ["     "
           "     "
           "     "
           "     "
           "     "]})

(defn display [word]
  (->> word
       (string/lower-case)
       (map seven-segment-alphabet)
       (transpose)
       (map #(apply str %))))

(def bad-letters-regex #"[gkmqvwxzi]")

(defn good? [word]
  (nil?
   (re-find bad-letters-regex word)))

(def dictionary-text
  (slurp "words-alpha.txt"))

(defn longest []
  (->> dictionary-text
       (string/split-lines)
       (filter good?)
       (sort-by count)
       (last)))

(comment
  (display "Hello World")
  (-> (longest)
      (display))
  (spit "words-alpha.txt" (slurp "https://raw.githubusercontent.com/dwyl/english-words/master/words_alpha.txt")))
