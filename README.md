# Calva in GitPod

This is a test/demo project for using [Calva](https://github.com/BetterThanTomorrow/calva) in [GitPod](https://gitpod.io).

## Usage

**Installation**: Just kidding, there is no installation!

1. Open this link: https://gitpod.io/#https://github.com/PEZ/pirate-lang
1. Jack-in (choose the `deps.edn` project type).
1. Hack away!


### javax.swing Example

When yuu start this as a Gitpod workspace, it automatically starts a VNC server, so that you can hack out desktup GUI apps. By default it opens a VNC viewer integrated in VS Code. You can pop it out to a separate browser window, if you like.

There's a small swing Hello World example in `src/pez/lab/swing_example.clj`. You can also just do something like this to open a Swing window:

```clojure
(comment
  (require 'clojure.inspector)
  (clojure.inspector/inspect (range 7))
)
```

## New to Clojure?

There is not much guidance in this repository for Clojure beginners. You might want to check out this guide first: https://calva.io/get-started-with-clojure/


## License

The code in this project is open and free. 🍺🗽
