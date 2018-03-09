# Learning Clojure with Clojure for the Brave and True

This repo is a collection of examples and exercises from the book [_Clojure for the Brave and True_][0]. It also contains resources for configuring and using different editors to write Clojure code. Finally, it contains a summary of dicussion points and question from an office reading group.

## Useful Settings

There are a few useful tools when working in clojure. The first is [cljfmt](https://github.com/weavejester/cljfmt) whis is used to format your code. The second is [eastwood](https://github.com/jonase/eastwood) for linting your Clojure code. You can apply these on a per-project basis, but it probably makes more sense to set this globally:

```clojure
; ~/.lein/profiles.clj
{:user {:plugins  [[lein-cljfmt "0.5.7"]
                   [jonase/eastwood "0.2.5"]]}
 :repl {:dependencies [[jonase/eastwood "0.2.5"]]}}
```

Now inside a project, you can run

```sh
lein cljfmt check
lein eastwood
```

to see if there are any formatting or linting issues.

## Editors

Many people use Emacs for writing Clojure and the book covers [using Emacs with Clojure][1], but for anybody who prefers to use a different editor, here are some useful settings.

### Vim

Taken from [My Clojure Toolchain: Vim](http://blog.venanti.us/clojure-vim/)

- [tpope/vim-fireplace](https://github.com/tpope/vim-fireplace)
- [tpope/vim-surround](https://github.com/tpope/vim-surround)
- [tpope/vim-salve](https://github.com/tpope/vim-salve)
- [tpope/vim-projectionist](https://github.com/tpope/vim-projectionist)
- [tpope/vim-dispatch](https://github.com/tpope/vim-dispatch)
- [venantius/vim-eastwood](https://github.com/venantius/vim-eastwood)
- [vim-syntastic/syntastic](https://github.com/vim-syntastic/syntastic)
- [vim-scripts/paredit.vim](https://github.com/vim-scripts/paredit.vim)
- [venantius/vim-cljfmt](https://github.com/venantius/vim-cljfmt)

Checkers are not enabled by default, so we'll need to enable `vim-eastwood` as the checker for clojure files:

```vim
let g:syntastic_clojure_checkers = ['eastwood']
```

### VS Code

[Clojure Development with Visual Studio Code][2]

[0]: https://www.braveclojure.com/clojure-for-the-brave-and-true/
[1]: https://www.braveclojure.com/basic-emacs/
[2]: https://spin.atomicobject.com/2017/06/22/clojure-development-with-visual-studio-code/
