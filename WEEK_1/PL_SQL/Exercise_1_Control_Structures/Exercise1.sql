-- Exercise 1 - Scenario 1
-- Apply a 1% interest discount to customers above 60 years of age.

SET SERVEROUTPUT ON;

BEGIN
    FOR c IN (
        SELECT CustomerID, DOB
        FROM Customers
    )
    LOOP
        IF TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = c.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to Customer ID: '
                || c.CustomerID
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/


-- Exercise 1 - Scenario 2
-- Promote customers having balance greater than 10000.

SET SERVEROUTPUT ON;

BEGIN
    FOR c IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP
        IF c.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = c.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Customer '
                || c.CustomerID
                || ' promoted to VIP.'
            );

        END IF;
    END LOOP;

    COMMIT;
END;
/


-- Exercise 1 - Scenario 3
-- Display reminder for customers whose loan is due within 30 days.

SET SERVEROUTPUT ON;

BEGIN
    FOR l IN (
        SELECT CustomerID,
               LoanID,
               EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE
                          AND SYSDATE + 30
    )
    LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer '
            || l.CustomerID
            || ' has Loan ID '
            || l.LoanID
            || ' due on '
            || TO_CHAR(l.EndDate, 'DD-MON-YYYY')
        );

    END LOOP;
END;
/