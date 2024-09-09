/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayobjects;

/**
 *
 * @author DELL
 */
public class ArrayOfObjects {
    public static void main(String[] args){
                 BookArrayLab04[] books = new BookArrayLab04[3];
                 
                 books[0] = new BookArrayLab04("Book 1", "Author 1", 2020, "Fiction");
                 books[1] = new BookArrayLab04("Book 2", "Author 2", 2018, "Thriller");
                 books[2] = new BookArrayLab04("Book 3", "Author 3", 2016, "Mystery");
                 
                 System.out.println("Initial Book details:");
                 for (BookArrayLab04 book : books) {
                          book.displayDetails();
                 }
                 books[1] = null;
                 
                 System.out.println("Book Details after Removing an Object:");
                 for (BookArrayLab04 book : books) {
                        if (book != null) {
                        book.displayDetails();
                        }
                 }
    }
    
}
