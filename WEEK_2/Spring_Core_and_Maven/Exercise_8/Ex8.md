# 📦 Exercise 8: Implementing Basic AOP with Spring

## 📖 Scenario

The Library Management System requires basic Aspect-Oriented Programming (AOP) functionality to separate cross-cutting concerns such as logging from the business logic.

---

# 🎯 Objective

Implement basic Spring AOP by:

* Creating an Aspect class
* Defining Before and After advice
* Enabling AspectJ auto-proxying
* Verifying AOP functionality

---

# 📂 Project Structure

```text
library-management/
│
├── LoggingAspect.java
├── applicationContext.xml
├── BookService.java
└── BookRepository.java
```

---

# 🛠 Technologies Used

* Java
* Maven
* Spring Framework
* Spring AOP
* AspectJ

---

# 💻 Implementation Overview

### LoggingAspect.java

Created an Aspect class using:

* `@Aspect`
* `@Before`
* `@After`

---

### applicationContext.xml

Configured:

* LoggingAspect Bean
* AspectJ Auto Proxy
* Component Scanning

---

# ❓ Question 1: What is Spring AOP?

Spring AOP (Aspect-Oriented Programming) separates cross-cutting concerns such as logging, security, and transactions from the core business logic.

---

# ❓ Question 2: What are Before and After Advice?

- **Before Advice** executes before the target method.
- **After Advice** executes after the target method completes.

---

# 📊 Working Flow

```
Before Advice
      │
      ▼
BookService.display()
      │
      ▼
BookRepository.display()
      │
      ▼
After Advice
```

---

# 📸 Sample Output

```
Before executing : display
Book Service is working...
Book Repository is working...
After executing : display
```

---

# 📚 Concepts Learned

* Spring AOP
* Aspect
* Before Advice
* After Advice
* AspectJ Auto Proxy

---

# ✅ Conclusion

Successfully implemented basic Spring AOP using Before and After advice to log method execution while keeping business logic separate.