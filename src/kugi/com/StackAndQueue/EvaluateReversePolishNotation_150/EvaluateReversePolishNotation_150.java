package kugi.com.StackAndQueue.EvaluateReversePolishNotation_150;

import java.util.Stack;

class EvaluateReversePolishNotation_150 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] str = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int ans = solution.evalRPN(str);
        System.out.println(ans);
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s: tokens) {
            switch (s) {
                case "+":
                    int second = stack.pop();
                    int first = (stack.pop());
                    int each = first + second;
                    stack.push(each);
                    break;
                case "-":
                    second = (stack.pop());
                    first = (stack.pop());
                    each = first - second;
                    stack.push(each);
                    break;
                case "*":
                    second = (stack.pop());
                    first = (stack.pop());
                    each = first * second;
                    stack.push(each);
                    break;
                case "/":
                    second = (stack.pop());
                    first = (stack.pop());
                    each = first / second;
                    stack.push(each);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }

        return stack.pop();
    }
}
