# Java Spring Boot App (AWS DevSecOps)

## Endpoints
- /health
- /messages

## Build
mvn clean package

## Run
java -jar target/java-app-1.0.0.jar

## Docker
docker build -t java-app .
docker run -p 8080:8080 java-app
