package com.wwj.lianxi.algorithm.tree;

public class Flatten {
    /**
     *         TreeNode root = new TreeNode(1);
     *         root.left = new TreeNode(2);
     *         root.right = new TreeNode(5);
     *         root.left.left = new TreeNode(3);
     *         root.left.right = new TreeNode(4);
     *         root.right.right = new TreeNode(6);
     *
     *         flatten(root);
     *
     *         // 打印展开后的链表
     *         TreeNode current = root;
     *         while (current != null) {
     *             System.out.print(current.val + " -> ");
     *             current = current.right;
     *         }
     *         System.out.println("null");
     *         <--------------------递归解法，二叉树展开为链表---------------------->
     *         private static void flatten(TreeNode root) {
     *         if (root == null) return;
     *         flatten(root.left);
     *         flatten(root.right);
     *         TreeNode temp = root.right;//先把右子节点保存
     *         root.right = root.left;
     *         root.left = null;//左子节点置空
     *         TreeNode current = root;
     *         while (current.right != null) {
     *             current = current.right;
     *         }
     *         current.right = temp;//把右子树接到后边
     *     }
     */
}
