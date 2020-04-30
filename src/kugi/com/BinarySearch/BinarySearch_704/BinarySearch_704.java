package kugi.com.BinarySearch.BinarySearch_704;

import kugi.com.data.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BinarySearch_704 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        int ans = solution.search(nums, target);
        System.out.println(ans);
    }
}

class Solution {
    public int search(int[] nums, int target) {
        return lowerBounds(nums, target);
    }

    /**
     * return the first index the target value exists
     */
    public int lowerBounds(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        if (nums[left] == target) return left;
        else return -1;
    }
}
