package kugi.com.BinarySearch.Sqrt_64;

public class Sqrt_64 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.mySqrt(15);
        System.out.println(ans);
    }
}

class Solution {
    public int mySqrt(int x) {
        if (x < 1) return 0;
        int left = 1;
        int right = x;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid * mid == x) return mid;

            if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left - 1;
    }
}
