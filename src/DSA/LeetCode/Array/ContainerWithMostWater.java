package DSA.LeetCode.Array;

public class ContainerWithMostWater {
    /**
     * Approach:
     * This solution uses the two-pointer technique to find the maximum amount of water
     * a container can hold. The container is formed by two lines from the given array, 
     * where the x-axis represents the indices and the y-axis represents the heights.
     * 
     * Explanation:
     * 1. Initialize two pointers: one at the beginning (left) and one at the end (right) of the array.
     * 2. Calculate the area formed between the two pointers.
     * 3. Update the maximum area if the newly calculated area is greater.
     * 4. Move the pointer pointing to the shorter line inward to potentially find a taller line that
     *    could result in a larger area.
     * 5. Repeat steps 2-4 until the pointers meet.
     */
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arr));
    }

    static int maxArea(int[] height) {
        int maxArea = 0; // Initialize maxArea to 0
        int left = 0; // Initialize left pointer to the beginning of the array
        int right = height.length - 1; // Initialize right pointer to the end of the array

        // Continue the loop until the left and right pointers meet
        while (left < right) {
            // Calculate the area formed between the left and right pointers
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // Return the maximum area calculated
        return maxArea;
    }
}
