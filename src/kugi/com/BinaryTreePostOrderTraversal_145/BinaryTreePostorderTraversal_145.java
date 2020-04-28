package kugi.com.BinaryTreePostOrderTraversal_145;

import kugi.com.data.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal_145 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = null;
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        Solution solution = new Solution();
        root.left = t1;
        root.right = t2;
        root.right.left = t3;
        List<Integer> ans = solution.postorderTraversal2(root);
        System.out.println(ans);
    }
}

class Solution {
    private List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return list;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.val);
        return list;
    }

    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) return result;

        TreeNode current = root;
        TreeNode pre = null;
        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.peek();

            if (current.right == null || current.right == pre) {
                stack.pop();
                result.add(current.val);
                pre = current;
                current = null;
            } else {
                current = current.right;
            }
        }

        return result;
    }
}
