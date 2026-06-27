# 📚 Exercise 6: Library Management System

## 📖 Scenario

A library requires an efficient Library Management System that allows users to search for books quickly using their titles. This exercise demonstrates the implementation of two searching techniques—**Linear Search** and **Binary Search**—using Object-Oriented Programming (OOP) concepts in Java.

---

# 🎯 Objective

Develop a Java-based Library Management System that allows users to:

* Store book records
* Search books using **Linear Search**
* Search books using **Binary Search**
* Compare the performance of both searching algorithms

using arrays and Object-Oriented Programming (OOP) principles.

---

# 📂 Project Structure

```text
Exercise_6_Library_Management_System/
│
├── Book.java
├── LibraryManagement.java
├── Main.java
└── README.md
```

---

# 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Arrays
* Linear Search
* Binary Search

---

# 💻 Implementation Overview

### Book.java

Represents a single book in the library.

**Attributes**

* Book ID
* Title
* Author

It contains:

* Constructor
* Getters
* Setters
* `compareTo()` method
* `toString()` method

The class implements the `Comparable<Book>` interface so that books can be sorted by title.

---

### LibraryManagement.java

Implements searching operations on an array of books.

Implemented Operations:

* Linear Search
* Binary Search

The Binary Search method first sorts the array using `Arrays.sort()`, which internally uses the `compareTo()` method defined in the `Book` class.

---

### Main.java

Acts as the driver program.

It demonstrates:

* Creating Book objects
* Performing Linear Search
* Performing Binary Search
* Displaying the search results

---

# ❓ Question 1: What is Linear Search?

Linear Search checks every element one by one until the required book is found or the array ends.

Example:

```text
Books:
[Clean Code] → [Effective Java] → [Design Patterns] → [Head First Java]

Searching "Design Patterns"

Step 1 → Clean Code ❌
Step 2 → Effective Java ❌
Step 3 → Design Patterns ✅
```

---

# ❓ Question 2: What is Binary Search?

Binary Search repeatedly divides the sorted array into two halves until the desired book is found.

Example:

```text
Sorted Books:

[Clean Code] [Design Patterns] [Effective Java] [Head First Java]

Searching "Effective Java"

Middle → Design Patterns
↓

Search Right Half

↓

Effective Java Found ✅
```

---

# 📊 Time Complexity Analysis

| Operation     | Time Complexity | Reason                                             |
| ------------- | --------------- | -------------------------------------------------- |
| Linear Search | **O(n)**        | Books are checked one by one.                      |
| Binary Search | **O(log n)**    | Search space is halved in every iteration.         |
| Sorting       | **O(n log n)**  | Required before Binary Search if data is unsorted. |

---

# 🚀 Comparison of Linear Search and Binary Search

| Linear Search                       | Binary Search                      |
| ----------------------------------- | ---------------------------------- |
| Works on sorted and unsorted arrays | Requires sorted data               |
| Simple implementation               | More efficient for large datasets  |
| Time Complexity: O(n)               | Time Complexity: O(log n)          |
| Suitable for small datasets         | Suitable for large sorted datasets |

---

# 💡 When Should Each Algorithm Be Used?

### Use Linear Search when:

* The dataset is small.
* Data is unsorted.
* Simplicity is preferred.

### Use Binary Search when:

* The dataset is large.
* Data is already sorted.
* Faster searching is required.

---

# 📸 Sample Output

```text
Linear Search:
Book ID: 103, Title: Design Patterns, Author: Gang of Four

Binary Search:
Book ID: 102, Title: Effective Java, Author: Joshua Bloch
```

---

# 📚 Concepts Learned

* Classes and Objects
* Constructors
* Encapsulation
* Getters and Setters
* Comparable Interface
* compareTo() Method
* Arrays
* Linear Search
* Binary Search
* Sorting using Arrays.sort()
* Time Complexity Analysis

---

# ✅ Conclusion

The Library Management System successfully demonstrates the implementation of **Linear Search** and **Binary Search** in Java. The project highlights the differences between the two algorithms in terms of efficiency, implementation, and suitable use cases. It also emphasizes the importance of selecting the appropriate searching algorithm based on the size and ordering of the dataset.
