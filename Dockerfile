FROM maven:3.6.0-jdk-17-slim AS build
COPY src /students/src
COPY pom.xml /students
RUN mvn -f /students/pom.xml clean package


FROM openjdk:17-jre-slim
COPY --from=build /students/target/students-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]