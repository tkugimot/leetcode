package kugi.com.StackAndQueue.DailyTemperature_739;

import java.util.Stack;

class DailyTemperature_739 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[8];
        array[0] = 73;
        array[1] = 74;
        array[2] = 75;
        array[3] = 71;
        array[4] = 69;
        array[5] = 72;
        array[6] = 76;
        array[7] = 73;
        System.out.println(array);

        int[] ans = solution.dailyTemperatures(array);
        for (int i: ans) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[T.length];
        for (int i=T.length-1; i>=0; i--) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) ans[i] = 0;
            else ans[i] = stack.peek() - i;

            stack.push(i);
        }
        return ans;
    }
}

