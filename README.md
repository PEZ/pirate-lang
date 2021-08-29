# Calva in GitPod

This is a test/demo project for using [Calva](https://github.com/BetterThanTomorrow/calva) in [GitPod](https://gitpod.io).

## Usage

**Installation**: Just kidding, there is no installation!

1. Open this link: https://gitpod.io/#https://github.com/PEZ/pirate-lang
   * This will open the repository in a Gitpod workspace in the browser. There will be an instance of VS Code and a VNC window there.
   * _NB: If you don't have a Gitpod account, use the option to **Sign-up with GitHub**._
1. Jack-in (choose the `deps.edn` project type).
   In the VS Code instance open the VS Code command palette and use the command **Start a REPL in your Project and Connect (aka Jack-in)**.
1. Hack away!
   If this is all new and confusing, see **New to Clojure** below first. Even if you are not new to Clojure, that guide will introduce you to Calva enough to figure this project out.


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
