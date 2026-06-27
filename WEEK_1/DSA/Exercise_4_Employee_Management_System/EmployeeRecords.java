package WEEK_1.DSA.Exercise_4_Employee_Management_System;

public class EmployeeRecords {

    private Employee emp[] = new Employee[5];
    private int count = 0;

    public void addEmployee(Employee employee) {

        if (count < emp.length) {
            emp[count] = employee;
            count++;
            System.out.println("Employee Added Successfully...");
        } else {
            System.out.println("Employee Records are Full...");
        }
    }

    public void deleteEmployee(int empId) {

        for (int i = 0; i < count; i++) {

            if (emp[i].getEmployeeId() == empId) {

                for (int j = i; j < count - 1; j++) {
                    emp[j] = emp[j + 1];
                }

                emp[count - 1] = null;
                count--;

                System.out.println("Employee Deleted Successfully...");
                return;
            }
        }

        System.out.println("Employee Not Found...");
    }

    public void traverseEmployeeRecords() {

        System.out.println("\nEmployee Records:");

        for (int i = 0; i < count; i++) {
            System.out.println(emp[i]);
        }
    }

    public void searchEmployee(int empId) {

        for (int i = 0; i < count; i++) {

            if (emp[i].getEmployeeId() == empId) {
                System.out.println("Employee Found...");
                System.out.println(emp[i]);
                return;
            }
        }

        System.out.println("Employee Not Found...");
    }

}