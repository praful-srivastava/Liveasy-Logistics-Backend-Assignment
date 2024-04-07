# Liveasy Assignment - Spring Boot REST API

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Endpoints](#endpoints)
- [Setup](#setup)
- [Configuration](#configuration)
- [Usage](#usage)
- [Contributors](#contributors)
- [Contact](#contact)

## Overview
This project is a Spring Boot RESTful API implementation for managing loads for a logistics company. It provides endpoints for adding, retrieving, updating, and deleting load details, along with querying loads by shipper ID.

## Features
- Add a new load with details such as loading point, unloading point, product type, truck type, etc.
- Retrieve a list of loads by shipper ID.
- Retrieve details of a specific load by its ID.
- Update details of a specific load.
- Delete a load by its ID.

## Technologies Used
- **Spring Boot**: For creating the RESTful API and managing dependencies.
- **Spring Data JPA**: For interacting with the PostgreSQL database.
- **PostgreSQL**: As the relational database to store load details.
- **Maven**: As the build and dependency management tool.

## Endpoints
1. **POST "/Liveasy/load"**: Add a new load.
2. **GET "/Liveasy/load?shipperId=<shipperId>"**: Get a list of loads by shipper ID.
3. **GET "/Liveasy/load/{loadId}"**: Get details of a specific load by its ID.
4. **PUT "/Liveasy/load/{loadId}"**: Update details of a specific load.
5. **DELETE "/Liveasy/load/{loadId}"**: Delete a load by its ID.

## Setup
1. Clone the repository: `git clone https://github.com/your_username/LiveasyAssignment.git`
2. Navigate to the project directory: `cd LiveasyAssignment`
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`

## Configuration
- Configure the PostgreSQL database properties in `application.properties` file.
- Make sure PostgreSQL is running on your local machine.

## Usage
- Use tools like Postman or cURL to send requests to the provided endpoints for testing.
- Replace `<UUID>` with the actual UUID for the shipper ID and `<loadId>` with the actual ID of the load.

## Contributors
- [Prafull Kumar Srivastav](https://github.com/praful-srivastava/) - Project Lead & Developer


## Contact
For any inquiries or feedback, feel free to contact us at [prafullcse2019@gmail.com](mailto:prafullcse2019@gmail.com).
