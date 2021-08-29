FROM gitpod/workspace-full-vnc

RUN brew install clojure/tools/clojure

USER gitpod
RUN export JAVA_TOOL_OPTIONS="$JAVA_TOOL_OPTIONS -Dsun.java2d.xrender=false"