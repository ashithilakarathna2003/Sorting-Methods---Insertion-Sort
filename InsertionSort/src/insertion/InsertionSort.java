package insertion;

import java.util.Scanner;

public class InsertionSort {

    // Function to implement Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements of array[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main function to get user input and test the Insertion Sort
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is Insertion Sort!");
        System.out.println("Press Enter Key to continue...");
        scanner.nextLine();
        System.out.println("Enter the number of elements you want :- ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements one by one :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("This is Unsorted array:");
        printArray(arr);
        
        insertionSort(arr);
        System.out.println();
        
        System.out.println("This is Sorted array:");
        printArray(arr);
        System.out.println();
        System.out.println("End");

        scanner.close();
    }
}
