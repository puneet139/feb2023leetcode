package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NamingCompanyTest {

    NamingCompany namingCompany;

    @Before
    public void setUp(){
        namingCompany = new NamingCompany();
    }

    @After
    public void tearDown(){
        namingCompany = null;
    }

    @Test
    public void test1(){
        String[] ideas = {"coffee","donuts","time","toffee"};
        Assert.assertEquals(6,namingCompany.distinctNames(ideas));
    }

    @Test
    public void test2(){
        String[] ideas = {"lack","back"};
        Assert.assertEquals(0,namingCompany.distinctNames(ideas));
    }
}
