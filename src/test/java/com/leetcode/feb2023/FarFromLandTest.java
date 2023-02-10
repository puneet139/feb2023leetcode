package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarFromLandTest {

    FarFromLand farFromLand;

    @Before
    public void setUp(){
        farFromLand = new FarFromLand();
    }

    @After
    public void tearDown(){
        farFromLand = null;
    }

    @Test
    public void test1(){
        int[][] grid = {{1,0,1},{0,0,0},{1,0,1}};
        Assert.assertEquals(2, farFromLand.maxDistance(grid));
    }

    @Test
    public void test2(){
        int[][] grid = {{1,0,0},{0,0,0},{0,0,0}};
        Assert.assertEquals(4,farFromLand.maxDistance(grid));
    }
}
