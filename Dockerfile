FROM maven:3.8.5-amazoncorretto-17 AS build

WORKDIR /usr/src/app

COPY pom.xml ./

RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean package -DskipTests

# execução
FROM amazoncorretto:17-alpine

WORKDIR /app

COPY --from=build /usr/src/app/target/ViaCep-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
