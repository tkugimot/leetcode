package kugi.com.LinkedList.LinkedListCycle2_142.LinkedListCycle_141;

import kugi.com.data.ListNode;

public class LinkedListCycle2_142 {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        Solution solution = new Solution();
        System.out.println(solution.detectCycle(root).val);
    }
}

class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        int count = 0;

        while (true) {
            if (fast.next == null || fast.next.next == null) return null;
            if (slow == fast && count != 0) break;
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }

        while (head != slow) {
            System.out.println("head: " + head.val + " slow: " + slow.val);
            head = head.next;
            slow = slow.next;
        }
        return slow;
    }
}
