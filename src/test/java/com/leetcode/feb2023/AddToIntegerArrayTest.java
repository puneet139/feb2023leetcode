package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

public class AddToIntegerArrayTest {

    AddToArrayInteger addToArrayInteger;

    @Before
    public void setUp(){
        addToArrayInteger = new AddToArrayInteger();
    }

    @After
    public void tearDown(){
        addToArrayInteger = null;
    }

    @Test
    public void test1(){
        int[] num = {1,2,0,0};
        int k = 34;
        Assert.assertEquals(Optional.of(4).get(),addToArrayInteger.addToArrayForm(num,k).get(3));
        Assert.assertEquals(Optional.of(3).get(),addToArrayInteger.addToArrayForm(num,k).get(2));
    }

    @Test
    public void test2(){
        int[] num = {2,7,4};
        int k = 181;
        Assert.assertEquals(Optional.of(5).get(),addToArrayInteger.addToArrayForm(num,k).get(2));
        Assert.assertEquals(Optional.of(5).get(),addToArrayInteger.addToArrayForm(num,k).get(1));
    }

    @Test
    public void test3(){
        int[] num = {2,1,5};
        int k = 806;
        Assert.assertEquals(Optional.of(1).get(),addToArrayInteger.addToArrayForm(num,k).get(3));
        Assert.assertEquals(Optional.of(2).get(),addToArrayInteger.addToArrayForm(num,k).get(2));
    }
}
