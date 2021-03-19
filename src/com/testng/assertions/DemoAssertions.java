package com.testng.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertions {

    @Test
    void testSoftAssertions() {
        SoftAssert sa = new SoftAssert();
        String name = "GOUTHAM";
        int age = 24;
        long salary = 1000000;
        System.out.println("name check");
        sa.assertEquals("GOUTHAM", name);
        System.out.println("age check");
        sa.assertEquals(25, age);
        System.out.println("salary check");
        sa.assertEquals(1000000, salary);
        sa.assertAll();
    }

    @Test(alwaysRun = true)
    void runAnywayTest(){
        System.out.println("will i get print on console!!");
    }
}