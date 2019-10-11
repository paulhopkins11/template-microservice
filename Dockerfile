# Base image is a cut down alpine linux with jdk 8
FROM java:alpine
# Add our Spring Book executable jar and call it app.jar
ADD target/template-microservice-*.jar app.jar
# Expose our service port
EXPOSE 8080
# Always start the service
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
