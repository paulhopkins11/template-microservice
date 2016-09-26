# Base image is a cut down alpine linux with jdk 8
FROM frolvlad/alpine-oraclejdk8:slim
# Add our Spring Book executable jar and call it app.jar
ADD target/template-microservice-0.0.2-SNAPSHOT.jar app.jar
# Expose our service port
EXPOSE 8080
# Always start the service
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
