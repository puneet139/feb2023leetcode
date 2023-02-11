package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShortestPathAlternateColorTest {

    ShortestPathAlternateColor shortestPathAlternateColor;

    @Before
    public void setUp(){
        shortestPathAlternateColor = new ShortestPathAlternateColor();
    }

    @After
    public void tearDown(){
        shortestPathAlternateColor = null;
    }

    @Test
    public void test1(){
        int n = 3;
        int[][] redEdges = {{0,1},{1,2}};
        int[][] blueEdges = {};
        Assert.assertEquals(0,shortestPathAlternateColor.shortestAlternatingPaths(n,redEdges,blueEdges)[0]);
        Assert.assertEquals(1,shortestPathAlternateColor.shortestAlternatingPaths(n,redEdges,blueEdges)[1]);
        Assert.assertEquals(-1,shortestPathAlternateColor.shortestAlternatingPaths(n,redEdges,blueEdges)[2]);
    }

    @Test
    public void test2(){
        int n = 3;
        int[][] redEdges = {{0,1}};
        int[][] blueEdges = {{2,1}};
        Assert.assertEquals(0,shortestPathAlternateColor.shortestAlternatingPaths(n,redEdges,blueEdges)[0]);
        Assert.assertEquals(1,shortestPathAlternateColor.shortestAlternatingPaths(n,redEdges,blueEdges)[1]);
        Assert.assertEquals(-1,shortestPathAlternateColor.shortestAlternatingPaths(n,redEdges,blueEdges)[2]);
    }
}
