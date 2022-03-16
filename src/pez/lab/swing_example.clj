(ns pez.lab.swing-example
  (:import [javax.swing JFrame JPanel JLabel]
           [java.awt FlowLayout]))

(defn create-frame []
  (let [frame (new JFrame "My JFrame")
        panel (new JPanel)
        label (new JLabel "Hello World")]
    (.setLayout panel (new FlowLayout))
    (.setSize frame 400 300)
    (.add panel label)
    (.add frame panel)
    (.setVisible frame true)
    frame))

(comment
  (def frame (create-frame))
  )