package kugi.com.HashTable.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution s = new Solution();

        int[] ans = s.twoSum(nums, target);

        for (int i: ans) System.out.println(i);
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
           map.put(target - nums[i], i);
        }

        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) != i) {
                return new int[]{map.get(nums[i]), i};
            }
        }

        return nums;
    }
}
