package DSA.LeetCode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    /**
     * Approach:
     * This solution finds all unique triplets in the array that sum up to zero. It uses sorting and a two-pointer technique
     * to efficiently find the triplets.
     * 
     * Explanation:
     * 1. Sort the array to enable the use of the two-pointer technique.
     * 2. Iterate through the array using the index `i` as the first element of the triplet.
     * 3. Skip duplicate elements to avoid duplicate triplets.
     * 4. Use two pointers, `j` and `k`, to find the other two elements of the triplet.
     *    - `j` starts from `i + 1` and `k` starts from the end of the array.
     *    - Calculate the sum of the elements at indices `i`, `j`, and `k`.
     *    - Adjust the pointers based on whether the sum is greater than, less than, or equal to zero.
     *    - If the sum is zero, add the triplet to the result list and skip duplicates for `j`.
     * 5. Return the list of unique triplets.
     */
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); // Initialize the result list
        Arrays.sort(nums); // Sort the array to use two-pointer technique

        // Iterate through the array with index `i`
        for (int i = 0; i < nums.length; i++) {
            // Skip duplicates for the first element of the triplet
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1; // Second element pointer
            int k = nums.length - 1; // Third element pointer

            // Use two-pointer technique to find the other two elements of the triplet
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--; // Reduce the sum by moving the third element pointer to the left
                } else if (total < 0) {
                    j++; // Increase the sum by moving the second element pointer to the right
                } else {
                    // Add the triplet to the result list
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; // Move the second element pointer to the right

                    // Skip duplicates for the second element
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
            }
        }
        return res; // Return the list of unique triplets
    }
}
