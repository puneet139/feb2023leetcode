package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IpoLeetcodeTest {

    IpoLeetcode ipoLeetcode;

    @Before
    public void setUp(){
        ipoLeetcode = new IpoLeetcode();
    }

    @After
    public void tearDown(){
        ipoLeetcode = null;
    }

    @Test
    public void test1(){
        int k=2;
        int w =0;
        int[] profits = {1,2,3};
        int[] capital = {0,1,1};
        Assert.assertEquals(4,ipoLeetcode.findMaximizedCapital(k,w,profits,capital));
    }

    @Test
    public void test2(){
        int k=3;
        int w =0;
        int[] profits = {1,2,3};
        int[] capital = {0,1,2};
        Assert.assertEquals(6,ipoLeetcode.findMaximizedCapital(k,w,profits,capital));
    }

}
