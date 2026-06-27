# 📋 Exercise 5: Task Management System

## 📖 Scenario

A software company requires an efficient Task Management System to organize and manage project tasks. The system should support adding, searching, traversing, and deleting tasks efficiently. This exercise demonstrates how a **Singly Linked List** can be used to manage dynamic data using Object-Oriented Programming (OOP) concepts.

---

# 🎯 Objective

Develop a Java-based Task Management System that allows users to:

* Add tasks
* Search tasks by Task ID
* Traverse all tasks
* Delete tasks

using a **Singly Linked List** and Object-Oriented Programming (OOP) principles.

---

# 📂 Project Structure

```text
Exercise_5_Task_Management_System/
│
├── Task.java
├── TaskManagement.java
├── Main.java
└── README.md
```

---

# 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Singly Linked List

---

# 💻 Implementation Overview

### Task.java

Represents a single task in the system.

**Attributes**

* Task ID
* Task Name
* Status

It contains:

* Constructor
* Getters
* Setters
* `toString()` method

---

### TaskManagement.java

Manages tasks using a **Singly Linked List**.

Implemented Operations:

* Add Task
* Search Task
* Traverse Tasks
* Delete Task

Each task is stored inside a linked list node that contains:

* Task object
* Reference to the next node

---

### Main.java

Acts as the driver program.

It demonstrates:

* Creating Task objects
* Adding tasks
* Traversing all tasks
* Searching a task
* Deleting a task
* Displaying the updated task list

---

# ❓ Question 1: How are Linked Lists represented in memory?

Unlike arrays, linked lists are **not stored in contiguous memory locations**.

Each node is created dynamically and contains:

* Data (Task object)
* Reference (pointer) to the next node

Example:

```text
Head
 │
 ▼
[Task1 | • ] → [Task2 | • ] → [Task3 | • ] → NULL
```

Each node can exist anywhere in memory and is connected through references.

---

# ❓ Question 2: What are the advantages of Linked Lists?

### Advantages

* Dynamic size (can grow or shrink during runtime).
* Efficient insertion and deletion without shifting elements.
* Better memory utilization for dynamic data.
* Suitable for applications where the number of records changes frequently.

---

# 📊 Time Complexity Analysis

| Operation      | Time Complexity | Reason                                      |
| -------------- | --------------- | ------------------------------------------- |
| Add Task       | **O(n)**        | Traverse to the last node before insertion. |
| Search Task    | **O(n)**        | Tasks are searched sequentially.            |
| Traverse Tasks | **O(n)**        | Every node is visited once.                 |
| Delete Task    | **O(n)**        | Task is searched before updating links.     |

---

# 🚀 Advantages of Linked Lists over Arrays

Linked Lists provide several benefits compared to arrays:

* Dynamic memory allocation.
* No fixed size limitation.
* Faster insertion and deletion.
* No need to shift elements after deletion.
* Efficient for applications with frequent updates.

---

# 💡 When Should Linked Lists Be Used?

Linked Lists are suitable when:

* The number of records changes frequently.
* Insertions and deletions occur often.
* Dynamic memory allocation is required.
* Sequential traversal is acceptable.

For applications requiring **fast random access**, arrays are generally a better choice.

---

# 📸 Sample Output

```text
Task ID:101, TaskName:Complete DSA, Status:In Progress
Task ID:102, TaskName:Complete Design Patterns, Status:Pending
Task ID:103, TaskName:Complete PLSQL, Status:Yet to Start

Task ID:102, TaskName:Complete Design Patterns, Status:Pending

Task Deleted.

Task ID:101, TaskName:Complete DSA, Status:In Progress
Task ID:103, TaskName:Complete PLSQL, Status:Yet to Start
```

---

# 📚 Concepts Learned

* Classes and Objects
* Constructors
* Encapsulation
* Getters and Setters
* Singly Linked List
* Dynamic Memory Allocation
* Node Creation
* Linked List Traversal
* Searching
* Deletion using Link Manipulation
* Time Complexity Analysis

---

# ✅ Conclusion

The Task Management System successfully demonstrates how tasks can be managed using a **Singly Linked List** in Java. The project implements core operations such as adding, searching, traversing, and deleting tasks while highlighting the advantages of linked lists over arrays. It also emphasizes how choosing an appropriate data structure improves the efficiency and flexibility of applications that manage dynamic data.
