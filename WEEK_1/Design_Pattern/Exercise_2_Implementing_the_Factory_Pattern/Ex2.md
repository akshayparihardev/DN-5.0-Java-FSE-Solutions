# 🏭 Exercise 2: Implementing the Factory Method Pattern

## 📖 Scenario

A document management system needs to create different types of documents such as **Word**, **PDF**, and **Excel**. Instead of directly creating document objects, the application uses the **Factory Method Design Pattern** to encapsulate the object creation process. This improves flexibility, scalability, and maintainability.

---

# 🎯 Objective

Develop a Java application that:

* Creates different document types.
* Uses the Factory Method Design Pattern.
* Encapsulates object creation inside factory classes.
* Demonstrates runtime creation of different document objects.

---

# 📂 Project Structure

```text
Exercise_2_Factory_Method/
│
├── Document.java
├── WordDocument.java
├── PdfDocument.java
├── ExcelDocument.java
├── DocumentFactory.java
├── WordDocumentFactory.java
├── PdfDocumentFactory.java
├── ExcelDocumentFactory.java
├── Main.java
└── README.md
```

---

# 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Factory Method Design Pattern

---

# 💻 Implementation Overview

### Document.java

Defines the common interface for all document types.

It declares the common operation:

* `open()`

---

### Concrete Document Classes

The following classes implement the `Document` interface:

* `WordDocument`
* `PdfDocument`
* `ExcelDocument`

Each class provides its own implementation of the `open()` method.

---

### DocumentFactory.java

Defines the abstract factory class.

It declares the factory method:

* `createDocument()`

---

### Concrete Factory Classes

Each factory extends `DocumentFactory` and creates its corresponding document.

Implemented Factories:

* `WordDocumentFactory`
* `PdfDocumentFactory`
* `ExcelDocumentFactory`

Each factory overrides the `createDocument()` method.

---

### Main.java

Acts as the driver program.

It demonstrates:

* Creating different factory objects.
* Creating document objects through factories.
* Calling the `open()` method on each document.

---

# ❓ Question 1: What is the Factory Method Pattern?

The **Factory Method Pattern** is a **Creational Design Pattern** that defines an interface for creating objects but allows subclasses to decide which specific object should be created.

Instead of creating objects directly using `new`, object creation is delegated to factory classes.

Example:

```text
             DocumentFactory
                   │
      ┌────────────┼────────────┐
      │            │            │
      ▼            ▼            ▼
 WordFactory   PdfFactory   ExcelFactory
      │            │            │
      ▼            ▼            ▼
WordDocument PdfDocument ExcelDocument
```

---

# ❓ Question 2: Why use the Factory Method Pattern?

### Advantages

* Encapsulates object creation.
* Promotes loose coupling.
* Makes the application easier to extend.
* Improves code maintainability.
* Follows the Open/Closed Principle.

---

# 📊 Time Complexity Analysis

| Operation       | Time Complexity | Reason                                           |
| --------------- | --------------- | ------------------------------------------------ |
| Create Document | **O(1)**        | Factory simply creates and returns an object.    |
| Open Document   | **O(1)**        | Calls the corresponding implementation directly. |

---

# 🚀 Benefits of Factory Method Pattern

The Factory Method Pattern provides several advantages:

* Hides object creation logic.
* Improves code readability.
* Makes adding new document types easier.
* Reduces dependency on concrete classes.
* Encourages extensible software design.

---

# 💡 Applications of Factory Method Pattern

Factory Method is commonly used for:

* Document Management Systems
* Database Driver Creation
* GUI Component Creation
* Notification Systems
* Payment Gateway Integration

---

# 📸 Sample Output

```text
Opening Word Document...
Opening PDF Document...
Opening Excel Document...
```

---

# 📚 Concepts Learned

* Classes and Objects
* Interfaces
* Abstract Classes
* Inheritance
* Method Overriding
* Polymorphism
* Factory Method Design Pattern
* Loose Coupling
* Object Creation

---

# ✅ Conclusion

The Document Management System successfully demonstrates the implementation of the **Factory Method Design Pattern** in Java. By delegating object creation to specialized factory classes, the application achieves loose coupling, improved maintainability, and easier extensibility. This pattern is widely used in enterprise applications where object creation needs to remain flexible and scalable.
