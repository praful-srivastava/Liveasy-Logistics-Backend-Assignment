##Liveasy Assignment - Spring Boot REST API

##Overview:

This project is a Spring Boot RESTful API implementation for managing loads for a logistics company. It provides endpoints for adding, retrieving, updating, and deleting load details, along with querying loads by shipper ID. 


##Features:

Add a new load with details such as loading point, unloading point, product type, truck type, etc.
Retrieve a list of loads by shipper ID.
Retrieve details of a specific load by its ID.
Update details of a specific load.
Delete a load by its ID.

##Technologies Used:

*Spring Boot: For creating the RESTful API and managing dependencies.
*Spring Data JPA: For interacting with the PostgreSQL database.
*PostgreSQL: As the relational database to store load details.
*Maven: As the build and dependency management tool.

##Setup:

Clone the repository: 
```
git clone https://github.com/praful-srivastava/LiveasyAssignment.git
```
Navigate to the project directory: 
```
cd LiveasyAssignment
```
Build the project: 
```
mvn clean install
```
Run the application: 
```
mvn spring-boot:run
```
##Configuration:

Configure the PostgreSQL database properties in application.properties file.
Make sure PostgreSQL is running on your local machine.


##Usage:

Use tools like Postman or cURL to send requests to the provided endpoints for testing.
Replace <UUID> with the actual UUID for the shipper ID and <loadId> with the actual ID of the load.

##Contributors:
Prafull Kumar Srivastava - Project Lead & Developer

##Contact:

For any inquiries or feedback, feel free to contact me at prafullcse2019@gmail.com.
