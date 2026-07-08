package com.wwj.lianxi.algorithm.tree;

public class PreorderTraversal {
    /**
     * <----------------前序遍历，迭代实现------------------>
     * private List<Integer> preorderTraversal(TreeNode root) {
     *         Stack<TreeNode> stack = new Stack<>();
     *         List<Integer> result = new ArrayList<>();
     *         if (root == null) return result;
     *         stack.push(root);
     *         while (!stack.isEmpty()) {
     *         //前序先访问根元素
     *             TreeNode current = stack.pop();
     *             result.add(current.val);
     *             if (current.right != null) {
     *                 stack.push(current.right);
     *             }
     *             if (current.left != null) {
     *                 stack.push(current.left);
     *             }
     *         }
     *         return result;
     *     }
     *<----------------前序遍历，递归实现------------------>
     *public static List<Integer> preorderTraversal2(TreeNode root) {
     *               List<Integer> result = new ArrayList<>();
     *               preorderHelper(root, result);
     *               return result;
     *           }
     *
     *                  private static void preorderHelper(TreeNode root, List<Integer> result) {
     *               if (root == null) return;
     *
     *               result.add(root.val);
     *               preorderHelper(root.left, result);
     *               preorderHelper(root.right, result);
     *           }
     */
}
