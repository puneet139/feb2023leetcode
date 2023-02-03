package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZigzagConversionTest {

    ZigzagConversion zigzagConversion;

    @Before
    public void setUp(){
        zigzagConversion = new ZigzagConversion();
    }

    @After
    public void tearDown(){
        zigzagConversion = null;
    }

    @Test
    public void test1(){
        String s = "PAYPALISHIRING";
        int numRows = 3;
        Assert.assertEquals("PAHNAPLSIIGYIR",zigzagConversion.convert(s,numRows));
    }

    @Test
    public void test2(){
        String s = "PAYPALISHIRING";
        int numRows = 4;
        Assert.assertEquals("PINALSIGYAHRPI",zigzagConversion.convert(s,numRows));
    }

    @Test
    public void test3(){
        String s = "A";
        int numRows = 1;
        Assert.assertEquals("A",zigzagConversion.convert(s,numRows));
    }
}
