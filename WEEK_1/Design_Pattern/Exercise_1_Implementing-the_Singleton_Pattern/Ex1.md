# 🔒 Exercise 1: Implementing the Singleton Pattern

## 📖 Scenario

A software application requires a logging utility that should maintain only **one instance** throughout the application's lifecycle. This ensures consistent logging, avoids unnecessary object creation, and provides a centralized logging mechanism. This exercise demonstrates the implementation of the **Singleton Design Pattern** in Java.

---

# 🎯 Objective

Develop a Java application that:

* Creates a Singleton `Logger` class.
* Ensures only one instance of the Logger exists.
* Provides a global access point to the Logger instance.
* Verifies that the same Logger object is reused throughout the application.

---

# 📂 Project Structure

```text
Exercise_1_Singleton/
│
├── Logger.java
├── Main.java
└── README.md
```

---

# 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Singleton Design Pattern

---

# 💻 Implementation Overview

### Logger.java

Implements the Singleton Design Pattern.

**Features**

* Private static instance of `Logger`
* Private constructor
* Public static `getLogger()` method

The private constructor prevents external object creation, while the `getLogger()` method ensures that only one instance of the class is created.

---

### Main.java

Acts as the driver program.

It demonstrates:

* Obtaining the Logger instance multiple times.
* Comparing object references.
* Verifying that only one Logger instance exists.

---

# ❓ Question 1: What is the Singleton Design Pattern?

The **Singleton Design Pattern** is a **Creational Design Pattern** that restricts the instantiation of a class to **only one object** and provides a global access point to that object.

Example:

```text
Main
 │
 ├── getLogger() ──► Logger Instance
 │
 └── getLogger() ──► Same Logger Instance
```

Both method calls return the same object.

---

# ❓ Question 2: Why is Singleton used for a Logger?

A Logger is shared across the entire application.

Using a Singleton ensures:

* Only one Logger object exists.
* Consistent logging throughout the application.
* Reduced memory usage.
* Centralized management of log messages.

---

# 📊 Time Complexity Analysis

| Operation                | Time Complexity | Reason                                            |
| ------------------------ | --------------- | ------------------------------------------------- |
| `getLogger()`            | **O(1)**        | Returns the existing instance or creates it once. |
| Object Comparison (`==`) | **O(1)**        | Compares object references directly.              |

---

# 🚀 Advantages of Singleton Pattern

* Ensures a single instance of a class.
* Saves memory by avoiding multiple object creation.
* Provides global access to shared resources.
* Maintains consistency throughout the application.
* Easy to implement and use.

---

# 💡 Applications of Singleton Pattern

Singleton is commonly used for:

* Logging utilities
* Database connections
* Configuration managers
* Cache managers
* Thread pools

---

# 📸 Sample Output

```text
Logger Instance created
There exists only one Logger
```

---

# 📚 Concepts Learned

* Classes and Objects
* Constructors
* Private Access Modifier
* Static Variables
* Static Methods
* Singleton Design Pattern
* Object Reference Comparison (`==`)

---

# ✅ Conclusion

The Singleton Logger application successfully demonstrates the implementation of the **Singleton Design Pattern** in Java. By restricting object creation to a single instance and providing a global access point, the application ensures consistent logging while improving memory efficiency and resource management.
