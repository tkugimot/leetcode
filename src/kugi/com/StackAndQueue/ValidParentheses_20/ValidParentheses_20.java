package kugi.com.StackAndQueue.ValidParentheses_20;

import kugi.com.data.ListNode;

import java.util.Stack;

class ValidParentheses_20 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.isValid("(())");
        System.out.println(ans);
    }
}

class Solution {
    public static String left = "({[";
    public static String right = ")}]";
    public boolean isValid(String s) {
        if (s.isEmpty()) return true;
        if (s.length() <= 1) return false;
        String[] array = new String[s.length()];
        char[] charArray = s.toCharArray();
        for (int i=0; i<s.length(); i++) {
            array[i] = String.valueOf(charArray[i]);
        }

        Stack<String> stack = new Stack<>();
        for (int i=0; i<array.length; i++){
            String str = array[i];
            if (right.contains(str)) {
                if (stack.isEmpty()) return false;

                String popped = stack.pop();
                if(!isSame(popped, str)) return false;
            }
            if (left.contains(str)) {
                stack.push(str);
            }
        }

        return stack.isEmpty();
    }

    public boolean isSame(String l, String r) {
        if (l.equals("(") && r.equals(")")) return true;
        if (l.equals("{") && r.equals("}")) return true;
        if (l.equals("[") && r.equals("]")) return true;
        return false;
    }
}

