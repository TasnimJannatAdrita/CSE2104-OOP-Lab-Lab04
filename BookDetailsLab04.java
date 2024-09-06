/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookdetailslab04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Book class with properties and methods
class Book {
    private String title;
    private String author;
    private int year;
    private static String genre = "Classic"; // class variable
    private static int bookCount = 0; // class variable

    // Parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        bookCount++;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year + ", Genre: " + genre);
    }

    // Static method to display total number of books
    public static void displayTotalBooks() {
        System.out.println("Total number of books: " + bookCount);
    }

    // Static method to get the genre
    public static String getGenre() {
        return genre;
    }
}

// Main class demonstrating the use of arrays, ArrayList, and LinkedList
public class BookDetailsLab04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array of Book objects
        Book[] bookArray = new Book[3];

        // Input and initialization for array
        for (int i = 0; i < bookArray.length; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            bookArray[i] = new Book(title, author, year);
        }

        System.out.println("\nBooks in Array:");
        for (Book book : bookArray) {
            book.displayBookDetails();
        }

        Book.displayTotalBooks();

        // Creating an ArrayList of Book objects
        List<Book> bookArrayList = new ArrayList<>();
        for (int i = 0; i < bookArray.length; i++) {
            bookArrayList.add(bookArray[i]);
        }

        System.out.println("\nBooks in ArrayList:");
        for (Book book : bookArrayList) {
            book.displayBookDetails();
        }

        Book.displayTotalBooks();

        // Creating a LinkedList of Book objects
        List<Book> bookLinkedList = new LinkedList<>();
        for (int i = 0; i < bookArray.length; i++) {
            bookLinkedList.add(bookArray[i]);
        }

        System.out.println("\nBooks in LinkedList:");
        for (Book book : bookLinkedList) {
            book.displayBookDetails();
        }

        Book.displayTotalBooks();

        scanner.close();
    }
}

