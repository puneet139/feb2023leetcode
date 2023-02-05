package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindAllAnagramsInStringTest {

    FindAllAnagramsInString findAllAnagramsInString;

    @Before
    public void setUp(){
        findAllAnagramsInString = new FindAllAnagramsInString();
    }

    @After
    public void tearDown(){
        findAllAnagramsInString = null;
    }

    @Test
    public void test1(){
        String s = "cbaebabacd";
        String p = "abc";
        Assert.assertEquals(2,findAllAnagramsInString.findAnagrams(s,p).size());
    }

    @Test
    public void test2(){
        String s = "abab";
        String p = "ab";
        Assert.assertEquals(3,findAllAnagramsInString.findAnagrams(s,p).size());
    }
}
