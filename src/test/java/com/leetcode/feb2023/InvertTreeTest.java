package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvertTreeTest {

    InvertTree invertTree;

    @Before
    public void setUp(){
        invertTree = new InvertTree();
    }

    @After
    public void tearDown(){
        invertTree = null;
    }

    @Test
    public void test1(){
        InvertTree.TreeNode root = new InvertTree.TreeNode(4);
        root.left = new InvertTree.TreeNode(2);
        root.right = new InvertTree.TreeNode(7);
        root.left.left = new InvertTree.TreeNode(1);
        root.left.right = new InvertTree.TreeNode(3);
        root.right.left = new InvertTree.TreeNode(6);
        root.right.right = new InvertTree.TreeNode(9);
        root.left.left.left = null;
        root.left.left.right = null;
        root.left.right.left = null;
        root.left.right.right = null;
        root.right.left.left = null;
        root.right.left.right = null;
        root.right.right.left = null;
        root.right.right.right = null;
        InvertTree.TreeNode r = invertTree.invertTree(root);
        Assert.assertEquals(7,r.left.val);
        Assert.assertEquals(2,r.right.val);
    }

    @Test
    public void test2(){
        InvertTree.TreeNode root = new InvertTree.TreeNode(2);
        root.left = new InvertTree.TreeNode(1);
        root.right = new InvertTree.TreeNode(3);
        root.left.left = null;
        root.left.right = null;
        root.right.left = null;
        root.right.right = null;
        InvertTree.TreeNode r = invertTree.invertTree(root);
        Assert.assertEquals(3,r.left.val);
        Assert.assertEquals(1,r.right.val);
    }

    @Test
    public void test3(){
        InvertTree.TreeNode root = null;
        Assert.assertEquals(null,invertTree.invertTree(root));
    }

}
