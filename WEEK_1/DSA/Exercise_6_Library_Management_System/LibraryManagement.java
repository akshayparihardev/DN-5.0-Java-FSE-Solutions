package WEEK_1.DSA.Exercise_6_Library_Management_System;

import java.util.Arrays;

public class LibraryManagement {

    // Linear Search
    public Book linearSearch(Book[] books, String title) {

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }

    // Binary Search
    public Book binarySearch(Book[] books, String title) {

        Arrays.sort(books);   // Uses compareTo() from Book class

        int left = 0;
        int right = books.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            Book searchBook = new Book(0, title, "");

            int compare = books[mid].compareTo(searchBook);

            if (compare == 0) {
                return books[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}