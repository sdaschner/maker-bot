FROM sdaschner/open-liberty:javaee8-tracing-jdk8-b1

COPY openliberty/server.xml $CONFIG_DIR

COPY target/maker-bot.war $DEPLOYMENT_DIR
