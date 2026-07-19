package com.wwj.lianxi.algorithm.tree;

public class InvertTree {
    /**
     *         TreeNode root = new TreeNode(4);
     *         root.left = new TreeNode(2);
     *         root.right = new TreeNode(7);
     *         root.left.left = new TreeNode(1);
     *         root.left.right = new TreeNode(3);
     *         root.right.left = new TreeNode(6);
     *         root.right.right = new TreeNode(9);
     *
     *         TreeNode newRoot = invertTree(root);
     *
     *         // 打印前序遍历检查
     *         printPreorder(newRoot);
     *
     *         <---------------------反转二叉树，递归----------------->
     *             private static void printPreorder(TreeNode newRoot) {
     *         if (newRoot == null) return;
     *         System.out.println(newRoot.val + "");
     *         printPreorder(newRoot.left);
     *         printPreorder(newRoot.right);
     *     }
     *
     *     private static TreeNode invertTree(TreeNode root) {
     *         if (root == null) return null;
     *         TreeNode left = invertTree(root.left);
     *         TreeNode right = invertTree(root.right);
     *         root.left = right;
     *         root.right = left;
     *         return root;
     *     }
     */
}
