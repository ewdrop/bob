package com.wwj.lianxi;

/**
 * Hello world!
 *
 */

import java.sql.*;
import java.util.*;

public class App {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(3);

        App test = new App();

        System.out.println("前序遍历: " + test.inorderTraversal(root));

    }



}