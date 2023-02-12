package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinimumFuelCostTest {

    MinimumFuelCost minimumFuelCost;

    @Before
    public void setUp(){
        minimumFuelCost = new MinimumFuelCost();
    }

    @After
    public void tearDown(){
        minimumFuelCost = null;
    }

    @Test
    public void test1(){
        int[][] roads = {{0,1},{0,2},{0,3}};
        int seats = 5;
        Assert.assertEquals(3,minimumFuelCost.minimumFuelCost(roads,seats));
    }

    @Test
    public void test2(){
        int[][] roads = {{3,1},{3,2},{1,0},{0,4},{0,5},{4,6}};
        int seats = 2;
        Assert.assertEquals(7, minimumFuelCost.minimumFuelCost(roads,seats));
    }

    @Test
    public void test3(){
        int[][] roads = {};
        int seats = 0;
        Assert.assertEquals(0,minimumFuelCost.minimumFuelCost(roads,seats));
    }
}
