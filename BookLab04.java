/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.booklab04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

// Book class with properties and a parameterized constructor
class Book {
     String title;
     String author;
     int year;
     String genre;

    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year + ", Genre: " + genre;
    }
}

// Main class demonstrating the use of ArrayList and LinkedList
public class BookLab04 {

    // Method to display books in a list
    private static void displayBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 1988, "Spirituality");
        Book book2 = new Book("The Spy Who Came in From the Cold", "John le Carre", 1963, "Thriller");
        Book book3 = new Book("Sir Ra Pera Day", "SMDT", 2024, "Suspence");

        // Using ArrayList to manage books
        List<Book> arrayListBooks = new ArrayList<>();
        arrayListBooks.add(book1);
        arrayListBooks.add(book2);
        arrayListBooks.add(book3);

        System.out.println("Books in ArrayList:");
        displayBooks(arrayListBooks);

        // Remove a particular book from ArrayList
        arrayListBooks.remove(book2);

        System.out.println("\nBooks in ArrayList after removal:");
        displayBooks(arrayListBooks);

        // Using LinkedList to manage books
        List<Book> linkedListBooks = new LinkedList<>();
        linkedListBooks.add(book1);
        linkedListBooks.add(book2);
        linkedListBooks.add(book3);

        System.out.println("\nBooks in LinkedList:");
        displayBooks(linkedListBooks);

        // Remove a particular book from LinkedList
        linkedListBooks.remove(book2);

        System.out.println("\nBooks in LinkedList after removal:");
        displayBooks(linkedListBooks);
    }
}

