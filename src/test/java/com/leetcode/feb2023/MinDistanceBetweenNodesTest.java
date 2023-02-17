package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinDistanceBetweenNodesTest {

    MinDistanceBetweenNodes minDistanceBetweenNodes;

    @Before
    public void setUp(){
        minDistanceBetweenNodes = new MinDistanceBetweenNodes();
    }

    @After
    public void tearDown(){
        minDistanceBetweenNodes = null;
    }

    @Test
    public void test1(){
        MinDistanceBetweenNodes.TreeNode root = new MinDistanceBetweenNodes.TreeNode(4);
        root.left = new MinDistanceBetweenNodes.TreeNode(2);
        root.right  = new MinDistanceBetweenNodes.TreeNode(6);
        root.left.left = new MinDistanceBetweenNodes.TreeNode(1);
        root.left.right = new MinDistanceBetweenNodes.TreeNode(3);
        root.right.left = null;
        root.right.right = null;
        root.left.left.left = null;
        root.left.left.right = null;
        Assert.assertEquals(1,minDistanceBetweenNodes.minDiffInBST(root));
    }

    @Test
    public void test2(){
        MinDistanceBetweenNodes.TreeNode root = new MinDistanceBetweenNodes.TreeNode(1);
        root.left = new MinDistanceBetweenNodes.TreeNode(0);
        root.right  = new MinDistanceBetweenNodes.TreeNode(48);
        root.left.left = null;
        root.left.right = null;
        root.right.left  = new MinDistanceBetweenNodes.TreeNode(12);
        root.right.right  = new MinDistanceBetweenNodes.TreeNode(49);
        root.right.left.left = null;
        root.right.left.right = null;
        Assert.assertEquals(1,minDistanceBetweenNodes.minDiffInBST(root));
    }
}
