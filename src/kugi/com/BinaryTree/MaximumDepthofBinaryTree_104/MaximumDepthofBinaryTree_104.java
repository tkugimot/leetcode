package kugi.com.BinaryTree.MaximumDepthofBinaryTree_104;

import kugi.com.data.TreeNode;

public class MaximumDepthofBinaryTree_104 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode t1 = new TreeNode(9);
        TreeNode t2 = new TreeNode(20);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(7);
        root.left = t1;
        root.right = t2;
        t2.left = t3;
        t2.right = t4;
        Solution solution = new Solution();
        root.left = t1;
        root.right = t2;
        root.right.left = t3;
        int ans = solution.maxDepth(root);
        System.out.println(ans);
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
