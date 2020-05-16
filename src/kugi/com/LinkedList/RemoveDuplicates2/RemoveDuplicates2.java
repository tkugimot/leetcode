package kugi.com.LinkedList.RemoveDuplicates2;

import kugi.com.data.ListNode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates2 {

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        root.next = node1;
        node1.next = node2;

        Solution solution = new Solution();
        ListNode ans = solution.deleteDuplicates(root);

        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> notDistinct = new HashSet<>();
        ListNode current = head;
        ListNode current2 = head;
        ListNode current3 = head;

        while (current != null) {
            if (set.contains(current.val)) {
                notDistinct.add(current.val);
            }
            set.add(current.val);
            current = current.next;
        }

        while (current2 != null) {
            while (current3 != null) {
                if (!notDistinct.contains(current3.val)) {
                    break;
                } else {
                    current3 = current3.next;
                }
            }
            current2 = current3;
        }

        return head;
    }
}
