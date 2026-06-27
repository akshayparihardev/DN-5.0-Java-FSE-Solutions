# 🔍 Exercise 2: E-commerce Platform Search Function

## 📖 Scenario

An e-commerce platform contains thousands of products, and customers expect search results instantly. Efficient searching algorithms are essential for quickly locating products and providing a smooth shopping experience. Choosing the right search algorithm directly impacts the platform's performance and user experience.

---

# 🎯 Objective

Develop a Java-based E-commerce Search System that allows users to:

* Store product information
* Search products using **Linear Search**
* Search products using **Binary Search**
* Compare the performance of both searching algorithms

using appropriate searching techniques and Object-Oriented Programming (OOP) concepts.

---

# 📂 Project Structure

```text
Exercise_2_E_commerce_Platform_Search_Function/
│
├── Product.java
├── Main.java
└── README.md
```

---

# 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Arrays
* Arrays Utility Class (`Arrays.sort()`)
* Comparable Interface
* Linear Search
* Binary Search

---

# 💻 Implementation Overview

### Product.java

Represents a single product available on the e-commerce platform.

**Attributes**

* Product ID
* Product Name
* Category

It contains:

* Constructor
* Getters
* `compareTo()` method
* `toString()` method

The `compareTo()` method enables Product objects to be sorted based on their Product ID before performing Binary Search.

---

### Main.java

Acts as the driver program.

Implemented Operations:

* Create Product objects
* Store Product objects in an array
* Perform Linear Search
* Sort the array using `Arrays.sort()`
* Perform Binary Search on the sorted array
* Display product details if found

---

# ❓ Question 1: What is Big O Notation and why is it important?

Big O Notation is a mathematical notation used to describe the efficiency of an algorithm as the input size increases.

It helps developers analyze how an algorithm performs for large datasets and compare different algorithms based on their execution time. Algorithms with lower time complexity generally perform better as the amount of data grows.

---

# ❓ Question 2: Best, Average and Worst Case Scenarios

### Linear Search

**Best Case:** **O(1)**

* The required product is found at the first position.

**Average Case:** **O(n)**

* The product is found somewhere in the middle of the array.

**Worst Case:** **O(n)**

* The product is located at the last position or is not present in the array.

---

### Binary Search

**Best Case:** **O(1)**

* The required product is found exactly at the middle position.

**Average Case:** **O(log n)**

* The search space is repeatedly divided into half until the product is found.

**Worst Case:** **O(log n)**

* The product is found after several divisions or is not present in the array.

---

# 📊 Time Complexity Comparison

| Algorithm     | Best Case | Average Case | Worst Case   |
| ------------- | --------- | ------------ | ------------ |
| Linear Search | **O(1)**  | **O(n)**     | **O(n)**     |
| Binary Search | **O(1)**  | **O(log n)** | **O(log n)** |

---

# 🚀 Which Algorithm is More Suitable?

### Linear Search

**Advantages**

* Works on both sorted and unsorted arrays.
* Easy to implement.
* Suitable for small datasets.

**Disadvantages**

* Slower for large datasets.
* Searches each element sequentially.

---

### Binary Search

**Advantages**

* Much faster for large datasets.
* Reduces the search space by half after every comparison.
* More efficient than Linear Search.

**Disadvantages**

* Works only on sorted arrays.
* Requires sorting before searching if the data is unsorted.

### Algorithm Used

This implementation demonstrates both:

* Linear Search
* Binary Search

For large e-commerce platforms, **Binary Search** is more suitable because it provides significantly faster searching on sorted data, resulting in better performance and improved user experience.

---

# 📸 Sample Output

```text
===== Linear Search =====
Product Found!
Product ID : 104
Product Name : Asus ROG F16
Category : Laptop

===== Binary Search =====
Product Found!
Product ID : 102
Product Name : Samsung S20 FE
Category : Mobile
```

---

# 📚 Concepts Learned

* Classes and Objects
* Constructors
* Encapsulation
* Getters
* Method Overriding
* Comparable Interface
* Arrays
* Arrays.sort()
* Linear Search
* Binary Search
* Big O Notation
* Time Complexity Analysis

---

# ✅ Conclusion

The E-commerce Platform Search Function successfully demonstrates the implementation of both Linear Search and Binary Search using Java. The project highlights the importance of choosing an appropriate searching algorithm based on the dataset size and organization. While Linear Search is simple and suitable for small or unsorted datasets, Binary Search offers significantly better performance for large sorted datasets, making it the preferred choice for real-world e-commerce applications.
