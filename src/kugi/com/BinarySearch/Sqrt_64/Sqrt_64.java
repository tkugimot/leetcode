package kugi.com.BinarySearch.Sqrt_64;

public class Sqrt_64 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.mySqrt(2147395599);
        System.out.println(ans);
    }
}

class Solution {
    public int mySqrt(int x) {
        if (x < 1) return 0;
        if (x == 1) return 1;
        long left = 1;
        long right = x;

        while (left < right) {
            long mid = left + (right - left) / 2;

            if (mid * mid == x) return (int)mid;

            if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return (int)left - 1;
    }
}
