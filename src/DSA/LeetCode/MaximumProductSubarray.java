package DSA.LeetCode;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        int result=maxProduct(arr);
        System.out.println(result);
    }
    static int maxProduct(int[] nums) {
        double Prefix=1;
        double Suffix=1;
        int Product=Integer.MIN_VALUE;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (Prefix==0) {
                Prefix=1;
            }
            if (Suffix==0) {
                Suffix=1;
            }
            Prefix=Prefix*(double)nums[i];
            Suffix=Suffix*(double)nums[size-i-1];
            Product=(int)Math.max(Product, Math.max(Prefix, Suffix));
        }
        return Product;
    }
}
