FROM docker.sebastian-daschner.com/open-liberty:2

ENV JVM_ARGS="--add-opens java.base/java.net=ALL-UNNAMED"

COPY target/maker-bot.war $DEPLOYMENT_DIR
