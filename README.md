**Speaking Clock**
This project is built using Spring-Boot and Maven.

--> Project Structure

1. pom.xml: Maven configuration file that manages dependencies and build lifecycle.
2. src: Contains the source code of the application.
3. main: Contains the main application code.
4. test: Contains the unit tests for the application.
5. target: Contains the compiled classes and packaged JAR files (generated after a Maven build).

--> To build project use the below command
mvn clean install

--> To run the application, use the below command
mvn spring-boot:run

--> After the start of the application, we can host it at local host by sending a request
http://localhost:4001/api/time/convert?time=22:45
