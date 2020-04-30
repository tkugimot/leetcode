package kugi.com.ArrayAndStrings.FindPivot_724.BinarySearch_704;

public class FindPivot_724 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1,-1,0,1,1,0};
        int ans = solution.pivotIndex(nums);
        System.out.println(ans);
    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        int allSum = 0;
        for (int num: nums) {
            allSum += num;
        }

        int left = 0;
        for (int i=0; i<nums.length; i++) {
            if (i != 0) left += nums[i-1];
            int right = allSum - left - nums[i];
            if (i == nums.length-1) right = 0;

            if (left == right) return i;
        }

        return -1;
    }
}
