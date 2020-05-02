package kugi.com.LinkedList.RemoveNthNode_19;

import kugi.com.data.ListNode;

public class RemoveNthNode_19 {

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

        Solution solution = new Solution();
        System.out.println(solution.removeNthFromEnd(root, 2));
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode first = head;
        int length = 0;
        while (first != null) {
            length++;
            first = first.next;
        }

        int target = length - n;
        first = dummy;

        while (target > 0) {
            first = first.next;
            target--;
        }

        first.next = first.next.next;

        return dummy.next;
    }
}
