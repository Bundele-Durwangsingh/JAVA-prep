package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {

    /**
     * Selection Sort is a simple sorting algorithm that divides the input list into two parts:
     * the sublist of items already sorted, which is built up from left to right at the front (left) of the list,
     * and the sublist of items remaining to be sorted that occupy the rest of the list.
     * Initially, the sorted sublist is empty and the unsorted sublist is the entire input list.
     * The algorithm proceeds by finding the smallest (or largest, depending on the sorting order) element
     * from the unsorted sublist, swapping it with the leftmost unsorted element (putting it in sorted order),
     * and moving the sublist boundaries one element to the right.
     */
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 3, 2, 4, 1};
        Sorting(arr);  // Call the Sorting method to sort the array
        // The sorted array will be printed inside the Sorting method
    }

    static void Sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int SmallestElement = i;  // Assume the current element is the smallest
            // Loop to find the smallest element in the remaining unsorted array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[SmallestElement] > arr[j]) {
                    SmallestElement = j;  // Update the index of the smallest element
                }
            }
            // Swap the found smallest element with the first element of the unsorted part
            int temp = arr[SmallestElement];
            arr[SmallestElement] = arr[i];
            arr[i] = temp;
        }
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
