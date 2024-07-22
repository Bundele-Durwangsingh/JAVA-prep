package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    // Merge Sort is a divide-and-conquer algorithm that splits the array into 
    // smaller subarrays, sorts them, and then merges them back together.
    public static void main(String[] args) {
        int array[] = { 6, 3, 9, 5, 2, 8 }; // Initial unsorted array
        int length = array.length;
        System.out.println("Original array: " + Arrays.toString(array)); // Display the original array
        Divide(array, 0, length - 1); // Start the divide process
        System.out.println("Sorted array: " + Arrays.toString(array)); // Display the sorted array
    }

    // Function to divide the array into subarrays
    static void Divide(int array[], int StartIndex, int EndIndex) {
        if (StartIndex >= EndIndex) {
            return; // Base case: if the array has one or no element
        }
        int MiddleIndex = StartIndex + (EndIndex - StartIndex) / 2; // Find the middle index
        Divide(array, StartIndex, MiddleIndex); // Recursively divide the left subarray
        Divide(array, MiddleIndex + 1, EndIndex); // Recursively divide the right subarray
        Conquer(array, StartIndex, MiddleIndex, EndIndex); // Merge the divided arrays
    }

    // Function to merge the divided subarrays
    static void Conquer(int[] array, int StartIndex, int MiddleIndex, int EndIndex) {
        int Merged[] = new int[EndIndex - StartIndex + 1]; // Temporary array to hold merged elements
        int Index1 = StartIndex; // Initial index of the first subarray
        int Index2 = MiddleIndex + 1; // Initial index of the second subarray
        int x = 0; // Initial index of the merged array

        // Merge elements from both subarrays in sorted order
        while (Index1 <= MiddleIndex && Index2 <= EndIndex) {
            if (array[Index1] <= array[Index2]) {
                Merged[x++] = array[Index1++]; // If element in the first subarray is smaller, add it to merged array
            } else {
                Merged[x++] = array[Index2++]; // If element in the second subarray is smaller, add it to merged array
            }
        }

        // Add remaining elements from the first subarray, if any
        while (Index1 <= MiddleIndex) {
            Merged[x++] = array[Index1++];
        }

        // Add remaining elements from the second subarray, if any
        while (Index2 <= EndIndex) {
            Merged[x++] = array[Index2++];
        }

        // Copy the merged elements back to the original array
        for (int i = 0, j = StartIndex; i < Merged.length; i++, j++) {
            array[j] = Merged[i];
        }
    }
}
