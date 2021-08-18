FROM gitpod/workspace-full

RUN brew install clojure/tools/clojure
RUN brew install leiningen

# rebuilding dockerfile by updating this comment #1
