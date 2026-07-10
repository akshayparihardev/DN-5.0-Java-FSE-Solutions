# 📦 Exercise 1: Spring Data JPA – Quick Example

## 📖 Scenario

A company wants to develop a simple application to retrieve country information from a MySQL database using Spring Data JPA and Hibernate. The application should demonstrate how Spring Data JPA simplifies database operations by reducing boilerplate code and integrating seamlessly with Hibernate.

---

# 🎯 Objective

Develop a Spring Boot application that:

* Configure Spring Data JPA with MySQL
* Map Java objects to database tables using JPA annotations
* Create a Repository using Spring Data JPA
* Implement a Service layer
* Retrieve country records from the database
* Demonstrate Hibernate ORM integration

---

# 📂 Project Structure

```text
orm-learn/
│
├── pom.xml
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── cognizant
│       │           └── ormlearn
│       │               │
│       │               ├── OrmLearnApplication.java
│       │               │
│       │               ├── model
│       │               │      Country.java
│       │               │
│       │               ├── repository
│       │               │      CountryRepository.java
│       │               │
│       │               └── service
│       │                      CountryService.java
│       │
│       └── resources
│              application.properties
│
└── pom.xml
```

---

# 🛠 Technologies Used

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate ORM
* MySQL Server 8.0
* MySQL Command Line Client
* Spring Boot DevTools
* Maven

---

# 💻 Implementation Overview

### Country.java

Represents the Country entity mapped to the database.

**Annotations Used**

* @Entity
* @Table
* @Id
* @Column

**Fields**

* code
* name

---

### CountryRepository.java

Repository interface extending:

```java
JpaRepository<Country, String>
```

Provides built-in CRUD operations without writing SQL queries.

---

### CountryService.java

Represents the Service layer.

**Implemented Method**

* getAllCountries()

The service retrieves all country records using:

```java
countryRepository.findAll();
```

---

### OrmLearnApplication.java

Acts as the driver program.

It demonstrates:

* Starting Spring Boot Application
* Loading ApplicationContext
* Retrieving CountryService Bean
* Fetching all countries
* Displaying retrieved records in console

---

# 🗄 Database Configuration

**Database Used**

* MySQL

**Database Name**

```
ormlearn
```

**Table Name**

```
country
```

**Columns**

```
co_code
co_name
```

---

# 💻 MySQL Command Line Execution

The following commands were executed using the MySQL Command Line Client.

mysql> CREATE DATABASE ormlearn;
Query OK, 1 row affected (0.01 sec)

mysql> USE ormlearn;
Database changed

mysql> CREATE TABLE country (
    ->     co_code VARCHAR(2) PRIMARY KEY,
    ->     co_name VARCHAR(50)
    -> );
Query OK, 0 rows affected (0.03 sec)

mysql> INSERT INTO country VALUES ('IN','India');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO country VALUES ('US','United States of America');
Query OK, 1 row affected (0.00 sec)

mysql> SELECT * FROM country;
+---------+---------------------------+
| co_code | co_name                   |
+---------+---------------------------+
| IN      | India                     |
| US      | United States of America  |
+---------+---------------------------+
2 rows in set (0.00 sec)


# ❓ Question 1: What is JPA?

JPA (Java Persistence API) is a Java specification that provides a standard way to map Java objects to relational database tables. It defines interfaces and annotations for performing database operations but does not provide an implementation.

---

# ❓ Question 2: What is Hibernate?

Hibernate is an Object Relational Mapping (ORM) framework and one of the most popular implementations of JPA. It automatically converts Java objects into database records and SQL queries into Java objects.

---

# ❓ Question 3: What is Spring Data JPA?

Spring Data JPA is a Spring Framework module built on top of JPA that reduces boilerplate code by automatically generating implementations for repository interfaces.

Instead of writing SQL queries manually, developers can perform CRUD operations using predefined repository methods.

---

# ❓ Question 4: What is JpaRepository?

JpaRepository is a Spring Data JPA interface that provides ready-made methods such as:

* save()
* findAll()
* findById()
* delete()
* count()

without requiring manual SQL implementation.

---

# 📊 Working Flow

```text
                 OrmLearnApplication
                          │
                          ▼
                 ApplicationContext
                          │
                          ▼
                   CountryService
                          │
                          ▼
                 CountryRepository
                          │
                          ▼
                 Spring Data JPA
                          │
                          ▼
                     Hibernate ORM
                          │
                          ▼
                    MySQL Database
```

---

# 📸 Sample Output

```text
Inside main

Start

Hibernate:
select c1_0.co_code,c1_0.co_name
from country c1_0

Countries =

Country [code=IN, name=India]

Country [code=US, name=United States of America]

End

BUILD SUCCESS
```

---

# 📚 Concepts Learned

* Spring Boot
* Spring Data JPA
* Hibernate ORM
* Entity Mapping
* JPA Annotations
* Repository Pattern
* Service Layer
* Dependency Injection
* ApplicationContext
* MySQL Integration
* MySQL Command Line Client
* CRUD Operations using JpaRepository

---

# ✅ Conclusion

The Spring Data JPA application was successfully developed using Spring Boot, Hibernate, and MySQL. The application connected to the MySQL database, mapped the Country entity using JPA annotations, implemented the Repository and Service layers, and successfully retrieved country records using Spring Data JPA. This exercise demonstrated the integration of Spring Boot, Hibernate ORM, and MySQL while showcasing how Spring Data JPA simplifies database-driven application development.