package DSA.LeetCode;



public class TwoSum {
    public static void main(String[] args) {
        int nums []= {3,2,4};
        int target = 6;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i]+nums[j];
                if (sum == target) {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}
