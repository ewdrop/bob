package com.wwj.lianxi;

/**
 * Hello world!
 *
 */

import java.sql.*;
import java.util.*;

public class App {

    private  int maxSum = Integer.MIN_VALUE;
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(new App().maxPathSum(root)); // 6

    }

    public  int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    private int maxGain(TreeNode root) {
        if (root == null) return 0;
        int leftGain = Math.max(maxGain(root.left), 0);
        int rightGain = Math.max(maxGain(root.right), 0);
        int priceNewPath = root.val + leftGain + rightGain;
        maxSum = Math.max(maxSum, priceNewPath);
        return root.val + Math.max(leftGain, rightGain);
    }


}