FROM openjdk:17-jdk-slim

LABEL maintainer="Pape seck diabel1208@gmail.com"

EXPOSE 8080

WORKDIR /app

COPY target/CrudApplication-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
