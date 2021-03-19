package com.testng.two;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestngDepends {

//    @Test
//    public void adfirsttest() {
//        System.out.println("my first test 400");
//    }

//    @Test(dependsOnMethods = {"abfirsttest"},alwaysRun = true)
//    public void aafirsttest() {
//        System.out.println("my first test 300");
////        Assert.fail();
//    }
//
//    @Test
//    public void aefirsttest() {
//        System.out.println("my first test 22200");
//    }
//
    @Test
    public void acfirsttest() {
        System.out.println("my first test 100");
        throw new SkipException("i am getting skipped from abfirsttest!!");
    }

    @Test(dependsOnMethods = {"acfirsttest"},alwaysRun = true)
    public void abfirsttest() {
        System.out.println("my first test 200");
    }
//
//    @Test
//    public void xyzfirsttest() {
//        System.out.println("my first test 12345678");
//    }
//

}