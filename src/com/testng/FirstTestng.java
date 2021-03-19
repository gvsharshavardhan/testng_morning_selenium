package com.testng;

import org.testng.annotations.*;

public class FirstTestng {


    @BeforeMethod
    public void beforemethod(){
        System.out.println("***********before**************");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("***********after**************");
    }

    @BeforeClass
    public void beforeFirstClass(){
        System.out.println("before first class##");
    }

    @AfterClass
    public void afterFirstClass(){
        System.out.println("after first class##");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test**");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test**");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite!!");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite!!");
    }

    @Test
    public void adfirsttest() {
        System.out.println("my first test 400");
    }

    @Test
    public void aafirsttest() {
        System.out.println("my first test 300");
    }

    @Test
    public void abfirsttest() {
        System.out.println("my first test 200");
    }

    @Test
    public void acfirsttest() {
        System.out.println("my first test 100");
    }
}
