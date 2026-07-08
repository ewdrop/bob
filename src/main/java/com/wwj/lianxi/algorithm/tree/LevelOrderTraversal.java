package com.wwj.lianxi.algorithm.tree;

public class LevelOrderTraversal {
    /**
     * //用到的TreeNode为新声明的静态内部类
     * TreeNode root = new TreeNode(9);
     *         root.left = new TreeNode(5);
     *         root.left.left = new TreeNode(1);
     *         root.left.right = new TreeNode(2);
     *         root.right = new TreeNode(7);
     *         root.right.left = new TreeNode(3);
     *         root.right.right = new TreeNode(4);
     *         List<List<Integer>> result = levelOrderTraversal(root);
     *         System.out.println(result);
     * public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
     *         List<List<Integer>> result = new ArrayList<>();
     *         if (root == null) return result;
     *         Queue<TreeNode> queue = new LinkedList<>();
     *         queue.offer(root);
     *         while (!queue.isEmpty()) {
     *             int size = queue.size();
     *             List<Integer> level = new ArrayList<>();
     *             for (int i = 0; i < size; i++) {
     *                 TreeNode node = queue.poll();
     *                 level.add(node.value);
     *                 if (node.left != null) queue.offer(node.left);
     *                 if (node.right != null) queue.offer(node.right);
     *             }
     *             result.add(level);
     *         }
     *         return result;
     *     }
     */
}
