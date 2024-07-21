package DSA.LeetCode.Array;

public class SearchinRotatedSortedArray {
    /**
     * Approach:
     * This solution performs a linear search to find the target element in a
     * rotated sorted array.
     * It iterates through the array and compares each element with the target.
     * 
     * Explanation:
     * 1. Iterate through each element in the array.
     * 2. If the current element matches the target, return the index of that
     * element.
     * 3. If the loop completes without finding the target, return -1 indicating the
     * target is not in the array.
     */
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 9;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target) {
        // Linear search through the array to find the target element
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) { // Check if the current element matches the target
                return i; // Return the index if a match is found
            }
        }
        return -1; // Return -1 if the target is not found in the array
    }
}
