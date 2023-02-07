package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FruitsInBasketsTest {

    FruitsInBaskets fruitsInBaskets;

    @Before
    public void setUp(){
        fruitsInBaskets = new FruitsInBaskets();
    }

    @After
    public void tearDown(){
        fruitsInBaskets = null;
    }

    @Test
    public void test1(){
        int[] fruits = {1,2,1};
        Assert.assertEquals(3,fruitsInBaskets.totalFruit(fruits));
    }

    @Test
    public void test2(){
        int[] fruits = {0,1,2,2};
        Assert.assertEquals(3,fruitsInBaskets.totalFruit(fruits));
    }

    @Test
    public void test3(){
        int[] fruits = {1,2,3,2,2};
        Assert.assertEquals(4,fruitsInBaskets.totalFruit(fruits));
    }
}
