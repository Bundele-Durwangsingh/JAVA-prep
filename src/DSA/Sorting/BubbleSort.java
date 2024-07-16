package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
     * compares adjacent elements and swaps them if they are in the wrong order.
     * The pass through the list is repeated until the list is sorted.
     */
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 3, 2, 4, 1};
        Sorting(arr);  // Call the Sorting method to sort the array
        // The sorted array will be printed inside the Sorting method
    }

    static void Sorting(int[] arr) {
        // Loop over each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Loop to compare adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
