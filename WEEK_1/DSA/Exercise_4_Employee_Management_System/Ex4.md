# 👨‍💼 Exercise 4: Employee Management System

## 📖 Scenario

A company requires an efficient Employee Management System to manage employee records. The system should support adding, searching, traversing, and deleting employee information efficiently. This exercise demonstrates how arrays can be used to store and manage employee records using Object-Oriented Programming (OOP) concepts.

---

# 🎯 Objective

Develop a Java-based Employee Management System that allows users to:

* Add employee records
* Search employees by Employee ID
* Traverse all employee records
* Delete employee records

using arrays and Object-Oriented Programming (OOP) principles.

---

# 📂 Project Structure

```text
Exercise_4_Employee_Management_System/
│
├── Employee.java
├── EmployeeRecords.java
├── Main.java
└── README.md
```

---

# 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Arrays

---

# 💻 Implementation Overview

### Employee.java

Represents a single employee in the organization.

**Attributes**

* Employee ID
* Employee Name
* Position
* Salary

It contains:

* Constructor
* Getters
* Setters
* `toString()` method

---

### EmployeeRecords.java

Manages employee records stored in an array.

Implemented Operations:

* Add Employee
* Search Employee
* Traverse Employee Records
* Delete Employee

Employee objects are stored using an array of `Employee` objects.

---

### Main.java

Acts as the driver program.

It demonstrates:

* Creating Employee objects
* Adding employees
* Traversing employee records
* Searching an employee
* Deleting an employee
* Displaying the updated employee records

---

# ❓ Question 1: How are arrays represented in memory?

Arrays are stored in **contiguous memory locations**, meaning each element occupies consecutive memory addresses.

Each element is accessed using its index, allowing direct and efficient retrieval.

Example:

```text
Index        0        1        2        3        4

Array     [Emp1]   [Emp2]   [Emp3]   [Emp4]   [Emp5]
```

---

# ❓ Question 2: What are the advantages of arrays?

### Advantages

* Fast random access using indexes.
* Easy to implement and understand.
* Efficient memory utilization.
* Suitable when the number of elements is fixed.

---

# 📊 Time Complexity Analysis

| Operation          | Time Complexity | Reason                                                        |
| ------------------ | --------------- | ------------------------------------------------------------- |
| Add Employee       | **O(1)**        | Employee is inserted at the next available position.          |
| Search Employee    | **O(n)**        | Employee ID is searched sequentially.                         |
| Traverse Employees | **O(n)**        | Every employee record is visited once.                        |
| Delete Employee    | **O(n)**        | Employee is searched and remaining elements are shifted left. |

---

# 🚀 Limitations of Arrays

Arrays have several limitations:

* Fixed size after creation.
* Cannot grow dynamically.
* Insertion and deletion require shifting elements.
* Inefficient for frequent updates.
* Searching takes linear time for unsorted data.

---

# 💡 When Should Arrays Be Used?

Arrays are suitable when:

* The number of records is fixed.
* Fast index-based access is required.
* Memory efficiency is important.
* Insertions and deletions are infrequent.

For applications where records change frequently, dynamic data structures such as **ArrayList** or **LinkedList** are more suitable.

---

# 📸 Sample Output

```text
Employee Added Successfully...
Employee Added Successfully...
Employee Added Successfully...
Employee Added Successfully...
Employee Added Successfully...

Employee Records:
Employee [employeeId=101, name=Akshay Parihar, position=Full Stack Developer, salary=1500000.0]
Employee [employeeId=102, name=Devashish Gadodia, position=Database Administrator, salary=1500000.0]
Employee [employeeId=103, name=Uday Chandak, position=AE Video Editor, salary=1500000.0]
Employee [employeeId=104, name=Kartikeya Ambare, position=AI Engineer, salary=1400000.0]
Employee [employeeId=105, name=Rutu, position=MBBS Practitioner, salary=3500000.0]

Employee Deleted Successfully...

Employee Not Found...
```

---

# 📚 Concepts Learned

* Classes and Objects
* Constructors
* Encapsulation
* Getters and Setters
* Arrays
* Array Traversal
* Searching
* Deletion using Element Shifting
* Object Management
* Time Complexity Analysis

---

# ✅ Conclusion

The Employee Management System successfully demonstrates how employee records can be managed using arrays in Java. The project implements core operations such as adding, searching, traversing, and deleting employee records while highlighting the advantages and limitations of arrays. It also emphasizes how selecting an appropriate data structure impacts the efficiency and scalability of an application.
