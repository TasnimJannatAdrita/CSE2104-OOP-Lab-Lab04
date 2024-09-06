/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentdetailslab04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

// Student class with properties and methods
class Student {
     int id;
     String name;
     String department;
     double cgpa;
     static int studentCount = 0;
     static String university = "XYZ University";

    // Parameterized constructor
    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        studentCount++;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", CGPA: " + cgpa);
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + studentCount);
    }

    // Static method to get the university name
    public static String getUniversity() {
        return university;
    }
}

// Main class demonstrating the use of arrays, ArrayList, and LinkedList
public class StudentDetailsLab04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array of Student objects
        Student[] studentArray = new Student[3];

        // Input and initialization for array
        for (int i = 0; i < studentArray.length; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            studentArray[i] = new Student(id, name, department, cgpa);
        }

        System.out.println("\nStudents in Array:");
        for (Student student : studentArray) {
            student.displayStudentDetails();
        }

        Student.displayTotalStudents();

        // Creating an ArrayList of Student objects
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (int i = 0; i < studentArray.length; i++) {
            studentArrayList.add(studentArray[i]);
        }

        System.out.println("\nStudents in ArrayList:");
        for (Student student : studentArrayList) {
            student.displayStudentDetails();
        }

        Student.displayTotalStudents();

        // Creating a LinkedList of Student objects
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        for (int i = 0; i < studentArray.length; i++) {
            studentLinkedList.add(studentArray[i]);
        }

        System.out.println("\nStudents in LinkedList:");
        for (Student student : studentLinkedList) {
            student.displayStudentDetails();
        }

        Student.displayTotalStudents();

        scanner.close();
    }
}

