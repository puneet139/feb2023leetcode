package com.leetcode.feb2023;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZag {

    public static class TreeNode {
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root==null){
            return answer;
        }

        boolean order = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int size = 1;
        while(!q.isEmpty()){
            List<Integer> nodeList = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode n = q.poll();
                if(order){
                    nodeList.add(n.val);
                }else{
                    nodeList.add(0,n.val);
                }
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            size = q.size();
            order = !order;
            answer.add(new ArrayList<>(nodeList));
        }
        return answer;
    }
}
