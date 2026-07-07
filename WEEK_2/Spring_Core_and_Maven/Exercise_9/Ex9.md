# 📚 Exercise 9: Creating a Spring Boot Application

## 📖 Scenario

The library management application needs to be converted into a Spring Boot application to simplify project configuration, dependency management, and deployment.

---

# 🎯 Objective

Develop a Spring Boot application for the Library Management System by:

- Creating a Spring Boot project using Spring Initializr
- Configuring required dependencies
- Connecting to an H2 in-memory database
- Creating a Book entity
- Creating a BookRepository using Spring Data JPA
- Creating a REST Controller to perform CRUD operations
- Running and testing REST endpoints

---

# 📂 Project Structure

```
library-management-boot/
│
├── pom.xml
├── src
│   └── main
│       ├── java
│       │   └── com.library
│       │       ├── controller
│       │       │      BookController.java
│       │       ├── entity
│       │       │      Book.java
│       │       ├── repository
│       │       │      BookRepository.java
│       │       └── LibraryManagementBootApplication.java
│       │
│       └── resources
│              application.properties
```

---

# 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

# 💻 Implementation Overview

### Book Entity

Represents the Book table in the database.

Attributes:

- ID
- Title
- Author

Uses:

- @Entity
- @Id

---

### BookRepository

Extends:

```java
JpaRepository<Book, Integer>
```

Provides CRUD operations without writing SQL queries.

---

### BookController

Implements REST APIs.

Endpoints:

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /books | Retrieve all books |
| POST | /books | Add a new book |

---

### application.properties

Configures:

- H2 Database
- Hibernate
- JPA
- H2 Console

---

# 🌐 REST Endpoints

## GET

```
GET /books
```

Returns all books stored in the database.

Example Response

```json
[]
```

---

## POST

```
POST /books
```

Example Request

```json
{
  "id":1,
  "title":"Spring Boot",
  "author":"Rod Johnson"
}
```

---

# 📸 Sample Output

Application Started Successfully

```
Tomcat started on port 8080
Started LibraryManagementBootApplication
```

Browser Output

```json
[]
```

---

# 📚 Concepts Learned

- Spring Boot
- Spring Initializr
- Spring Web
- Spring Data JPA
- REST APIs
- H2 Database
- Entity
- Repository
- Controller
- application.properties
- Maven Dependency Management

---

# ✅ Conclusion

Successfully developed a Spring Boot based Library Management application using Spring Initializr. The application exposes REST endpoints for managing books using Spring Data JPA with an H2 in-memory database.