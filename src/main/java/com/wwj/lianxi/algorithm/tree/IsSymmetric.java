package com.wwj.lianxi.algorithm.tree;

public class IsSymmetric {
    /**
     * // 对称的树
     *         TreeNode root1 = new TreeNode(1);
     *         root1.left = new TreeNode(2);
     *         root1.right = new TreeNode(2);
     *         root1.left.left = new TreeNode(3);
     *         root1.left.right = new TreeNode(4);
     *         root1.right.left = new TreeNode(4);
     *         root1.right.right = new TreeNode(3);
     *
     *         System.out.println("树1 是否对称: " + isSymmetric2(root1)); // true
     *
     *         // 不对称的树
     *         TreeNode root2 = new TreeNode(1);
     *         root2.left = new TreeNode(2);
     *         root2.right = new TreeNode(2);
     *         root2.left.right = new TreeNode(3);
     *         root2.right.right = new TreeNode(3);
     *
     *         System.out.println("树2 是否对称: " + isSymmetric2(root2)); // false
     *
     *         <----------------对称二叉树，递归实现------------------>
     *             public static boolean isSymmetric(TreeNode root) {
     *         if (root == null) return true;
     *         return isMirror(root.left, root.right);
     *     }
     *
     *     private static boolean isMirror(TreeNode left, TreeNode right) {
     *         if(left == null && right == null) return true;
     *         if(left == null || right == null) return false;
     *         return left.val == right.val &&
     *                 isMirror(left.left, right.right) &&
     *                 isMirror(left.right, right.left);
     *     }
     *         <----------------对称二叉树，迭代实现------------------>
     *             public static boolean isSymmetric2(TreeNode root) {
     *         if (root == null) return true;
     *         Queue<TreeNode> queue = new LinkedList<>();
     *         queue.offer(root.left);
     *         queue.offer(root.right);
     *         while (!queue.isEmpty()) {
     *             TreeNode left = queue.poll();
     *             TreeNode right = queue.poll();
     *             if (left == null && right == null) continue;
     *             if (left == null || right == null) return false;
     *             if (left.val != right.val) return false;
     *
     *             queue.offer(left.left);
     *             queue.offer(right.right);
     *             queue.offer(left.right);
     *             queue.offer(right.left);
     *         }
     *         return true;
     *     }
     */
}
