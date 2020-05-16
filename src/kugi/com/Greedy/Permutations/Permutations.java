package kugi.com.Greedy.Permutations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.permute(nums);
        System.out.println(ans);
    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        helper(nums, res, current, set);
        return res;
    }

    public void helper(int[] nums, List<List<Integer>> res, List<Integer> current, Set<Integer> set) {
        if (current.size() == nums.length) {
            System.out.println(current);
            res.add(new ArrayList<>(current));
        } else {
            for (int i: nums) {
                if (!set.contains(i)) {
                    current.add(i);
                    set.add(i);
                    helper(nums, res, current, set);
                    current.remove(current.size()-1);
                    set.remove(i);
                }
            }
        }
    }
}
