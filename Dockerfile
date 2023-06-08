#
# Build stage
#
FROM maven:3.8.2-jdk-11 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /target/organo-server-0.0.1-SNAPSHOT.jar organo.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","organo.jar"]