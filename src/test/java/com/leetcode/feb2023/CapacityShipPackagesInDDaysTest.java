package com.leetcode.feb2023;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CapacityShipPackagesInDDaysTest {

    CapacityShipPackagesInDDays capacityShipPackagesInDDays;

    @Before
    public void setUp(){
        capacityShipPackagesInDDays = new CapacityShipPackagesInDDays();
    }

    @After
    public void tearDown(){
        capacityShipPackagesInDDays = null;
    }

    @Test
    public void test1(){
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        Assert.assertEquals(15,capacityShipPackagesInDDays.shipWithinDays(weights,days));
    }

    @Test
    public void test2(){
        int[] weights = {3,2,2,4,1,4};
        int days = 3;
        Assert.assertEquals(6,capacityShipPackagesInDDays.shipWithinDays(weights,days));
    }

    @Test
    public void test3(){
        int[] weights = {1,2,3,1,1};
        int days = 4;
        Assert.assertEquals(3,capacityShipPackagesInDDays.shipWithinDays(weights,days));
    }
}
