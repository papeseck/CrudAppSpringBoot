FROM openjdk:17-jdk-slim

LABEL maintainer="Pape seck diabel1208@gmail.com"

EXPOSE 8080

RUN mkdir -p /app/data

ADD docker/CrudApplication-0.0.1-SNAPSHOT.jar CrudApplication-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "CrudApplication-0.0.1-SNAPSHOT.jar"]