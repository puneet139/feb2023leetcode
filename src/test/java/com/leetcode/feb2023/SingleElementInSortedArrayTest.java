package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleElementInSortedArrayTest {

    SingleElementInSortedArray singleElementInSortedArray;

    @Before
    public void setUp(){
        singleElementInSortedArray = new SingleElementInSortedArray();
    }

    @After
    public void tearDown(){
        singleElementInSortedArray = null;
    }

    @Test
    public void test1(){
        int[] nums = {1,1,2,3,3,4,4,8,8};
        Assert.assertEquals(2,singleElementInSortedArray.singleNonDuplicate(nums));
    }

    @Test
    public void test2(){
        int[] nums = {3,3,7,7,10,11,11};
        Assert.assertEquals(10,singleElementInSortedArray.singleNonDuplicate(nums));
    }
}
