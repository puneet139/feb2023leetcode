package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumDepthBinaryTreeTest {

    MaximumDepthBinaryTree maximumDepthBinaryTree;

    @Before
    public void setUp(){
        maximumDepthBinaryTree = new MaximumDepthBinaryTree();
    }

    @After
    public void tearDown(){
        maximumDepthBinaryTree = null;
    }

    @Test
    public void test1(){
        MaximumDepthBinaryTree.TreeNode root = new MaximumDepthBinaryTree.TreeNode(3);
        root.left = new MaximumDepthBinaryTree.TreeNode(9);
        root.right  = new MaximumDepthBinaryTree.TreeNode(20);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new MaximumDepthBinaryTree.TreeNode(15);
        root.right.right = new MaximumDepthBinaryTree.TreeNode(7);
        root.right.left.left = null;
        root.right.left.right = null;
        root.right.right.left = null;
        root.right.right.right = null;
        Assert.assertEquals(3,maximumDepthBinaryTree.maxDepth(root));
    }

    @Test
    public void test2(){
        MaximumDepthBinaryTree.TreeNode root = new MaximumDepthBinaryTree.TreeNode(1);
        root.left = null;
        root.right  = new MaximumDepthBinaryTree.TreeNode(2);
        root.right.left = null;
        root.right.right = null;
        Assert.assertEquals(2,maximumDepthBinaryTree.maxDepth(root));
    }

}
