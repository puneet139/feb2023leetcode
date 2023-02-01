package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GcdOfStringsTest {

    GcdOfStrings gcdOfStrings;

    @Before
    public void setUp(){
        gcdOfStrings = new GcdOfStrings();
    }

    @After
    public void tearDown(){
        gcdOfStrings = null;
    }

    @Test
    public void test1(){
        String str1 = "ABCABC";
        String str2 = "ABC";
        Assert.assertEquals("ABC",gcdOfStrings.gcdOfStrings(str1,str2));
    }

    @Test
    public void test2(){
        String str1 = "ABABAB";
        String str2 = "ABAB";
        Assert.assertEquals("AB",gcdOfStrings.gcdOfStrings(str1,str2));
    }

    @Test
    public void test3(){
        String str1 = "LEET";
        String str2 = "CODE";
        Assert.assertEquals("",gcdOfStrings.gcdOfStrings(str1,str2));
    }
}
