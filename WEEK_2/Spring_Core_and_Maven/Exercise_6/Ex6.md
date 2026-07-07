# 📦 Exercise 6: Configuring Beans with Annotations

## 📖 Scenario

The Library Management System is enhanced by replacing manual XML bean definitions with annotation-based bean configuration. Spring automatically detects and registers components using component scanning.

---

# 🎯 Objective

Configure Spring beans using annotations by:

* Enabling component scanning
* Using `@Service` for the service layer
* Using `@Repository` for the repository layer
* Verifying annotation-based bean configuration

---

# 📂 Project Structure

```text
library-management/
│
├── BookService.java
├── BookRepository.java
└── applicationContext.xml
```

---

# 🛠 Technologies Used

* Java
* Maven
* Spring Framework
* Spring Context
* Component Scanning
* Annotation-based Configuration

---

# 💻 Implementation Overview

### BookService.java

Annotated with:

```java
@Service
```

---

### BookRepository.java

Annotated with:

```java
@Repository
```

---

### applicationContext.xml

Enabled component scanning using:

```xml
<context:component-scan base-package="com.library"/>
```

---

# ❓ Question 1: What is Component Scanning?

Component Scanning allows Spring to automatically detect and register classes annotated with stereotypes such as `@Component`, `@Service`, `@Repository`, and `@Controller`.

---

# ❓ Question 2: Why use Annotations instead of XML?

Annotation-based configuration reduces XML configuration, improves readability, and makes the application easier to maintain.

---

# 📸 Sample Output

```
Book Service is working...
Book Repository is working...
```

---

# 📚 Concepts Learned

* Component Scanning
* @Service
* @Repository
* Annotation-based Configuration
* Spring IoC Container

---

# ✅ Conclusion

Successfully configured Spring beans using annotations and enabled component scanning to simplify bean management.