# 📦 Exercise 3: Implementing Logging with Spring AOP

## 📖 Scenario

The Library Management System requires logging functionality to monitor the execution time of service methods. Spring AOP (Aspect-Oriented Programming) is used to separate logging functionality from the business logic.

---

# 🎯 Objective

Develop a Spring application that:

* Implements logging using Spring AOP
* Creates an Aspect class
* Logs the execution time of service methods
* Enables AspectJ support using XML configuration

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
│       │           ├── aspect
│       │           │      LoggingAspect.java
│       │           │
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
* Spring AOP
* AspectJ Weaver
* XML Configuration

---

# 💻 Implementation Overview

### LoggingAspect.java

Implements logging functionality using Spring AOP.

Implemented:

* @Aspect Annotation
* @Around Advice
* Execution Time Logging

---

### applicationContext.xml

Configured:

* BookRepository Bean
* BookService Bean
* LoggingAspect Bean
* AspectJ Auto Proxy

---

### LibraryManagementApplication.java

Loads Spring IoC Container and executes the service method to demonstrate AOP logging.

---

# ❓ Question 1: What is Spring AOP?

Spring AOP (Aspect-Oriented Programming) is used to separate cross-cutting concerns such as logging, security, and transaction management from the business logic.

---

# ❓ Question 2: What is an Aspect?

An Aspect is a class that contains advice (additional functionality) applied to specific methods during program execution.

In this exercise, the LoggingAspect class logs the execution time of service methods.

---

# 📊 Working Flow

```
BookService.display()
        │
        ▼
LoggingAspect (@Around)
        │
        ▼
Logs Execution Time
        │
        ▼
BookRepository.display()
```

---

# 📸 Sample Output

```
Book Service is working...
Book Repository is working...
display executed in 1 ms
```

---

# 📚 Concepts Learned

* Spring AOP
* Aspect
* Advice
* Pointcut
* AspectJ
* Cross-Cutting Concerns
* Execution Time Logging

---

# ✅ Conclusion

Successfully implemented logging using Spring AOP. The execution time of the service method was intercepted and logged without modifying the business logic.