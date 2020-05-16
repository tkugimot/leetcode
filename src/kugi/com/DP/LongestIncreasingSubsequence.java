package kugi.com.DP;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] nums = {-2,-1};
        Solution solution = new Solution();
        int ans = solution.lengthOfLIS(nums);
        System.out.println(ans);
    }
}

class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;

        int[] dp = new int[nums.length];
        dp[0] = 1;

        int max = 1;
        for (int i=1; i<nums.length; i++) {
            int eachMax = 0;
            for (int j=0; j<i; j++) {
                if (nums[i] > nums[j]) {
                    eachMax = Math.max(eachMax, dp[j]);
                }
            }
            dp[i] = 1 + eachMax;
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
