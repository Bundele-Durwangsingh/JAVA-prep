package DSA.LeetCode.Array;

public class TwoSum {
    /**
     * Approach:
     * This solution finds two indices in the array such that their corresponding values add up to the target sum.
     * It uses a brute-force approach with nested loops to find the pair of indices.
     * 
     * Explanation:
     * 1. Use two nested loops to iterate through all possible pairs of elements in the array.
     * 2. For each pair, calculate the sum of the elements at those indices.
     * 3. If the sum matches the target, print the indices.
     */
    public static void main(String[] args) {
        int[] nums = {3, 2, 4}; // Array of integers
        int target = 6; // Target sum
        // Iterate through each element with index `i`
        for (int i = 0; i < nums.length; i++) {
            // For each element, iterate through the remaining elements with index `j`
            for (int j = i + 1; j < nums.length; j++) {
                // Calculate the sum of elements at indices `i` and `j`
                int sum = nums[i] + nums[j];
                // If the sum equals the target, print the indices
                if (sum == target) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}
