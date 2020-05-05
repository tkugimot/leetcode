package kugi.com.Recursion.ReverseString_344;

import java.util.ArrayList;
import java.util.List;

class ReverseString_344 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = "hello".toCharArray();
        solution.reverseString(s);
    }
}

class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length == 0) return;
        helper(0, s);
    }

    public void helper(int index, char[] s) {
        if (index == s.length / 2) return;

        char tmp = s[index];
        s[index] = s[s.length - 1 - index];
        s[s.length - 1 - index] = tmp;
        helper(index + 1, s);
    }
}
