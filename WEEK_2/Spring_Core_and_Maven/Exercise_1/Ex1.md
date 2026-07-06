# 📦 Exercise 1: Configuring a Basic Spring Application

## 📖 Scenario

A company is developing a Library Management System and wants to use the Spring Framework to manage application components efficiently. Spring's IoC (Inversion of Control) container will be used to create and manage objects (beans) through XML configuration.

---

# 🎯 Objective

Develop a basic Spring application that:

* Configures Spring using XML
* Creates Spring Beans
* Loads the Spring IoC Container
* Retrieves and uses Spring Beans
* Demonstrates basic Spring Framework functionality

---

# 📂 Project Structure

```text
library-management/
│
├── pom.xml
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── library
│       │           ├── main
│       │           │      LibraryManagementApplication.java
│       │           │
│       │           ├── repository
│       │           │      BookRepository.java
│       │           │
│       │           └── service
│       │                  BookService.java
│       │
│       └── resources
│              application.properties
│              applicationContext.xml
│
└── pom.xml
```

---

# 🛠 Technologies Used

* Java
* Maven
* Spring Framework
* Spring Context
* XML Configuration

---

# 💻 Implementation Overview

### BookRepository.java

Represents the repository layer of the application.

Implemented Method:

* display()

---

### BookService.java

Represents the service layer of the application.

Implemented Method:

* display()

---

### applicationContext.xml

Configures Spring Beans.

Configured Beans:

* BookRepository
* BookService

---

### LibraryManagementApplication.java

Acts as the driver program.

It demonstrates:

* Loading Spring IoC Container
* Retrieving Spring Beans
* Executing bean methods

---

# ❓ Question 1: What is Spring IoC (Inversion of Control)?

Inversion of Control (IoC) is a design principle where the Spring Framework manages the creation and lifecycle of objects (beans) instead of the programmer creating them manually.

This improves:

* Loose Coupling
* Maintainability
* Reusability
* Testability

---

# ❓ Question 2: What is ApplicationContext?

ApplicationContext is Spring's IoC Container.

It is responsible for:

* Reading XML configuration
* Creating beans
* Managing bean lifecycle
* Injecting dependencies

In this exercise,

```java
ApplicationContext context =
new ClassPathXmlApplicationContext("applicationContext.xml");
```

loads all the configured Spring beans.

---

# 📊 Working Flow

```
LibraryManagementApplication
            │
            ▼
applicationContext.xml
            │
            ▼
Spring IoC Container
      │             │
      ▼             ▼
BookRepository   BookService
```

---

# 📸 Sample Output

```
Book Repository is working...
Book Service is working...
```

---

# 📚 Concepts Learned

* Spring Framework
* Spring IoC Container
* XML Configuration
* Spring Beans
* ApplicationContext
* Maven Project Structure
* Dependency Management

---

# ✅ Conclusion

The basic Spring application was successfully configured using XML-based bean configuration. Spring IoC Container managed the creation of application components, demonstrating the fundamental concepts of the Spring Framework.