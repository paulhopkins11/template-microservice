Framework Training Template Microservice
========================================
Overview
--------
This is a very simple micro service that can be built and packaged into a docker image. You should use this micro service as a template for building your own micro services.

How to build and run this microservice
--------------------------------------

1. Compile and package the application

   ```
   $ mvn clean package
   ```
2. Build the docker image

   ```
   $ docker build -t template-microservice .
   ```
3. Run the container

   ```
   $ docker run -p 8080:8080 template-microservice
   ```
4. Test the micro service

   ```
   $ curl http://localhost:8080
   Success! The Framework Training template microservices is up and running
   ```

How to copy and extend this microservice
----------------------------------------
To use this template you need to copy and then edit a few key files.

1. Make a new directory and copy the template

   ```
   $ mkdir ../simpleservice
   $ cp -R * ../simpleservice/
   $ cd ../simpleservice/
   ```
2. Edit pom.xml. Change the artifactId and name values

   ```
   <artifactId>simpleservice</artifactId>
   <name>Simple Microservice</name>
   ```
3. Edit Dockerfile and change the jar file name on the ADD instruction

   ```
   ADD target/simpleservice-0.0.1-SNAPSHOT.jar app.jar
   ```
4. Compile and package the application

   ```
   $ mvn clean package
   ```
5. Build the docker image

   ```
   $ docker build -t simpleservice .
   ```
6. Run the container

   ```
   $ docker run -p 8080:8080 simpleservice
   ```
7. Test the micro service

   ```
   $ curl http://localhost:8080
   Success! The Framework Training template microservices is up and running
   ```
8. You can now import your new micro service project into your favourite IDE and start development