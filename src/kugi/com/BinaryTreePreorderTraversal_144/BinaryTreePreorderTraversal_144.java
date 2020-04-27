package kugi.com.BinaryTreePreorderTraversal_144;

import kugi.com.data.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal_144 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = null;
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        Solution solution = new Solution();
        root.left = t1;
        root.right = t2;
        root.right.left = t3;
        List<Integer> ans = solution.preorderTraversal2(root);
    }
}

class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return list;

        list.add(root.val);

        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return list;
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        TreeNode curr = root;
        while (!stack.isEmpty()) {
            if (curr != null) {
                System.out.println(curr.val);
                result.add(curr.val);
                stack.push(curr.right);
                stack.push(curr.left);
            }
            curr = stack.pop();
        }
        return result;
    }
}
