# 🏦 Exercise 3: Stored Procedures

## 📖 Scenario

Banks frequently perform repetitive operations such as processing monthly interest, updating employee bonuses, and transferring funds between customer accounts. Instead of writing the same SQL statements repeatedly, these operations can be encapsulated into reusable **Stored Procedures**.

---

# 🎯 Objective

Develop PL/SQL Stored Procedures to:

* Process monthly interest for all savings accounts.
* Update employee salaries by applying a bonus percentage.
* Transfer funds securely between customer accounts after validating the available balance.

---

# 📂 Project Structure

```text
Exercise_3_Stored_Procedures/
│
├── Exercise3.sql
└── Ex3.md
```

---

# 🛠️ Technologies Used

* Oracle SQL
* PL/SQL
* Oracle Database
* SQL Developer / Oracle Live SQL

---

# 💻 Implementation Overview

### Scenario 1: Process Monthly Interest

* Creates a stored procedure to calculate and apply **1% monthly interest** to all savings accounts.
* Updates account balances automatically.

---

### Scenario 2: Update Employee Bonus

* Creates a stored procedure that accepts a **department name** and **bonus percentage** as parameters.
* Updates employee salaries based on the provided bonus.

---

### Scenario 3: Transfer Funds

* Creates a stored procedure to transfer money between two accounts.
* Checks whether the source account has sufficient balance.
* Updates both account balances only if the transaction is valid.

---

# 📚 PL/SQL Concepts Used

* Stored Procedures
* Procedure Parameters
* SELECT INTO
* UPDATE Statement
* Conditional Statements (IF)
* Transaction Control (`COMMIT`)
* DBMS_OUTPUT Package

---

# 🚀 Learning Outcomes

After completing this exercise, I learned how to:

* Create and execute PL/SQL stored procedures.
* Pass parameters to procedures.
* Encapsulate reusable business logic.
* Perform secure database updates.
* Implement banking operations using procedural programming.
* Improve code reusability and maintainability.

---

# ✅ Conclusion

This exercise demonstrates how Stored Procedures simplify database programming by grouping reusable business logic into named procedures. They improve code organization, reduce redundancy, and make banking operations more secure and maintainable.
