package kugi.com.HashTable.IntersectionOfTwoArrays_349;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays_349 {
    public static void main(String args) {
        // nums1 = [1,2,2,1], nums2 = [2,2]
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        Solution solution = new Solution();
        int[] ans = solution.intersection(nums1, nums2);

        for (int i: ans) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i: nums1) {
            set1.add(i);
        }

        for (int i: nums2) {
            set2.add(i);
        }

        set1.retainAll(set2);

        int[] ans = new int[set1.size()];
        int index = 0;
        for (int i: set1) {
            ans[index] = i;
            index++;
        }
        return ans;
    }
}
