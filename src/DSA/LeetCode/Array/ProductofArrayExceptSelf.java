package DSA.LeetCode.Array;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    /**
     * Approach:
     * This solution calculates the product of all elements in an array except the element at the current index.
     * It uses two passes to compute the left and right products and then combines them to get the final result.
     * 
     * Explanation:
     * 1. Initialize an array `ans` of the same length as `nums` to store the results.
     * 2. Set all elements of `ans` to 1.
     * 3. First pass (left products):
     *    - Traverse the array from left to right.
     *    - For each element, update `ans[i]` with the product of all elements to the left of `i`.
     * 4. Second pass (right products):
     *    - Traverse the array from right to left.
     *    - For each element, update `ans[i]` with the product of all elements to the right of `i`.
     * 5. Return the `ans` array.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = productExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n]; // Array to store the result

        // Initialize the answer array with 1
        Arrays.fill(ans, 1);

        // Calculate the left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= leftProduct; // Multiply the current element of `ans` with the left product
            leftProduct *= nums[i]; // Update the left product for the next iteration
        }

        // Calculate the right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProduct; // Multiply the current element of `ans` with the right product
            rightProduct *= nums[i]; // Update the right product for the next iteration
        }

        return ans; // Return the result array
    }
}
