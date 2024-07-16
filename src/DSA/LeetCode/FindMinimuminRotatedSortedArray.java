package DSA.LeetCode;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        int answer = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < answer) {
                answer = nums[i];
            }
        }
        return answer;
    }
}
