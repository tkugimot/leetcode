package kugi.com.LinkedList.ReverseList;

import kugi.com.data.ListNode;

public class ReverseList_206 {

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
        System.out.println(solution.reverseList(root));
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode reversed = null;
        ListNode dummy = head;

        while (dummy != null) {
            ListNode nextTemp = dummy.next;
            dummy.next = reversed;
            reversed =  dummy;
            dummy = nextTemp;
        }

        return reversed;
    }
}

