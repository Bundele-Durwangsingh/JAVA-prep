package DSA.Hash;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        backtrack(nums, new ArrayList<>(), set, result);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> tempList, HashSet<List<Integer>> set, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            if (!set.contains(tempList)) {
                result.add(new ArrayList<>(tempList));
                set.add(new ArrayList<>(tempList));
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (tempList.contains(nums[i])) continue; 
                tempList.add(nums[i]);
                backtrack(nums, tempList, set, result);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
