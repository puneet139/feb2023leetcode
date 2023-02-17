package com.leetcode.feb2023;

import java.util.ArrayList;
import java.util.List;

public class MinDistanceBetweenNodes {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int v){
            val = v;
            left = right = null;
        }

        TreeNode(int v,TreeNode l,TreeNode r){
            val = v;
            left = l;
            right = r;
        }
    }

    public int minDiffInBST(TreeNode root) {
        List<Integer> treeNodeList = new ArrayList<>();
        inOrderRec(root,treeNodeList);
        int minDiff = Integer.MAX_VALUE;
        for(int j=1;j<treeNodeList.size();j++){
            minDiff = Math.min(minDiff, treeNodeList.get(j)-treeNodeList.get(j-1));
        }
        return minDiff;
    }

    private void inOrderRec(TreeNode root,List<Integer> treeNodeList){
        if(root==null){
            return;
        }
        inOrderRec(root.left,treeNodeList);
        treeNodeList.add(root.val);
        inOrderRec(root.right,treeNodeList);
    }
}
