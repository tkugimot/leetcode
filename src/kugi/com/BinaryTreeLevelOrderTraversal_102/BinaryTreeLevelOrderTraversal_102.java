package kugi.com.BinaryTreeLevelOrderTraversal_102;

import kugi.com.data.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal_102 {
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
        List<List<Integer>> ans = solution.levelOrder(root);
        System.out.println(ans);
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<List<TreeNode>> queue = new LinkedList<>();
        List<TreeNode> first = new ArrayList<>();
        first.add(root);
        queue.add(first);
        while(!queue.isEmpty()) {
            List<Integer> eachList = new ArrayList<>();
            List<TreeNode> nodeList = queue.poll();

            List<TreeNode> newNodeList = new ArrayList<>();
            for (TreeNode each: nodeList) {
                eachList.add(each.val);
                if (each.left != null) newNodeList.add(each.left);
                if (each.right != null) newNodeList.add(each.right);
            }

            if (!newNodeList.isEmpty()) queue.add(newNodeList);
            result.add(eachList);
        }
        return result;
    }
}
