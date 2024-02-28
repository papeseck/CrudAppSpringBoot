FROM maven:3.8-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/CrudApplication-3.2.2.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
