package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {

    /**
     * Insertion sort iterates, consuming one input element each repetition, and
     * growing a sorted output list.
     * At each iteration, insertion sort removes one element from the input data,
     * finds the location it belongs within the sorted list,
     * and inserts it there. It repeats until no input elements remain.
     */
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 3, 2, 4, 1 };
        Sorting(arr); // Call the Sorting method to sort the array
        // The sorted array will be printed inside the Sorting method
    }

    static void Sorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int CurrentElement = arr[i]; // The element to be positioned
            int j = i - 1;
            // Shift elements of the sorted segment to the right to create the position for
            // the CurrentElement
            while (j >= 0 && CurrentElement < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place the CurrentElement at its correct position
            arr[j + 1] = CurrentElement;
        }
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
