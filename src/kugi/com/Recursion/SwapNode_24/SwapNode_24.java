package kugi.com.Recursion.SwapNode_24;

import kugi.com.data.ListNode;

class SwapNodes_24 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode ans = solution.swapPairs(node1);
        while(ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second = head.next;
        ListNode third = head.next.next;

        second.next = first;
        first.next = swapPairs(third);

        return second;
    }
}
