FROM ubuntu:latest
LABEL authors="Marina"

ENTRYPOINT ["top", "-b"]

# ---- Build stage: compila com Maven + JDK 17
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml ./
COPY src ./src
RUN mvn -DskipTests clean package

# ---- Run stage: JRE 17 leve
FROM eclipse-temurin:17-jre
WORKDIR /app
ENV PORT=8080
EXPOSE 8080
COPY --from=build /app/target/*-SNAPSHOT.jar app.jar
ENTRYPOINT ["sh", "-c", "java -Dserver.port=$PORT -jar app.jar"]
