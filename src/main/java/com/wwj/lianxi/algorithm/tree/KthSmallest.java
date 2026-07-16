package com.wwj.lianxi.algorithm.tree;

public class KthSmallest {
    /**
     *         private int count = 0;
     *         private int result = 0;
     *
     *         TreeNode root = new TreeNode(3);
     *         root.left = new TreeNode(1);
     *         root.left.right = new TreeNode(2);
     *         root.right = new TreeNode(4);
     *         App app = new App();
     *         System.out.println(app.kthSmallest(root, 1)); // 1
     *         System.out.println(app.kthSmallest(root, 3));
     *         <----------------二叉树第k小元素，递归实现---------->
     *         public int kthSmallest(TreeNode root, int k) {
     *         count = 0;
     *         result = 0;
     *         inoder(root, k);
     *         return result;
     *     }
     *
     *     private void inoder(TreeNode root, int k) {
     *         if (root == null) return;
     *         inoder(root.left, k);
     *         count++;
     *         if (count == k) {
     *             result = root.val;
     *             return;
     *         }
     *         inoder(root.right, k);
     *     }
     */
}
