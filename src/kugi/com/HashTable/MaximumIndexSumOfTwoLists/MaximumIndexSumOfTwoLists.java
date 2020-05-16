package kugi.com.HashTable.MaximumIndexSumOfTwoLists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] s = {"k","KFC"};
        String[] t = {"k","KFC"};

        Solution solution = new Solution();

        String[] ans = solution.findRestaurant(s, t);
        for (String str: ans) {
            System.out.println(str);
        }
    }
}

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i=0; i<list1.length; i++) map1.put(list1[i], i);
        for (int i=0; i<list2.length; i++) map2.put(list2[i], i);

        int min = list1.length + list2.length;
        List<String> array = new ArrayList<>();
        for (String s: map1.keySet()) {
            if (map2.containsKey(s)) {
                int indexSum = map1.get(s) + map2.get(s);

                if (indexSum <= min) {
                    min = indexSum;
                }
            }
        }

        for (String s: map1.keySet()) {
            if (map2.containsKey(s)) {
                int indexSum = map1.get(s) + map2.get(s);
                if (indexSum == min) {
                    array.add(s);
                }
            }
        }

        String[] ans = new String[array.size()];
        for (int i=0; i<array.size(); i++) {
            ans[i] = array.get(i);
        }

        return ans;
    }
}
