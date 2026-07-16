package com.wwj.lianxi.algorithm.tree;

public class MaxPathSum {
    /**
     *          private  int maxSum = Integer.MIN_VALUE;
     *
     *         TreeNode root = new TreeNode(1);
     *         root.left = new TreeNode(2);
     *         root.right = new TreeNode(3);
     *         System.out.println(new App().maxPathSum(root)); // 6
     *
     *         public  int maxPathSum(TreeNode root) {
     *         maxGain(root);
     *         return maxSum;
     *     }
     *      <----------------最大路径和，递归实现---------->
     *     private int maxGain(TreeNode root) {
     *         if (root == null) return 0;
     *         int leftGain = Math.max(maxGain(root.left), 0);
     *         int rightGain = Math.max(maxGain(root.right), 0);
     *         int priceNewPath = root.val + leftGain + rightGain;
     *         maxSum = Math.max(maxSum, priceNewPath);
     *         return root.val + Math.max(leftGain, rightGain);
     */
}
