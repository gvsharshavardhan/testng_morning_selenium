package com.testng.two;

import org.testng.annotations.Test;

public class TestngOne {

    @Test(priority = -1)
    public void adfirsttest() {
        System.out.println("my first test 400");
    }

    @Test(priority = 1)
    public void aafirsttest() {
        System.out.println("my first test 300");
    }

    @Test(priority = 2)
    public void abfirsttest() {
        System.out.println("my first test 200");
    }

    @Test(priority = 4)
    public void acfirsttest() {
        System.out.println("my first test 100");
    }

    @Test(priority = 1)
    public void xyzfirsttest() {
        System.out.println("my first test 12345678");
    }
}
