package DSA.LeetCode;

public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int target = 9;
        System.out.println(search(arr, target));
    }
    static int search(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
