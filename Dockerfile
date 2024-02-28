FROM openjdk:17-jdk-slim

LABEL maintainer="Pape seck diabel1208@gmail.com"

EXPOSE 8080

RUN mkdir -p /app/data

ADD target/CrudApplication-0.0.1-SNAPSHOT.jar /app/CrudApplication-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/app/CrudApplication-0.0.1-SNAPSHOT.jar"]
