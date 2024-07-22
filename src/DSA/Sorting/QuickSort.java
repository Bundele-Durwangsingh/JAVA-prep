package DSA.Sorting;

import java.util.Arrays;

public class QuickSort {
    // Quick Sort is a divide-and-conquer algorithm that selects a pivot element,
    // partitions the array around the pivot, and recursively sorts the subarrays.
    public static void main(String[] args) {
        int array[] = { 6, 3, 9, 5, 2, 8 }; // Initial unsorted array
        int n = array.length;
        System.out.println("Original array: " + Arrays.toString(array)); // Display the original array
        quickSorting(array, 0, n - 1); // Start the quick sort process
        System.out.println("Sorted array: " + Arrays.toString(array)); // Display the sorted array
    }

    // Function to perform the Quick Sort algorithm
    static void quickSorting(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high); // Find the pivot element
            quickSorting(arr, low, pivot - 1); // Recursively sort the left subarray
            quickSorting(arr, pivot + 1, high); // Recursively sort the right subarray
        }
    }

    // Function to partition the array and return the pivot index
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Initialize the smaller element index

        // Traverse the array and rearrange elements based on the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or the pivot element)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }
}
