package kugi.com.BinarySearch.GuessNumberHigherLower_374;

public class GuessNumberHigherLower_374 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.guessNumber(10);
        System.out.println(ans);
    }
}

class Solution {
    int guess(int num) {
        if (num == 6) return 0;
        if (num > 6) return -1;
        return 1;
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (guess(mid) == 0) return mid;
            else if (guess(mid) == 1) left = mid + 1;
            else right = mid;
        }

        return left;
    }
}
