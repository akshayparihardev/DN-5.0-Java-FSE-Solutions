# 📦 Exercise 7: Implementing Constructor and Setter Injection

## 📖 Scenario

The Library Management System requires both Constructor Injection and Setter Injection to provide better control over bean initialization and dependency management.

---

# 🎯 Objective

Implement dependency injection using:

* Constructor Injection
* Setter Injection
* XML Bean Configuration

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
* Spring IoC Container
* XML Configuration

---

# 💻 Implementation Overview

### BookService.java

Implemented:

* Constructor Injection
* Setter Injection

---

### applicationContext.xml

Configured:

* `<constructor-arg>`
* `<property>`

for dependency injection.

---

# ❓ Question 1: What is Constructor Injection?

Constructor Injection injects dependencies through the class constructor during object creation. It ensures that required dependencies are available when the object is instantiated.

---

# ❓ Question 2: What is Setter Injection?

Setter Injection injects dependencies using setter methods after the object has been created. It provides flexibility for optional dependencies.

---

# 📊 Working Flow

```
ApplicationContext
        │
        ▼
Constructor Injection
        │
        ▼
BookService
        │
Setter Injection
        │
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

* Constructor Injection
* Setter Injection
* Spring IoC
* Bean Initialization
* XML Bean Configuration

---

# ✅ Conclusion

Successfully implemented both Constructor Injection and Setter Injection using Spring XML configuration and verified the dependency injection in the application.