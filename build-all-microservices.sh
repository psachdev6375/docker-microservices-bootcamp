mvn --file word-server/pom.xml clean install docker:build -DskipTests
mvn --file sentence-server-solution/pom.xml clean install docker:build
