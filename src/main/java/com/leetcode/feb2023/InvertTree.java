package com.leetcode.feb2023;

public class InvertTree {

    static  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return root;
        }
        invertTreeRec(root);
        return root;
    }

    private TreeNode invertTreeRec(TreeNode root){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return root;
        }
        TreeNode l = root.left;
        root.left = invertTreeRec(root.right);
        root.right = invertTreeRec(l);
        return root;
    }


}
