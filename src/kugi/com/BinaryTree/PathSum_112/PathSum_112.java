package kugi.com.BinaryTree.PathSum_112;

import kugi.com.data.TreeNode;

public class PathSum_112 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        root.left = t1;
        Solution solution = new Solution();
        root.left = t1;
        boolean ans = solution.hasPathSum(root, 1);
        System.out.println(ans);
    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            if (root.val == sum) return true;
        }

        return hasPathSum(root.left, sum - root.val)
                || hasPathSum(root.right, sum - root.val);
    }
}
