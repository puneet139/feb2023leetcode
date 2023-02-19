package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeZigZagTest {

    BinaryTreeZigZag binaryTreeZigZag;

    @Before
    public void setUp(){
        binaryTreeZigZag = new BinaryTreeZigZag();
    }

    @After
    public void tearDown(){
        binaryTreeZigZag = null;
    }

    @Test
    public void test1(){
        BinaryTreeZigZag.TreeNode root = new BinaryTreeZigZag.TreeNode(3);
        root.left = new BinaryTreeZigZag.TreeNode(9);
        root.right = new BinaryTreeZigZag.TreeNode(20);
        root.left.left = null;
        root.left.right = null;
        root.right.left = new BinaryTreeZigZag.TreeNode(15);
        root.right.right = new BinaryTreeZigZag.TreeNode(7);
        root.right.left.left = null;
        root.right.left.right = null;
        root.right.right.left = null;
        root.right.right.right = null;
        Assert.assertEquals(3,binaryTreeZigZag.zigzagLevelOrder(root).size());
    }

    @Test
    public void test2(){
        BinaryTreeZigZag.TreeNode root = new BinaryTreeZigZag.TreeNode(1);
        root.left = null;
        root.right = null;
        Assert.assertEquals(1,binaryTreeZigZag.zigzagLevelOrder(root).size());
    }

    @Test
    public void test3(){
        BinaryTreeZigZag.TreeNode root = null;
        Assert.assertEquals(0,binaryTreeZigZag.zigzagLevelOrder(root).size());
    }
}
