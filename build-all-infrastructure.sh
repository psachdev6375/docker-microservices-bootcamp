mvn --file config-server/pom.xml clean install docker:build
mvn --file eureka-server/pom.xml clean install docker:build
mvn --file zuul-proxy/pom.xml clean install docker:build
