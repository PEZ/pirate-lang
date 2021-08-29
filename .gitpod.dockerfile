FROM gitpod/workspace-full-vnc

RUN brew install clojure/tools/clojure

RUN source /home/gitpod/.bashrc
RUN echo export JAVA_TOOL_OPTIONS=\"$JAVA_TOOL_OPTIONS -Dsun.java2d.xrender=false\" >> /home/gitpod/.bashrc