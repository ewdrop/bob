package com.wwj.lianxi.algorithm.tree;

public class isValidBST {
    /**
     * // 有效的 BST
     *         TreeNode root1 = new TreeNode(2);
     *         root1.left = new TreeNode(1);
     *         root1.right = new TreeNode(3);
     *         System.out.println("树1: " + isValidBST2(root1));   // true
     *
     *         // 无效的 BST
     *         TreeNode root2 = new TreeNode(5);
     *         root2.left = new TreeNode(1);
     *         root2.right = new TreeNode(4);
     *         root2.right.left = new TreeNode(3);
     *         root2.right.right = new TreeNode(6);
     *         System.out.println("树2: " + isValidBST2(root2));   // false
     *         <----------------二叉搜索树，递归实现------------------>
     *             public static boolean isValidBST(TreeNode root) {
     *         return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
     *     }
     *
     *     private static boolean isValid(TreeNode root, long min, long max) {
     *         if (root == null) return true;
     *         if (root.val <= min || root.val >= max) {
     *             return false;
     *         }
     *         return isValid(root.left, min, root.val) &&
     *                 isValid(root.right, root.val, max);
     *     }
     *         <----------------二叉搜索树，迭代实现------------------>
     *             public static boolean isValidBST2(TreeNode root) {
     *         if (root == null) return true;
     *         Stack<TreeNode> stack = new Stack<>();
     *         TreeNode current = root;
     *         long prev = Long.MIN_VALUE;
     *         while (current != null || !stack.isEmpty()) {
     *             while (current != null) {
     *                 //一直往左获取左子节点所有元素
     *                 stack.push(current);
     *                 current = current.left;
     *             }
     *             current = stack.pop();
     *             if (current.val <= prev) {
     *                 return false;
     *             }
     *             prev = current.val;
     *             //转向右子树
     *             current = current.right;
     *         }
     *         return true;
     *     }
     */
}
