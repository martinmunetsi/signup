# Sign UP
A Spring Boot application that provides a way to handle user sign up requests. These requests could originate from multiple clients and would need to be serviced at this central sign up service. 
This application, is a RESTful web service and, is developed using Spring Boot version 3.0.2-SNAPSHOT, Maven 3.8.6, Java 17.0.2. The dependencies include spring web, spring data JPA and postgresql.

## Getting Started
This repository depends on a postgresql database, which is created based on the repository https://github.com/martinmunetsi/signup-db

To get started, the spring boot project was created using "spring initilizr" found on https://start.spring.io/
Spring Web was selected as a dependency. The generated spring boot project was downloaded and imported into the selected IDE (in this case IntelliJ IDEA). In IntelliJ IDE, the "signup" project module was set to use Java 17, to match the java version set in the pom file.
The resource "application.properties" was configured with the postgresql database url and credentials.
Next, the models e.g. User.java were created and the entity relationships were configured. Jpa Repository interfaces, such as UserRepository.java, were created to enable the CRUD operations.
Lastly, the controller classes such as UsersController.java were created to facilitate the GET,POST and DELETE operations.
