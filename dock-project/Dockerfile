FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/dock-project.jar dock-project.jar
ENTRYPOINT ["java","-jar","/dock-project.jar"]
