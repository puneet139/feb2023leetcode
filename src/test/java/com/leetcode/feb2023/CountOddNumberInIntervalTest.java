package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountOddNumberInIntervalTest {

    CountOddNumberInInterval countOddNumberInInterval;

    @Before
    public void setUp(){
        countOddNumberInInterval = new CountOddNumberInInterval();
    }

    @After
    public void tearDown(){
        countOddNumberInInterval = null;
    }

    @Test
    public void test1(){
        int low = 3;
        int high = 7;
        Assert.assertEquals(3, countOddNumberInInterval.countOdds(low,high));
    }

    @Test
    public void test2(){
        int low = 8;
        int high = 10;
        Assert.assertEquals(1,countOddNumberInInterval.countOdds(low,high));
    }
}
