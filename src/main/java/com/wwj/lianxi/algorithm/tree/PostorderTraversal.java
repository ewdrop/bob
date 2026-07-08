package com.wwj.lianxi.algorithm.tree;

public class PostorderTraversal {
    /**
     * <----------------后序遍历，迭代实现------------------>
     * public List<Integer> postorderTraversal(TreeNode root) {
     *         List<Integer> result = new ArrayList<>();
     *         if (root == null) return result;
     *         Stack<TreeNode> stack = new Stack<>();
     *         //输出栈，用以实现左右根的顺序
     *         Stack<TreeNode> output = new Stack<>();
     *         stack.push(root);
     *         while (!stack.isEmpty()) {
     *             TreeNode current = stack.pop();
     *             //后续遍历左右根，根在输出栈最底部最后出
     *             output.push(current);
     *             //右边元素出栈顺序为第二位，栈的特性后进先出，所以要在比第一位的左元素先入栈
     *             if (current.right != null) {
     *                 output.push(current.right);
     *             }
     *             if (current.left != null) {
     *                 output.push(current.left);
     *             }
     *         }
     *         while (!output.isEmpty()) {
     *             result.add(output.pop().val);
     *         }
     *         return result;
     *     }
     *
     * <----------------后序遍历，递归实现------------------>
     *     public static List<Integer> postorderTraversal2(TreeNode root) {
     *         List<Integer> result = new ArrayList<>();
     *         postorderHelper(root, result);
     *         return result;
     *     }
     *
     *     private static void postorderHelper(TreeNode root, List<Integer> result) {
     *         if (root == null) return;
     *         //按照元素访问顺序调用
     *         postorderHelper(root.left, result);
     *         postorderHelper(root.right, result);
     *         result.add(root.val);
     *     }
     */
}
