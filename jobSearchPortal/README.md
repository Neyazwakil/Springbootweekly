
## *Project Name*

__Job Search Portal__
## Table of Contents

- **[Frameworks and Language Used](#frameworks-and-language-used)**
- **[Dataflow](#dataflow)**
- **[Data Structure](#data-structure)**
- **[Project Summary](#project-summary)**

Frameworks and Languages Used:

- Spring Boot: A powerful and widely-used Java framework for building robust and scalable web applications.
- Java: The primary programming language used in the project for writing backend code.
- H2 Database: An in-memory database used for storing job-related data.
- Maven: A build automation tool used for managing project dependencies and building the application.
- Postman: Used for testing the APIs and interacting with the backend.

Data Flow and Functions:

The Job Search Portal application follows a layered architecture consisting of the following components:

- Controller: The JobController class handles incoming HTTP requests and maps them to specific service methods based on the requested endpoints. It is responsible for interacting with the client and returning appropriate responses.

- Service: The JobService class contains business logic for processing the incoming requests from the controller. It acts as an intermediary between the controller and the repository, providing various CRUD operations and custom search functionalities.

- Repository: The JobRepository interface extends CrudRepository from Spring Data JPA and provides default CRUD operations. Additionally, it includes custom finder methods for searching jobs by title, description, salary, company name, employer name, and location using Spring Data JPA query annotations.

- Database Design: The project uses the H2 Database, an in-memory relational database. The Job entity represents a job listing with various attributes such as title, description, location, salary, companyEmail, companyName, employerName, jobType, and appliedDate.

Data Structure Used:

The project uses a relational database with tables for storing job data. The database design is based on the Job entity attributes, with each attribute corresponding to a column in the table. The primary key is the id field, which uniquely identifies each job entry.

Project Summary:

The Job Search Portal is a Spring Boot application that provides RESTful APIs to perform CRUD operations on job listings. It allows users to create new job listings, view job details by ID, update existing job listings, and delete job listings. Additionally, users can perform various custom searches, such as searching by job title, description, salary, company name, employer name, and location.

The application follows a layered architecture, promoting separation of concerns. The controller handles incoming HTTP requests, the service contains the business logic, and the repository manages the interaction with the database. The project uses H2 Database for data storage, making it easy to set up and run locally.

The Job Search Portal provides a simple and effective way for users to manage job listings and search for relevant opportunities based on different criteria. It can be extended and customized further to meet specific requirements of a job portal application.

## Done by 

- Name: [neyazwakil](https://github.com/Neyazwakil/gitassign)

- Twitter: [neyazwakil2](https://twitter.com/your_twitter_id)
- github:  [neyazwakil8271](https://github.com/)

