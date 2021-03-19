package com.testng;

import org.testng.annotations.*;

public class AbcTestng {
    @BeforeClass
    public void beforethirdClass(){
        System.out.println("before third class^^");
    }

    @AfterClass
    public void afterthirdClass(){
        System.out.println("after third class^^");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test@@");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test@@");
    }

    @Test
    public void messaging() {
        System.out.println("messaging");
    }

    @Test
    public void voiceCalls() {
        System.out.println("voice calls");
    }

    @Test
    public void VideoCalls() {
        System.out.println("video calls");
    }

    @Test
    public void whatsappPayments() {
        System.out.println("whatsapp payments");
    }
}
