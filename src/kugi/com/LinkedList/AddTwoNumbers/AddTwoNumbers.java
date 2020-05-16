package kugi.com.LinkedList.AddTwoNumbers;

import kugi.com.data.ListNode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode root = new ListNode(5);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);

        root.next = node1;
        node1.next = node2;

        ListNode root2 = new ListNode(0);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(4);

        root2.next = node3;
        node3.next = node4;

        Solution solution = new Solution();
        ListNode ans = solution.addTwoNumbers(root, root2);

        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return null;

        ListNode ans = new ListNode(-1);
        ListNode current = ans;

        int nextRest = 0;
        int rest = 0;
        while(l1 != null || l2 != null) {
            int eachSum = 0;
            if (l1 != null)  eachSum += l1.val;
            if (l2 != null)  eachSum += l2.val;
            rest = nextRest;

            if ((eachSum + rest) >= 10) {
                nextRest = (eachSum + rest) / 10;
                eachSum = (eachSum + rest) % 10;
                rest = 0;
            } else {
                nextRest = 0;
            }

            current.next = new ListNode(eachSum + rest);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (nextRest != 0) current.next = new ListNode(nextRest);


        return ans.next;
    }
}
