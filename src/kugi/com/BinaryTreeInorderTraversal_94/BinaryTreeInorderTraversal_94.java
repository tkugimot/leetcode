package kugi.com.BinaryTreeInorderTraversal_94;

import kugi.com.data.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal_94 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = null;
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        Solution solution = new Solution();
        root.left = t1;
        root.right = t2;
        root.right.left = t3;
        List<Integer> ans = solution.inorderTraversal2(root);
    }
}

class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return list;

        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);

        return list;
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.println(current.val);
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}
