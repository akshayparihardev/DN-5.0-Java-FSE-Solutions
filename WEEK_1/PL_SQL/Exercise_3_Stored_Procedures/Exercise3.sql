-- ==========================================================
-- Exercise 3 : Stored Procedures
-- ==========================================================

SET SERVEROUTPUT ON;

-- ==========================================================
-- Scenario 1
-- Process Monthly Interest for Savings Accounts
-- ==========================================================

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Monthly interest applied successfully.');
END;
/

-- Execute Procedure
BEGIN
    ProcessMonthlyInterest;
END;
/

-------------------------------------------------------------

-- ==========================================================
-- Scenario 2
-- Update Employee Bonus
-- ==========================================================

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
)
IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percent / 100)
    WHERE Department = p_department;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Bonus updated successfully.');
END;
/

-- Execute Procedure
BEGIN
    UpdateEmployeeBonus('IT',10);
END;
/

-------------------------------------------------------------

-- ==========================================================
-- Scenario 3
-- Transfer Funds Between Accounts
-- ==========================================================

CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_account IN NUMBER,
    p_to_account   IN NUMBER,
    p_amount       IN NUMBER
)
IS
    v_balance NUMBER;
BEGIN

    SELECT Balance
    INTO v_balance
    FROM Accounts
    WHERE AccountID = p_from_account;

    IF v_balance >= p_amount THEN

        UPDATE Accounts
        SET Balance = Balance - p_amount
        WHERE AccountID = p_from_account;

        UPDATE Accounts
        SET Balance = Balance + p_amount
        WHERE AccountID = p_to_account;

        COMMIT;

        DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');

    ELSE

        DBMS_OUTPUT.PUT_LINE('Insufficient Balance.');

    END IF;

END;
/

-- Execute Procedure
BEGIN
    TransferFunds(1,2,500);
END;
/