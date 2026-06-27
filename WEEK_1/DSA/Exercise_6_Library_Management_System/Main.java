package WEEK_1.DSA.Exercise_6_Library_Management_System;

public class Main {
    public static void main(String[] args) {

        LibraryManagement lm = new LibraryManagement();

        Book[] books = new Book[5];

        books[0] = new Book(101, "Clean Code", "Robert C. Martin");
        books[1] = new Book(102, "Effective Java", "Joshua Bloch");
        books[2] = new Book(103, "Design Patterns", "Gang of Four");
        books[3] = new Book(104, "Java Concurrency in Practice", "Brian Goetz");
        books[4] = new Book(105, "Head First Java", "Kathy Sierra");

        System.out.println("Linear Search:");

        Book result1 = lm.linearSearch(books, "Design Patterns");

        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Book Not Found...");
        }

        System.out.println();

        System.out.println("Binary Search:");

        Book result2 = lm.binarySearch(books, "Effective Java");

        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Book Not Found...");
        }
    }
}