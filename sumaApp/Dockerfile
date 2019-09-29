FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
COPY target/*.jar IBM_sumar_backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container","-jar","/IBM_sumar_backend-0.0.1-SNAPSHOT.jar"]