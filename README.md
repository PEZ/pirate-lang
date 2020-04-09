# Calva in GitPod

This is a test/demo project for using [Calva](https://github.com/BetterThanTomorrow/calva) in [GitPod](https://gitpod.io) (a [Theia](http://www.theia-ide.org) based code editor for the Cloud).

Utilizing that Theia is very [VS Code](https://code.visualstudio.com) Extensions compatible, this project comes with [Calva](https://marketplace.visualstudio.com/items?itemName=betterthantomorrow.calva) built in.

## Installation

There is no installation! Just open the repo root with this link: https://gitpod.io/#https://github.com/PEZ/pirate-lang

## Usage

Then hack away. Or, in theory, that is the case. There are currentlly some major blockers. Among those that you can't connect to a REPL server. 😭

## Blockers

They are major!

* [ ] No Jack-in
    * [ ] Croaks on something in the quick-pick menu handling
    * [ ] Croaks even if we avoid those (needs further investigation)
* [ ] No REPL Connect
    * [ ] Croaks on something in the quick-pick menu handling
    * [ ] Croaks even if we avoid those (needs further investigation)

### Starting the REPL manually

To try out connect w/o Jack-in, you can start the REPL manually. In a GitPod terminal run:

```sh
$ clojure -Sdeps '{:deps {nrepl {:mvn/version "0.6.0"} cider/cider-nrepl {:mvn/version "0.23.0"}}}'  -m nrepl.cmdline --middleware "[cider.nrepl/cider-middleware]"
```

### Settings for avoiding quick-pick jack-in/connect menues

Put this in the `.vscode/settings.json` file to get past the problems with quick pick menues
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

## What Works

Pretty much everything else weorks as far as I know:

* [x] Syntax higlighting
* [x] Calva Highlight (Rainbow parens, comment and ignore highlight, paren matching highlight, etcetera)
* [x] [Paredit](https://calva.readthedocs.io/en/latest/paredit.html)
* [x] [Formatting](https://calva.readthedocs.io/en/latest/formatting.html)
* [x] clj-kondo (Well, that is its own extension, also installed in this workspace)

## License

The code in this project is open and free as in beer.
