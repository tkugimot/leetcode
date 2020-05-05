package kugi.com.Others.Combinations_77;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Combinations_77 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.combine(4, 2);
    }


}

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();

        dfs(n, k, tmp, res, 1);
        System.out.println(res);
        return res;
    }

    void dfs(int n, int c, List<Integer> tmp, List<List<Integer>> res, int start) {
        if (tmp.size() == c) {
            res.add(tmp);
            return;
        }

        for (int i=start; i<=n; i++) {
            List<Integer> newTmp = new ArrayList<>(tmp);
            newTmp.add(i);
            dfs(n, c, newTmp, res, i+1);
        }
    }
}
