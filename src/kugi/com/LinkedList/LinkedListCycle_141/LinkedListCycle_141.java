package kugi.com.LinkedList.LinkedListCycle_141;

import kugi.com.data.ListNode;

public class LinkedListCycle_141 {

    public static void main(String[] args) {
        ListNode root = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        Solution solution = new Solution();
        System.out.println(solution.hasCycle(root));
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return false;

        ListNode runner1 = head;
        ListNode runner2 = head;
        int count = 0;
        while (true) {
            if (runner1 == runner2 && count != 0) return true;
            if (runner2 == null || runner2.next == null) return false;
            runner1 = runner1.next;
            runner2 = runner2.next.next;
            count++;
        }
    }
}
