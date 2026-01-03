FROM eclipse-temurin:17-jre-alpine

RUN addgroup -S app && adduser -S app -G app
USER app

COPY target/java-app-1.0.0.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
