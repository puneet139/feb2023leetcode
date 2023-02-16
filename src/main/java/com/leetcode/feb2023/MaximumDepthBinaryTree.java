package com.leetcode.feb2023;

public class MaximumDepthBinaryTree
{

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){

        }

        TreeNode(int value){
            val = value;
            left = right = null;
        }

        TreeNode(int value, TreeNode l, TreeNode r){
            val = value;
            left = l;
            right = r;
        }
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        int d = 1 + Math.max(l,r);
        return d;
    }
}
