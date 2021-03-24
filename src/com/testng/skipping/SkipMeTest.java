package com.testng.skipping;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipMeTest {

    @Test
    public void firsttest() {
        System.out.println("first test");
//        Assert.fail();
    }

    @Test(dependsOnMethods = "firsttest")
    public void secondtest() {
        System.out.println("second test");
        throw new SkipException("i will get skipped!!");
    }
}
