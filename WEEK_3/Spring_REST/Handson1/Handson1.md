# 🌐 Hands-on 1: Create a Spring Web Project using Maven

## 📖 Scenario

A company is beginning development of a RESTful web application using Spring Boot. Before implementing REST APIs, the development team needs to create a standard Spring Web project using Maven. This project will act as the base for all upcoming Spring REST hands-on exercises.

---

# 🎯 Objective

Develop a basic Spring Boot Web application by:

- Creating the project using Spring Initializr
- Managing dependencies using Maven
- Building the project successfully
- Running the Spring Boot application
- Understanding the project structure
- Understanding the purpose of `@SpringBootApplication`
- Exploring the `pom.xml` configuration and dependency hierarchy

---

# 📂 Project Structure

```text
spring-learn/
│
├── .mvn/
├── src
│   ├── main
│   │   ├── java
│   │   │    └── com
│   │   │         └── cognizant
│   │   │              └── springlearn
│   │   │                    SpringLearnApplication.java
│   │   │
│   │   └── resources
│   │         application.properties
│   │
│   └── test
│        └── java
│             └── com
│                  └── cognizant
│                       └── springlearn
│                             SpringLearnApplicationTests.java
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── HELP.md
```

---

# 🛠 Technologies Used

- Java 17
- Spring Boot 3
- Maven
- Spring Web
- Spring Boot DevTools
- Embedded Apache Tomcat

---

# ⚙️ Project Creation Steps

The project was created using **Spring Initializr** with the following configuration:

| Property | Value |
|----------|-------|
| Project | Maven |
| Language | Java |
| Spring Boot | 3.x |
| Group | com.cognizant |
| Artifact | spring-learn |
| Packaging | Jar |
| Java Version | 17 |

### Dependencies Added

- Spring Web
- Spring Boot DevTools

---

# 🔨 Maven Build

The project was built using Maven Wrapper.

```bash
.\mvnw.cmd clean package
```

The build completed successfully.

```
BUILD SUCCESS
```

During the build:

- Project compiled successfully
- Test cases executed successfully
- Executable Spring Boot JAR generated

---

# ▶ Running the Application

The application was started using:

```bash
.\mvnw.cmd spring-boot:run
```

Spring Boot started successfully.

Important log entries:

```
Tomcat started on port(s): 8080 (http)

Started SpringLearnApplication

Inside main
```

This confirms that:

- Embedded Tomcat Server started
- Spring Boot Application Context loaded successfully
- The `main()` method executed successfully

---

# 📁 Project Folder Explanation

## src/main/java

Contains all the application source code.

Example:

```
SpringLearnApplication.java
```

This is the main entry point of the application.

---

## src/main/resources

Contains configuration files such as:

```
application.properties
```

Used for configuring:

- Server Port
- Logging
- Database Configuration
- Application Properties

---

## src/test/java

Contains unit and integration test classes.

Example:

```
SpringLearnApplicationTests.java
```

These tests verify that the Spring Application Context loads successfully.

---

# 🚀 SpringLearnApplication.java

The main class of the application.

```java
@SpringBootApplication
public class SpringLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }

}
```

The `main()` method:

- Starts Spring Boot
- Creates the Spring IoC Container
- Performs Component Scanning
- Starts the Embedded Tomcat Server
- Initializes the application

---

# ⭐ Purpose of @SpringBootApplication

`@SpringBootApplication` is a convenience annotation that combines three important Spring annotations.

It internally includes:

### 1. @Configuration

Marks the class as a source of Spring Bean definitions.

---

### 2. @EnableAutoConfiguration

Automatically configures Spring Boot based on the dependencies present in the project.

---

### 3. @ComponentScan

Automatically scans the current package and its sub-packages for:

- @Component
- @Service
- @Repository
- @Controller
- @RestController

and registers them as Spring Beans.

---

# 📦 pom.xml Overview

The `pom.xml` file is the configuration file used by Maven.

It defines:

- Project Information
- Java Version
- Dependencies
- Plugins
- Build Configuration

Key dependencies used:

```xml
spring-boot-starter-web
```

Provides:

- Spring MVC
- REST API Support
- Embedded Tomcat

---

```xml
spring-boot-devtools
```

Provides:

- Automatic Restart
- Live Reload
- Faster Development

---

```xml
spring-boot-starter-test
```

Provides:

- JUnit
- Mockito
- Spring Test Framework

---

# 🌳 Dependency Hierarchy

The Maven Dependency Hierarchy shows all libraries required by the project.

Important dependencies include:

```
spring-boot-starter-web
        │
        ├── Spring MVC
        ├── Spring Core
        ├── Spring Beans
        ├── Spring Context
        ├── Jackson
        └── Embedded Tomcat

spring-boot-devtools

spring-boot-starter-test
        ├── JUnit
        ├── Mockito
        └── Spring Test
```

These dependencies are downloaded automatically by Maven from Maven Central Repository.

---

# 📊 Working Flow

```
SpringLearnApplication
          │
          ▼
@SpringBootApplication
          │
          ▼
Spring Boot Auto Configuration
          │
          ▼
Spring IoC Container
          │
          ▼
Embedded Tomcat Server
          │
          ▼
Application Started Successfully
```

---

# 📸 Sample Build Output

```text
BUILD SUCCESS
```

---

# 📸 Sample Run Output

```text
Tomcat started on port(s): 8080 (http)

Started SpringLearnApplication

Inside main
```

---

# 📚 Concepts Learned

- Spring Boot Project Creation
- Spring Initializr
- Maven Wrapper
- Maven Build Lifecycle
- Project Structure
- Embedded Tomcat
- Spring Boot Auto Configuration
- Spring IoC Container
- @SpringBootApplication
- Maven Dependencies
- Dependency Hierarchy

---

# ✅ Conclusion

A Spring Boot Web project was successfully created using Spring Initializr and Maven. The project was built successfully using Maven Wrapper and executed using Spring Boot's embedded Tomcat server. This hands-on provided an understanding of the Spring Boot project structure, Maven configuration, dependency management, and the purpose of the `@SpringBootApplication` annotation, forming the foundation for upcoming Spring REST development exercises.