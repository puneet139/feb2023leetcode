package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchInsertPositionTest {

    SearchInsertPosition searchInsertPosition;

    @Before
    public void setUp(){
        searchInsertPosition = new SearchInsertPosition();
    }

    @After
    public void tearDown(){
        searchInsertPosition = null;
    }

    @Test
    public void test1(){
        int[] nums = {1,3,5,6};
        int target = 5;
        Assert.assertEquals(2,searchInsertPosition.searchInsert(nums,target));
    }

    @Test
    public void test2(){
        int[] nums = {1,3,5,6};
        int target = 2;
        Assert.assertEquals(1,searchInsertPosition.searchInsert(nums,target));
    }

    @Test
    public void test3(){
        int[] nums = {1,3,5,6};
        int target = 7;
        Assert.assertEquals(4,searchInsertPosition.searchInsert(nums,target));
    }
}
