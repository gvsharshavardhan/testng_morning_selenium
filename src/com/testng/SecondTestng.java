package com.testng;

import org.testng.annotations.*;

public class SecondTestng {

    @BeforeClass
    public void beforesecondClass(){
        System.out.println("before second class&&");
    }

    @AfterClass
    public void aftersecondClass(){
        System.out.println("after second class&&");
    }

    @AfterSuite
    public void afterSuitesecond() {
        System.out.println("after suite second!!");
    }

    @BeforeSuite
    public void beforeSuitesecond() {
        System.out.println("before suite second!!");
    }

    @Test
    public void login() {
        System.out.println("login ");
    }

    @Test
    public void logout() {
        System.out.println("logout");
    }

    @Test
    public void contacts() {
        System.out.println("contacts");
    }

    @Test
    public void payment() {
        System.out.println("payments");
    }
}
