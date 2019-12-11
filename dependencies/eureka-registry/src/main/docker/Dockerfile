FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG APP_NAME=*
COPY ${APP_NAME}.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]