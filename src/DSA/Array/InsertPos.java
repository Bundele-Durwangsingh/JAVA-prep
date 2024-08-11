package DSA.Array;

public class InsertPos {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=5;
        System.out.println(insert(arr, target));
    }
    static int insert(int[] nums, int target){

        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
}
