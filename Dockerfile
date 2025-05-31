FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

COPY target/james-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 5000

CMD ["java", "-jar", "app.jar"]