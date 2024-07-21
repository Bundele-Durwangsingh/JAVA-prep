package DSA.LeetCode.Array;

public class MaximumSubarray {
    /**
     * Approach:
     * This solution uses Kadane's Algorithm to find the maximum sum of a contiguous subarray.
     * It iterates through the array, maintaining the sum of the current subarray and updating
     * the maximum sum found.
     * 
     * Explanation:
     * 1. Initialize the current subarray sum (sum) to 0.
     * 2. Initialize the maximum subarray sum (max) to the smallest possible integer value.
     * 3. Iterate through the array.
     * 4. Add the current element to the current subarray sum.
     * 5. Update the maximum subarray sum if the current subarray sum is greater.
     * 6. If the current subarray sum becomes negative or zero, reset it to 0.
     * 7. Return the maximum subarray sum found.
     */
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(arr);
        System.out.println(result); // Expected output: 6
    }

    static int maxSubArray(int[] nums) {
        int sum = 0; // Initialize current subarray sum to 0
        int max = Integer.MIN_VALUE; // Initialize maximum subarray sum to the smallest possible integer value

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i]; // Add the current element to the current subarray sum
            max = Math.max(max, sum); // Update maximum subarray sum if the current sum is greater
            if (sum <= 0) { // If the current sum is negative or zero, reset it to 0
                sum = 0;
            }
        }

        return max; // Return the maximum subarray sum found
    }
}
