FROM openjdk:17-jdk-slim

LABEL maintainer="Pape seck diabel1208@gmail.com"

EXPOSE 8080

WORKDIR /app

COPY target/CrudApplication-3.2.2.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
