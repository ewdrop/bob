package com.wwj.lianxi.algorithm.tree;

public class InorderTraversal {
    /**
     *     <----------------中序遍历，迭代实现------------------>
     *     public static List<Integer> inorderTraversal(TreeNode root) {
     *         List<Integer> result = new ArrayList<>();
     *         Stack<TreeNode> stack = new Stack<>();
     *         TreeNode current = root;
     *         while (current != null || !stack.isEmpty()) {
     *             while (current != null) {
     *                 stack.push(current);
     *                 current = current.left;
     *             }
     *             current = stack.pop();
     *             result.add(current.val);
     *
     *             current = current.right;
     *         }
     *         return result;
     *     }
     *      <----------------中序遍历，递归实现------------------>
     *     public static List<Integer> inorderTraversal2(TreeNode root) {
     *         List<Integer> result = new ArrayList<>();
     *         inorderHelper(root, result);
     *         return result;
     *     }
     *
     *     private static void inorderHelper(TreeNode root, List<Integer> result) {
     *         if (root == null) {
     *             return;
     *         }
     *         inorderHelper(root.left, result);
     *         result.add(root.val);
     *         inorderHelper(root.right, result);
     *     }
     */
}
