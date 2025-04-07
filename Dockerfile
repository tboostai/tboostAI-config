FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/*.jar config-service.jar
ENTRYPOINT ["java", "-jar", "config-service.jar"]