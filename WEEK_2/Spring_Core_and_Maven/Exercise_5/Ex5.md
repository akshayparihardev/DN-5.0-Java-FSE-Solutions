# 📦 Exercise 5: Configuring the Spring IoC Container

## 📖 Scenario

The Library Management System requires a centralized configuration to manage application beans and their dependencies using the Spring IoC Container.

---

# 🎯 Objective

Configure the Spring IoC Container by:

* Creating an XML configuration file
* Defining Spring beans
* Injecting dependencies
* Loading the Spring Context

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
│       │   └── com.library
│       │       ├── main
│       │       ├── repository
│       │       └── service
│       │
│       └── resources
│              applicationContext.xml
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

### applicationContext.xml

Configured:

* BookRepository Bean
* BookService Bean

Implemented Setter Injection using:

```xml
<property name="bookRepository" ref="bookRepository"/>
```

---

### LibraryManagementApplication.java

Loads the Spring IoC Container and retrieves the BookService bean.

---

# ❓ Question 1: What is Spring IoC Container?

The Spring IoC Container manages the lifecycle of beans and injects dependencies automatically based on the configuration.

---

# ❓ Question 2: Why use XML Configuration?

XML configuration centralizes bean definitions and dependency management, making applications loosely coupled and easier to maintain.

---

# 📊 Working Flow

```
ApplicationContext
        │
        ▼
BookService
        │
Setter Injection
        ▼
BookRepository
```

---

# 📸 Sample Output

```
Book Service is working...
Book Repository is working...
```

---

# 📚 Concepts Learned

* Spring IoC
* XML Bean Configuration
* Dependency Injection
* Setter Injection
* ApplicationContext

---

# ✅ Conclusion

Successfully configured the Spring IoC Container using XML-based bean configuration and verified dependency injection between BookService and BookRepository.