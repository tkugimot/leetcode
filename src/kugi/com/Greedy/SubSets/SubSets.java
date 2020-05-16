package kugi.com.Greedy.SubSets;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.subsets(nums);
        System.out.println(ans);
    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        helper(nums, ans, current, 0);
        return ans;
    }

    public void helper(int[] nums, List<List<Integer>> ans, List<Integer> current, int index) {
        ans.add(new ArrayList<>(current));

        for (int i=index; i<nums.length; i++) {
            List<Integer> newCurrent = new ArrayList<>(current);
            newCurrent.add(nums[i]);
            helper(nums, ans, newCurrent, i+1);
        }
    }
}
