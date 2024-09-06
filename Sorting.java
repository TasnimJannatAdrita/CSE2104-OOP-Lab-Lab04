/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sorting;

public class Sorting {

    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Merge Sort
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: arrays with 0 or 1 elements are already sorted
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Copy data to temp arrays left[] and right[]
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    // Helper method to merge two sorted arrays
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        // Copy remaining elements of left[], if any
        while (i < left.length) {
            array[k++] = left[i++];
        }
        // Copy remaining elements of right[], if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Method to print array
    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    // Main method to test sorting algorithms
    public static void main(String[] args) {
        int[] array1 = {54, 35, 50, 13, 64, 25, 16};
        int[] array2 = array1.clone();
        int[] array3 = array1.clone();

        System.out.println("Original Array:");
        printArray(array1);

        bubbleSort(array1);
        System.out.println("Array after Bubble Sort:");
        printArray(array1);

        selectionSort(array2);
        System.out.println("Array after Selection Sort:");
        printArray(array2);

        mergeSort(array3);
        System.out.println("Array after Merge Sort:");
        printArray(array3);
    }
}
