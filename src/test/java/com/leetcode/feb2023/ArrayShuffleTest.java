package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayShuffleTest {

    ArrayShuffle arrayShuffle;

    @Before
    public void setUp(){
        arrayShuffle = new ArrayShuffle();
    }

    @After
    public void tearDown(){
        arrayShuffle = null;
    }

    @Test
    public void test1(){
        int[] nums = {2,5,1,3,4,7};
        int n =3;
        Assert.assertEquals(3,arrayShuffle.shuffle(nums,n)[1]);
    }

    @Test
    public void test2(){
        int[] nums = {1,2,3,4,4,3,2,1};
        int n =4;
        Assert.assertEquals(4,arrayShuffle.shuffle(nums,n)[1]);
    }

    @Test
    public void test3(){
        int[] nums = {1,1,2,2};
        int n =2;
        Assert.assertEquals(2,arrayShuffle.shuffle(nums,n)[1]);
    }
}
