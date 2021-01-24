# Booking - Onion Arch
>>> 1.0

###Required
- [JDK11](http://www.oracle.com/technetwork/java/javase/downloads/index.html)   
- [Intelij](https://www.jetbrains.com/idea/) 
- [Maven](https://maven.apache.org/)  
- [Spring Boot](https://spring.io/projects/spring-boot)   
- [Docker](https://github.com/docker/docker-install)
- [Docker Compose](https://docs.docker.com/compose/)

### About
In this project you have a template that how i implement the onion architecture 
in my day to day using Java and Spring Boot framework. But you can adapte the same template with the tecnology that you 
have more love.

### Onion Architecture Overview

The onion architecture it was proposed by [Jeffrey Palermo](https://jeffreypalermo.com/2008/07/the-onion-architecture-part-1/)

In this project I did it as follows

![](http://andrelucasdeveloper.com/blog/wp-content/uploads/2021/01/onion.png)

### Code structure overview

![](http://andrelucasdeveloper.com/blog/wp-content/uploads/2021/01/Untitled-Diagram-2.png)

#Run app

`$ docker-compose up`

`$ cd app`

`$ ./mvnw spring-boot:run`

### Endpoints
- http://localhost:9958/hotel


### Json Model

`{
     "name":"Japaratinga Resort",
     "description": "Melhor Resort de Maceió"
 }`