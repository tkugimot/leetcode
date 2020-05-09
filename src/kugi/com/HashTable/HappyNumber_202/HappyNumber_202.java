package kugi.com.HashTable.HappyNumber_202;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isHappy(19));
    }
}

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            char[] s = String.valueOf(n).toCharArray();
            int sum = 0;
            for (char c : s) {
                int eachVal = Character.getNumericValue(c);
                int doubled = eachVal * eachVal;
                sum += doubled;
            }
            if (sum == 1) return true;
            if (set.contains(sum)) return false;

            set.add(sum);
            n = sum;
        }
    }
}
