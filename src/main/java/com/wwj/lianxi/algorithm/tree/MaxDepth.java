package com.wwj.lianxi.algorithm.tree;

public class MaxDepth {
    /**
     * TreeNode root = new TreeNode(3);
     *         root.left = new TreeNode(9);
     *         root.right = new TreeNode(20);
     *         root.right.left = new TreeNode(15);
     *         root.right.right = new TreeNode(7);
     *
     *         System.out.println("最大深度: " + maxDepth2(root));   // 应该输出 3
     *         <----------------二叉树最大深度，递归实现------------------>
     *         public static int maxDepth(TreeNode root) {
     *         if (root == null) return 0;
     *         int leftDepth = maxDepth(root.left);
     *         int rightDepth = maxDepth(root.right);
     *         return Math.max(leftDepth, rightDepth) + 1;
     *     }
     *         <----------------二叉树最大深度，迭代实现------------------>
     *         private static int maxDepth2(TreeNode root) {
     *         //层序遍历不保存元素
     *         if (root == null) return 0;
     *         Queue<TreeNode> queue = new LinkedList<>();
     *         queue.offer(root);
     *         int depth = 0;
     *         while (!queue.isEmpty()) {
     *             int size = queue.size();
     *             depth++;
     *             for (int i = 0; i < size; i++) {
     *                 TreeNode node = queue.poll();
     *                 if (node.left != null) queue.offer(node.left);
     *                 if (node.right != null) queue.offer(node.right);
     *             }
     *         }
     *         return depth;
     *     }
     */
}
