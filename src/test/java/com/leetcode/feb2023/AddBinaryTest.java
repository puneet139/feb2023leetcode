package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddBinaryTest {

    AddBinary addBinary;

    @Before
    public void setUp(){
        addBinary = new AddBinary();
    }

    @After
    public void tearDown(){
        addBinary = null;
    }

    @Test
    public void test1(){
        String a = "11";
        String b = "1";
        Assert.assertEquals("100",addBinary.addBinary(a,b));
    }

    @Test
    public void test2(){
        String a = "1010";
        String b="1011";
        Assert.assertEquals("10101",addBinary.addBinary(a,b));
    }
}
