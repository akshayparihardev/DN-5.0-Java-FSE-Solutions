# 📦 Exercise 2: Implementing Dependency Injection

## 📖 Scenario

In the Library Management System, the `BookService` class depends on the `BookRepository` class to perform repository operations. Instead of creating objects manually, Spring's Dependency Injection (DI) mechanism is used to inject dependencies through the IoC Container.

---

# 🎯 Objective

Develop a Spring application that:

* Implements Dependency Injection using Spring IoC Container
* Injects `BookRepository` into `BookService`
* Configures dependencies using XML
* Demonstrates Setter-based Dependency Injection

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
* Dependency Injection

---

# 💻 Implementation Overview

### BookRepository.java

Represents the repository layer.

Implemented Method:

* display()

---

### BookService.java

Represents the service layer.

Implemented:

* Setter Method
* display()

---

### applicationContext.xml

Configured Beans:

* BookRepository
* BookService

Configured Setter Injection:

```xml
<property name="bookRepository" ref="bookRepository"/>
```

---

### LibraryManagementApplication.java

Loads Spring IoC Container and retrieves the `BookService` bean.

---

# ❓ Question 1: What is Dependency Injection?

Dependency Injection (DI) is a design pattern where the Spring IoC Container injects the required dependencies into an object instead of the object creating them manually.

Benefits:

* Loose Coupling
* Easy Testing
* Better Maintainability
* Reusability

---

# ❓ Question 2: What is Setter Injection?

Setter Injection is a type of Dependency Injection in which Spring injects dependencies through setter methods.

Example:

```java
public void setBookRepository(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
}
```

---

# 📊 Working Flow

```
ApplicationContext
        │
        ▼
BookService Bean
        │
Setter Injection
        │
        ▼
BookRepository Bean
```

---

# 📸 Sample Output

```
Book Service is working...
Book Repository is working...
```

---

# 📚 Concepts Learned

* Spring IoC Container
* Dependency Injection
* Setter Injection
* Spring Beans
* XML Bean Configuration
* Loose Coupling

---

# ✅ Conclusion

Successfully implemented Dependency Injection using Spring Framework. The `BookRepository` object was injected into `BookService` using Setter Injection configured through XML.