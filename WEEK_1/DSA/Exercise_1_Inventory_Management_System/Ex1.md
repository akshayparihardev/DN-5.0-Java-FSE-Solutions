# 📦 Exercise 1: Inventory Management System

## 📖 Scenario

A warehouse requires an efficient inventory management system to store, update, and manage product information. Since warehouses may contain thousands of products, selecting an appropriate data structure is essential for efficient storage and retrieval.

---

# 🎯 Objective

Develop a Java-based Inventory Management System that allows users to:

* Add new products
* Update existing products
* Delete products
* Display all available products

using appropriate data structures and Object-Oriented Programming (OOP) concepts.

---

# 📂 Project Structure

```
Exercise_1_Inventory_Management_System/
│
├── Product.java
├── Inventory.java
├── Main.java
└── README.md
```

---

# 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList (Java Collections Framework)

---

# 💻 Implementation Overview

### Product.java

Represents a single product in the inventory.

**Attributes**

* Product ID
* Product Name
* Quantity
* Price

It contains:

* Constructor
* Getters
* Setters
* `toString()` method

---

### Inventory.java

Manages all products stored in the inventory.

Implemented Operations:

* Add Product
* Update Product
* Delete Product
* Display Products

Products are stored using an `ArrayList<Product>`.

---

### Main.java

Acts as the driver program.

It demonstrates:

* Creating Product objects
* Adding products
* Updating a product
* Deleting a product
* Displaying the inventory

---

# ❓ Question 1: Why are Data Structures and Algorithms essential in handling large inventories?

Data Structures organize product information efficiently, making operations such as searching, updating, deleting, and displaying products easier to perform.

Algorithms define the steps required to perform these operations efficiently.

Without proper data structures and algorithms, inventory operations become slower as the number of products increases, leading to poor application performance.

---

# ❓ Question 2: Which data structures are suitable for this problem?

Several data structures can be used for inventory management.

### ArrayList

Advantages:

* Dynamic size
* Easy insertion at the end
* Simple traversal
* Easy to implement

Disadvantages:

* Searching, updating, and deleting require linear traversal.

### HashMap

Advantages:

* Very fast searching
* Constant-time insertion
* Constant-time deletion
* Best choice when Product ID is unique

Disadvantages:

* Slightly higher memory usage
* No guaranteed ordering of elements

### Data Structure Used

This implementation uses:

```java
ArrayList<Product>
```

because it is simple, easy to understand, and suitable for beginner-level inventory management applications.

---

# 📊 Time Complexity Analysis

| Operation        | Time Complexity | Reason                                           |
| ---------------- | --------------- | ------------------------------------------------ |
| Add Product      | **O(1)**        | Product is appended to the end of the ArrayList. |
| Update Product   | **O(n)**        | Product ID is searched sequentially.             |
| Delete Product   | **O(n)**        | Product ID is searched before deletion.          |
| Display Products | **O(n)**        | Every product is traversed once.                 |

---

# 🚀 Optimization

The current implementation uses an `ArrayList`, where searching requires linear traversal.

For larger inventories, the system can be optimized by using:

```java
HashMap<Integer, Product>
```

where:

* Key → Product ID
* Value → Product Object

This improves performance.

| Operation | ArrayList | HashMap      |
| --------- | --------- | ------------ |
| Add       | O(1)      | O(1)         |
| Search    | O(n)      | O(1) Average |
| Update    | O(n)      | O(1) Average |
| Delete    | O(n)      | O(1) Average |

---

# 📸 Sample Output

```
Product Added Successfully
Product Added Successfully
Product Added Successfully

Inventory Items
===========================

Product [productId=101, productName=Redmi Note 10 Pro Max, quantity=1, price=13000.0]

Product Updated Successfully

Product Deleted Successfully
```

---

# 📚 Concepts Learned

* Classes and Objects
* Constructors
* Encapsulation
* Getters and Setters
* Object-Oriented Programming (OOP)
* ArrayList
* Enhanced For Loop
* Object Management
* Time Complexity Analysis

---

# ✅ Conclusion

The Inventory Management System successfully performs product addition, updation, deletion, and display operations using Java Collections and Object-Oriented Programming principles. The project demonstrates how choosing an appropriate data structure directly impacts the efficiency and scalability of an application.
