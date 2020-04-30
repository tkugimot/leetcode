package kugi.com.ArrayAndStrings.LargestNumberAtleastTwice_747;

public class LargestNumberAtleastTwice_747 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int ans = solution.dominantIndex(nums);
        System.out.println(ans);
    }
}

class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        int max = 0;
        for (int i=0; i<nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int i=0; i<nums.length; i++) {
            if (i == maxIndex) continue;

            if (max < 2*nums[i]) return -1;
        }

        return maxIndex;
    }
}
