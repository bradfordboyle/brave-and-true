# clojure-noob

This project contains the samples from [Chapter 3 - Do Things: A Clojure Crash Course](https://www.braveclojure.com/do-things/).

## Installation

```sh
brew install leiningen
```

## Usage

```sh
lein run

lein uberjar
java -jar target/uberjar/clojure-noob-0.1.0-SNAPSHOT-standalone.jar
```

## Edit setup

### Vim

Taken from [My Clojure Toolchain: Vim](http://blog.venanti.us/clojure-vim/)

```vim
Plug 'tpope/vim-fireplace'
Plug 'vim-scripts/paredit.vim'
Plug 'tpope/vim-surround'
Plug 'venantius/vim-eastwood'
Plug 'vim-syntastic/syntastic'
Plug 'venantius/vim-cljfmt'
```

### VS Code

[Clojure Development with Visual Studio Code](https://spin.atomicobject.com/2017/06/22/clojure-development-with-visual-studio-code/)

## Key Concepts

1. Forms
   - literals
   - operations
   - sometimes referred to expression
   - if is a special form
2. Binding
   - you bind names, not assigning
   - def does let you re-def things
     - you should treat def as if it’s defining constants
   - immutable
   - see `let`
3. Data structures
   - numbers
   - strings
   - maps
     - keywords (not limited to maps, see `error-message`)
   - vectors
   - lists
   - sets
   - reach for built-in data structures first!
4. Functions
   - **higher-order functions**
     - functions that take another function as an argument or returns a function
   - function arguments always evaluates all of their operands
     - be careful with side effects
   - special forms (e.g., `if`) do not
   - arity-overloading
   - rest parameter
   - **destructuring**
     - works with lists/vectors
       `[[first thing]]`
     - works with maps
       `[{:keys [lat lng] :as treasure-location}]`
     - can be combined with rest parameter (see `let` in `symmetrize-body-parts`)
   - no special functions
     - `+` is no different than `matching-part`
   - anonymous functions
     - syntax `(fn [x] (inc x))` or `#(inc %)`
   - returned functions are closures

## Questions

1. Does clojure care about side-effects? `rand` makes `hit` non-pure.
2. Is the vector parameter of a function definition considered a form?
3. Does clojure have different copies of the same string?
   1. why use keywords outside of maps?


## License

Copyright © 2018 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
