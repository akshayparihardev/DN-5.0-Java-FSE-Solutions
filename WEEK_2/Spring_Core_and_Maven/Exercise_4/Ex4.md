# 📦 Exercise 4: Creating and Configuring a Maven Project

## 📖 Scenario

The Library Management System requires a Maven-based project structure to efficiently manage dependencies, plugins, and project builds. Maven simplifies project management by handling libraries, compilation, packaging, and dependency resolution automatically.

---

# 🎯 Objective

Create and configure a Maven project that:

* Creates a new Maven project named **LibraryManagement**
* Adds the required Spring Framework dependencies
* Configures the Maven Compiler Plugin
* Successfully builds the project using Maven

---

# 📂 Project Structure

```text
library-management/
│
├── pom.xml
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│
└── target/
```

---

# 🛠 Technologies Used

* Java
* Maven
* Spring Framework
* Spring Context
* Spring AOP
* Spring WebMVC

---

# 💻 Implementation Overview

### Maven Project

Created a Maven project named **LibraryManagement**.

---

### Dependencies Added

The following Spring dependencies were added in `pom.xml`:

* Spring Context
* Spring AOP
* Spring WebMVC
* Spring Boot Starter Test

---

### Plugins Configured

Configured:

* Maven Compiler Plugin
* Spring Boot Maven Plugin
* Exec Maven Plugin

---

# ❓ Question 1: What is Maven?

Apache Maven is a build automation and dependency management tool used for Java projects. It manages project libraries, builds, testing, packaging, and deployment using the `pom.xml` configuration file.

---

# ❓ Question 2: What is pom.xml?

`pom.xml` (Project Object Model) is the core configuration file of a Maven project.

It contains:

* Project Information
* Dependencies
* Plugins
* Build Configuration
* Java Version

---

# 📊 Maven Lifecycle Used

```
clean
   │
   ▼
compile
```

Command Executed:

```bash
.\mvnw.cmd clean compile
```

---

# 📸 Sample Output

```
BUILD SUCCESS
```

---

# 📚 Concepts Learned

* Apache Maven
* Project Object Model (POM)
* Dependency Management
* Maven Build Lifecycle
* Maven Plugins
* Spring Dependencies

---

# ✅ Conclusion

Successfully created and configured a Maven project for the Library Management System by adding the required Spring Framework dependencies and configuring the Maven Compiler Plugin.