# Calva in GitPod

This is a test/demo project for using [Calva](https://github.com/BetterThanTomorrow/calva) in [GitPod](https://gitpod.io).

## Usage

**Installation**: Just kidding, there is no installation!

1. Click this button:
   * <a title="Open Getting Started with Clojure in Gitpod" alt="Open in Gitpod button" href="https://gitpod.io/#https://github.com/PEZ/pirate-lang" target="_blank"><img src="https://img.shields.io/badge/Gitpod-Ready to Code-908a85?logo=gitpod" width="250"/></a>
   * It links here: <a href="https://gitpod.io/#https://github.com/PEZ/pirate-lang">gitpod.io/#https://github.com/PEZ/pirate-lang</a>
   * This will open the repository in a Gitpod workspace in the browser. (Might take a little while.) There will be an instance of VS Code and a VNC window there.
   * _NB: If you don't have a Gitpod account, use the option to **Sign-up with GitHub**._
1. In the VS Code instance open the VS Code command palette and use the command **Start a REPL in your Project and Connect (aka Jack-in)**.
   * Choose the `deps.edn` project type.
1. Hack away!
   If this is all new and confusing, see **New to Clojure** below first. Even if you are not new to Clojure, that guide will introduce you to Calva enough to figure this project out.

## See a demo first?

Fair enough!

https://user-images.githubusercontent.com/30010/139400323-cf1284ac-e931-49b5-8da0-bbbb3f22fbf8.mp4

Please give it a like on Youtube! https://www.youtube.com/watch?v=oXU17qZjtWM

### javax.swing Example

When you start this as a Gitpod workspace, it automatically starts a VNC server, so that you can hack out desktup GUI apps. By default it opens a VNC viewer integrated in VS Code. You can pop it out to a separate browser window, if you like.

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
