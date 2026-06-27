# 📈 Exercise 7: Financial Forecasting

## 📖 Scenario

A financial organization requires a forecasting tool to estimate the future value of an investment based on its current value, annual growth rate, and number of years. This exercise demonstrates how **recursion** can be used to solve repetitive calculations in a simple and elegant manner using Object-Oriented Programming (OOP) concepts.

---

# 🎯 Objective

Develop a Java-based Financial Forecasting application that:

* Predicts future investment value
* Uses recursion to calculate future values
* Demonstrates the concept of recursive algorithms
* Analyzes the efficiency of recursive solutions

---

# 📂 Project Structure

```text
Exercise_7_Financial_Forecasting/
│
├── FinancialForecast.java
├── Main.java
└── README.md
```

---

# 🛠️ Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Recursion

---

# 💻 Implementation Overview

### FinancialForecast.java

Implements the recursive algorithm for forecasting future investment value.

Implemented Operation:

* Calculate Future Value using Recursion

The recursive method repeatedly applies the annual growth rate until the specified number of years becomes zero.

---

### Main.java

Acts as the driver program.

It demonstrates:

* Creating a `FinancialForecast` object
* Providing current investment value
* Specifying annual growth rate
* Specifying forecast duration
* Displaying the predicted future value

---

# ❓ Question 1: What is Recursion?

Recursion is a programming technique in which a method calls itself to solve a problem by breaking it into smaller subproblems.

Every recursive function contains:

* **Base Case** – Stops the recursion.
* **Recursive Case** – Calls itself with a smaller problem.

Example:

```text
futureValue(value, rate, years)

futureValue(10000,10%,5)
        ↓
futureValue(11000,10%,4)
        ↓
futureValue(12100,10%,3)
        ↓
futureValue(...)
        ↓
Base Case (years = 0)
```

---

# ❓ Question 2: Why use Recursion?

### Advantages

* Makes repetitive problems easier to understand.
* Produces clean and concise code.
* Suitable for divide-and-conquer algorithms.
* Naturally models problems that can be broken into smaller subproblems.

---

# 📊 Time Complexity Analysis

| Operation          | Time Complexity | Reason                                    |
| ------------------ | --------------- | ----------------------------------------- |
| Recursive Forecast | **O(n)**        | One recursive call is made for each year. |

---

# 📊 Space Complexity Analysis

| Operation          | Space Complexity | Reason                                                |
| ------------------ | ---------------- | ----------------------------------------------------- |
| Recursive Forecast | **O(n)**         | Each recursive call occupies space on the call stack. |

---

# 🚀 Optimization of Recursive Solution

Although recursion makes the solution simple and readable, it introduces function call overhead.

Possible optimizations include:

* Using an **iterative approach** to eliminate recursion.
* Applying **Memoization** or **Dynamic Programming** for problems with overlapping subproblems.
* Reducing recursive calls to improve performance and avoid stack overflow for very large inputs.

In this exercise, each recursive call performs a unique calculation, so memoization is not required.

---

# 💡 When Should Recursion Be Used?

Recursion is suitable when:

* Problems can be divided into smaller versions of themselves.
* Tree and graph traversals are required.
* Divide-and-conquer algorithms are implemented.
* The recursive solution is simpler than the iterative one.

For very large datasets, an iterative approach is often preferred to reduce memory usage.

---

# 📸 Sample Output

```text
Current Value : 10000.0
Growth Rate  : 10.0%
Years        : 5
Future Value : 16105.100000000004
```

---

# 📚 Concepts Learned

* Classes and Objects
* Constructors
* Recursion
* Base Case
* Recursive Case
* Method Calling
* Financial Forecasting
* Time Complexity Analysis
* Space Complexity Analysis

---

# ✅ Conclusion

The Financial Forecasting application successfully demonstrates how recursion can be used to calculate future investment values based on annual growth rates. The project highlights the simplicity of recursive algorithms while analyzing their performance and discussing possible optimizations. It also emphasizes the importance of selecting an appropriate algorithmic approach based on the problem size and computational requirements.
