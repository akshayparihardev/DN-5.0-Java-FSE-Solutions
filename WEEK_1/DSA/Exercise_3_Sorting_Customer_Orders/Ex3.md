# 🛒 Exercise 3: Sorting Customer Orders

## 📖 Scenario

An e-commerce platform requires an efficient system to sort customer orders based on their total price. Sorting helps prioritize high-value orders for processing and improves overall order management. This exercise demonstrates the implementation of **Bubble Sort** and **Quick Sort** using Object-Oriented Programming (OOP) concepts in Java.

---

# 🎯 Objective

Develop a Java-based Customer Order Management System that:

* Stores customer order details
* Sorts orders using **Bubble Sort**
* Sorts orders using **Quick Sort**
* Compares the performance of both sorting algorithms

using arrays and Object-Oriented Programming (OOP) principles.

---

# 📂 Project Structure

```text
Exercise_3_Sorting_Customer_Orders/
│
├── Order.java
├── OrderManagement.java
├── Main.java
└── README.md
```

---

# 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Arrays
* Bubble Sort
* Quick Sort

---

# 💻 Implementation Overview

### Order.java

Represents a single customer order.

**Attributes**

* Order ID
* Customer Name
* Total Price

It contains:

* Constructor
* Getters
* Setters
* `toString()` method

---

### OrderManagement.java

Implements sorting algorithms on an array of customer orders.

Implemented Operations:

* Bubble Sort
* Quick Sort
* Display Orders

Orders are sorted based on their **Total Price** in ascending order.

---

### Main.java

Acts as the driver program.

It demonstrates:

* Creating Order objects
* Displaying unsorted orders
* Sorting using Bubble Sort
* Sorting using Quick Sort
* Displaying sorted orders

---

# ❓ Question 1: What is Bubble Sort?

Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

Example:

```text
4500 2500 7000 3200

↓

2500 4500 3200 7000

↓

2500 3200 4500 7000
```

The largest element "bubbles" to the end after every pass.

---

# ❓ Question 2: What is Quick Sort?

Quick Sort is a **Divide and Conquer** algorithm.

It selects a **pivot** element and partitions the array into:

* Elements smaller than the pivot
* Pivot
* Elements greater than the pivot

The same process is recursively repeated on both partitions.

Example:

```text
4500 2500 7000 3200

Pivot = 3200

↓

2500 | 3200 | 4500 7000

↓

2500 | 3200 | 4500 | 7000
```

---

# 📊 Time Complexity Analysis

| Algorithm   | Best Case      | Average Case   | Worst Case |
| ----------- | -------------- | -------------- | ---------- |
| Bubble Sort | **O(n)**       | **O(n²)**      | **O(n²)**  |
| Quick Sort  | **O(n log n)** | **O(n log n)** | **O(n²)**  |

---

# 🚀 Comparison of Bubble Sort and Quick Sort

| Bubble Sort               | Quick Sort                     |
| ------------------------- | ------------------------------ |
| Simple to implement       | Slightly more complex          |
| Uses repeated swapping    | Uses partitioning              |
| Slower for large datasets | Faster for large datasets      |
| Average Complexity: O(n²) | Average Complexity: O(n log n) |

---

# 💡 Why is Quick Sort Preferred?

Quick Sort is generally preferred because:

* It is significantly faster for large datasets.
* It follows the Divide and Conquer approach.
* It performs fewer comparisons and swaps.
* It has an average time complexity of **O(n log n)**.
* It is widely used in real-world applications.

Bubble Sort is mainly suitable for educational purposes and very small datasets.

---

# 📸 Sample Output

```text
Orders Before Sorting:

Order ID: 101, Customer: Akshay, Total Price: 4500.0
Order ID: 102, Customer: Devashish, Total Price: 2500.0
Order ID: 103, Customer: Uday, Total Price: 7000.0
Order ID: 104, Customer: Kartikeya, Total Price: 3200.0
Order ID: 105, Customer: Rutu, Total Price: 5500.0

Bubble Sort:

Order ID: 102, Customer: Devashish, Total Price: 2500.0
Order ID: 104, Customer: Kartikeya, Total Price: 3200.0
Order ID: 101, Customer: Akshay, Total Price: 4500.0
Order ID: 105, Customer: Rutu, Total Price: 5500.0
Order ID: 103, Customer: Uday, Total Price: 7000.0

Quick Sort:

Order ID: 102, Customer: Devashish, Total Price: 2500.0
Order ID: 104, Customer: Kartikeya, Total Price: 3200.0
Order ID: 101, Customer: Akshay, Total Price: 4500.0
Order ID: 105, Customer: Rutu, Total Price: 5500.0
Order ID: 103, Customer: Uday, Total Price: 7000.0
```

---

# 📚 Concepts Learned

* Classes and Objects
* Constructors
* Encapsulation
* Getters and Setters
* Arrays
* Bubble Sort
* Quick Sort
* Divide and Conquer
* Recursion
* Time Complexity Analysis

---

# ✅ Conclusion

The Customer Order Management System successfully demonstrates how **Bubble Sort** and **Quick Sort** can be used to sort customer orders based on their total price. The project compares the efficiency of both algorithms and highlights why Quick Sort is generally preferred for larger datasets due to its superior average-case performance. It also reinforces the importance of choosing an appropriate sorting algorithm based on the size and nature of the data.
