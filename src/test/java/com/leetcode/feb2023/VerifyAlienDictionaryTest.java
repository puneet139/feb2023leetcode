package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VerifyAlienDictionaryTest {

    VerifyAlienDictionary verifyAlienDictionary;

    @Before
    public void setUp(){
        verifyAlienDictionary = new VerifyAlienDictionary();
    }

    @After
    public void tearDown(){
        verifyAlienDictionary = null;
    }

    @Test
    public void test1(){
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        Assert.assertEquals(true,verifyAlienDictionary.isAlienSorted(words,order));
    }

    @Test
    public void test2(){
        String[] words = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        Assert.assertEquals(false,verifyAlienDictionary.isAlienSorted(words,order));
    }

    @Test
    public void test3(){
        String[] words = {"apple","app"};
        String order = "abcdefghijklmnopqrstuvwxyz";
        Assert.assertEquals(false,verifyAlienDictionary.isAlienSorted(words,order));
    }
}
