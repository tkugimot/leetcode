package kugi.com.SymmetricTree_101;

import kugi.com.data.TreeNode;

public class SymmetricTree_101 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(3);
        TreeNode t6 = new TreeNode(4);
        root.left = t1;
        root.right = t2;
        Solution solution = new Solution();
        boolean ans = solution.isSymmetric(root);
        System.out.println(ans);
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return isMirror(root.left, root.right);
    }

    boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        return (left.val == right.val)
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
}
