package DSA.LeetCode.Array;

public class FindMinimuminRotatedSortedArray {
    /**
     * Approach:
     * This solution finds the minimum element in a rotated sorted array using a linear scan.
     * It initializes the answer to the first element and iterates through the array to find the smallest element.
     * 
     * Explanation:
     * 1. Initialize the answer with the first element of the array.
     * 2. Iterate through the array.
     * 3. If the current element is smaller than the answer, update the answer.
     * 4. Return the answer after the loop ends.
     */
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        int answer = nums[0]; // Initialize answer with the first element
        // Iterate through the array to find the minimum element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < answer) {
                answer = nums[i]; // Update answer if the current element is smaller
            }
        }
        return answer; // Return the minimum element found
    }
}
