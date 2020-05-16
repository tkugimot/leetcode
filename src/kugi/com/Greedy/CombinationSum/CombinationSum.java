package kugi.com.Greedy.CombinationSum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5};
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.combinationSum(nums, 8);
        System.out.println(ans);
    }
}

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(candidates, ans, current, target, 0, 0);
        return ans;
    }

    public void helper(int[] candidates, List<List<Integer>> ans, List<Integer> current, int target, int sum, int index) {
        if (sum > target) return;

        if (sum == target) {
            ans.add(new ArrayList<>(current));
        } else {
            for (int i=index; i<candidates.length; i++) {
                if ((sum + candidates[i]) <= target) {
                    List<Integer> newList = new ArrayList<>(current);
                    newList.add(candidates[i]);
                    helper(candidates, ans, newList, target, sum + candidates[i], i);
                }
            }
        }
    }
}
