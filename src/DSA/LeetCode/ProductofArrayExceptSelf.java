package DSA.LeetCode;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        productExceptSelf(arr);
    }
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Initialize the answer array with 1
        Arrays.fill(ans, 1);

        // Calculate the left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate the right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return ans;
    }
}
