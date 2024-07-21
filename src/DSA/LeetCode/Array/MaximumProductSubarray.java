package DSA.LeetCode.Array;

public class MaximumProductSubarray {
    /**
     * Approach:
     * This solution finds the maximum product of a subarray in the given array
     * using the prefix and suffix products.
     * It iterates through the array, calculating the product of elements from the
     * start and the end simultaneously,
     * and keeps track of the maximum product encountered.
     * 
     * Explanation:
     * 1. Initialize prefix and suffix products to 1.
     * 2. Initialize the maximum product to the smallest possible integer value.
     * 3. Iterate through the array from the beginning and the end simultaneously.
     * 4. Update the prefix product by multiplying it with the current element from
     * the start.
     * 5. Update the suffix product by multiplying it with the current element from
     * the end.
     * 6. Reset prefix and suffix products to 1 if they become zero (to handle cases
     * where subarray contains zero).
     * 7. Update the maximum product with the maximum of the current prefix product,
     * suffix product, and previous maximum product.
     * 8. Return the maximum product found.
     */
    public static void main(String[] args) {
        int[] arr = { 2, 3, -2, 4 };
        int result = maxProduct(arr);
        System.out.println(result);
    }

    static int maxProduct(int[] nums) {
        double Prefix = 1; // Initialize prefix product to 1
        double Suffix = 1; // Initialize suffix product to 1
        int Product = Integer.MIN_VALUE; // Initialize maximum product to the smallest possible integer value
        int size = nums.length; // Get the size of the array

        // Iterate through the array from both ends simultaneously
        for (int i = 0; i < size; i++) {
            // Reset prefix and suffix products to 1 if they become zero
            if (Prefix == 0) {
                Prefix = 1;
            }
            if (Suffix == 0) {
                Suffix = 1;
            }
            // Update prefix product by multiplying with the current element from the start
            Prefix = Prefix * (double) nums[i];
            // Update suffix product by multiplying with the current element from the end
            Suffix = Suffix * (double) nums[size - i - 1];
            // Update maximum product with the maximum of the current prefix product, suffix
            // product, and previous maximum product
            Product = (int) Math.max(Product, Math.max(Prefix, Suffix));
        }
        return Product; // Return the maximum product found
    }
}
