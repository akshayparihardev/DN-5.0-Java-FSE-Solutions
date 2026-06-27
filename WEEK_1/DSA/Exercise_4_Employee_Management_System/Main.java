package WEEK_1.DSA.Exercise_4_Employee_Management_System;

public class Main {
    public static void main(String[] args) {
        
        EmployeeRecords rec = new EmployeeRecords();

        Employee e1 = new Employee(101,"Akshay Parihar","Full Stack Developer",1500000.00);
        Employee e2 = new Employee(102,"Devashish Gadodia","Database Administrator",1500000.00);
        Employee e3 = new Employee(103,"Uday Chandak","AE Video Editor",1500000.00);
        Employee e4 = new Employee(104,"Kartikeya Ambare","AI Engineer",1400000.00);
        Employee e5 = new Employee(105,"Rutu","MBBS Practitioner",3500000.00);

        
        
        rec.addEmployee(e1);
        rec.addEmployee(e2);
        rec.addEmployee(e3);
        rec.addEmployee(e4);
        rec.addEmployee(e5);

        rec.traverseEmployeeRecords();

        rec.deleteEmployee(105);
        
        rec.searchEmployee(105);
    }
}
