# Calva in GitPod

This is a test/demo project for using [Calva](https://github.com/BetterThanTomorrow/calva) in [GitPod](https://gitpod.io) (a [Theia](http://www.theia-ide.org) based code editor for the cloud).

Utilizing that Theia is very [VS Code](https://code.visualstudio.com) Extensions compatible, this project comes with [Calva](https://marketplace.visualstudio.com/items?itemName=betterthantomorrow.calva) built in.

## Usage

**Installation**: Just kidding, there is no installation!

1. Open this link: https://gitpod.io/#https://github.com/PEZ/pirate-lang
1. Hack away.

Or, in theory, that is the case. There are currentlly some major blockers. Among those that you can't connect to a REPL server. 😭

## Blockers

They are major!

* [ ] No Jack-in
    * [ ] Croaks on something in the quick-pick menu handling
    * [ ] Croaks even if we avoid those (needs further investigation)
* [ ] No REPL Connect
    * [ ] Croaks on something in the quick-pick menu handling
    * [ ] Croaks even if we avoid those (needs further investigation)

This essencially means that most of Calva is not working, but there is hope in that everything that does not rely on the REPL seems to work:

## What Works

* [x] Syntax higlighting
* [x] Calva Highlight (Rainbow parens, comment and ignore highlight, paren matching highlight, etcetera)
* [x] [Paredit](https://calva.readthedocs.io/en/latest/paredit.html)
* [x] [Formatting](https://calva.readthedocs.io/en/latest/formatting.html)
* [x] clj-kondo (Well, that is its own extension, also installed in this workspace)

## Unblocking Efforts

Here are some things I've tried in order to find out what is not going on.

### Starting the REPL Manually

To try out connect w/o Jack-in, you can start the REPL manually. In a GitPod terminal run:

```sh
$ clojure -Sdeps '{:deps {nrepl {:mvn/version "0.6.0"} cider/cider-nrepl {:mvn/version "0.23.0"}}}'  -m nrepl.cmdline --middleware "[cider.nrepl/cider-middleware]"
```

### Avoiding Quick-pick Jack-in/Connect Menus

Put this in the `.vscode/settings.json` file to get past the problems with quick pick menues:

```json
{
    "calva.replConnectSequences": [
        {
            "name": "REPL",
            "projectType": "Clojure CLI",
            "cljsType": "none"
        }
    ]
}
```

### GitPod Calva Config

Ultimately I would like to be able to run a Calva debug session in a GitPod extension host. It doesn't seem possible at the moment, but I am not sure (this whole Theia thing is just a few days old to me).

To make it easy to experiment with this Calva is also provided with GitPod config. Including a Calva extension for hacking on the ClojureScript parts of Calva (a.k.a. `calva-lib`). You should know how to start it by now, but you can also just click this link:

* https://gitpod.io/#https://github.com/BetterThanTomorrow/calva/tree/dev

There are some problems with this:

* [ ] For some reasons the build task doesn't start
    * As a work-around, run `npm run watch` from the terminal (GitPod terminal, remember?)
* [ ] Jack-in/Connect doesn't work, as per above, so no REPL for the CLJS hacking
* [ ] I haven't found a way to run a debug session.

### Theia

I have also tried to use Theia for debugging Calva, and I get a bit further there, but:

* [ ] No extension host for me
* [ ] There is no Extensions pane in the Theias I have built, making it a all bit too spartan

On my TODO here is to add the experimental launch definitions I have used to try get the debug session going.

I have yet only built the cloud Theia, so it might be that we can make it work by building a desktop Theia.


## Please Assist

Any help with this will be rewarded with _Golden Stars in Heaven_ (as we say in Swedish).

## License

The code in this project is open and free. 🍺🗽
