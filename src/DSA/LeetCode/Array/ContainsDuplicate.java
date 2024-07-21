package DSA.LeetCode.Array;

import java.util.Arrays;

public class ContainsDuplicate {
    /**
     * Approach:
     * This solution checks if the given array contains any duplicates. It first sorts
     * the array, and then checks for consecutive elements that are equal.
     * 
     * Explanation:
     * 1. Sort the array. This ensures that any duplicates will be adjacent to each other.
     * 2. Iterate through the sorted array, starting from the second element.
     * 3. If any two consecutive elements are equal, return true, indicating a duplicate.
     * 4. If no duplicates are found, return false.
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Solution(nums));
    }

    static Boolean Solution(int[] nums) {
        Arrays.sort(nums); // Sort the array to bring duplicates next to each other
        int n = nums.length; // Get the length of the array
        // Iterate through the sorted array
        for (int i = 1; i < n; i++) {
            // Check if the current element is equal to the previous element
            if (nums[i] == nums[i - 1]) {
                return true; // Return true if a duplicate is found
            }
        }
        return false; // Return false if no duplicates are found
    }
}
