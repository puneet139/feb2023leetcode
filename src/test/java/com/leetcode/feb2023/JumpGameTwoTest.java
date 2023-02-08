package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JumpGameTwoTest {

    JumpGameTwo jumpGameTwo;

    @Before
    public void setUp(){
        jumpGameTwo = new JumpGameTwo();
    }

    @After
    public void tearDown(){
        jumpGameTwo = null;
    }

    @Test
    public void test1(){
        int[] nums = {2,3,1,1,4};
        Assert.assertEquals(2,jumpGameTwo.jump(nums));
    }

    @Test
    public void test2(){
        int[] nums = {3,2,1,1,4};
        Assert.assertEquals(2,jumpGameTwo.jump(nums));
    }
}
