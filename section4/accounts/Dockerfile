# start with a base image containing Java runtime
FROM openjdk:26-ea-17-jdk-slim

# who maintains the image
MAINTAINER moneybank

# add the application's jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]