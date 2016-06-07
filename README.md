Framework Training Template Microservice
========================================
Overview
--------
This is a very simple micro service that can be built and packaged into a docker image. You should use this micro service as a template for building your own micro services.

How to build and run this microservice
--------------------------------------

1. Compile and package the application
```sh
$ mvn clean package
```
2. Build the docker image
```sh
$ docker build -t template-microservice .
```
3. Run the container
```sh
$ docker run -p 8080:8080 template-microservice
```
4. Test the micro service
```sh
$ curl http://localhost:8080
Success! The Framework Training template microservices is up and running
```

How to copy and extend this microservice
----------------------------------------
To copy and extends the template you need to copy and then edit a few key files.

1. Make a new directory and copy the template
```sh
$ mkdir ../simpleservice
$ cp -R * ../simpleservice/
$ cd ../simpleservice/
```
2. Edit pom.xml. Change the artifactId and name values
```xml
<artifactId>simpleservice</artifactId>
<name>Simple Microservice</name>
```
3. Edit Dockerfile and change the jar file name on the ADD instruction
```xml
ADD target/simpleservice-0.0.1-SNAPSHOT.jar app.jar
```
5. Compile and package the application
```sh
$ mvn clean package
```
6. Build the docker image
```sh
$ docker build -t simpleservice .
```
7. Run the container
```sh
$ docker run -p 8080:8080 simpleservice
```
8. Test the micro service
```sh
$ curl http://localhost:8080
Success! The Framework Training template microservices is up and running
```
9. You can now import your new micro service project into your favourite IDE and start development

