package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PermutationInStringTest {

    PermutationInString permutationInString;

    @Before
    public void setUp(){
        permutationInString = new PermutationInString();
    }

    @After
    public void tearDown(){
        permutationInString = null;
    }

    @Test
    public void test1(){
        String s1 = "ab";
        String s2 = "eidbaooo";
        Assert.assertTrue(permutationInString.checkInclusion(s1,s2));
    }

    @Test
    public void test2(){
        String s1 = "ab";
        String s2 = "eidboaoo";
        Assert.assertFalse(permutationInString.checkInclusion(s1,s2));
    }
}
