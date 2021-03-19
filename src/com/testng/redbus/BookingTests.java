package com.testng.redbus;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BookingTests {

    @Test(groups = {"orange"})
    void testOrangeBusBooking() {
        System.out.println("ornage bus!");
    }

    @Test(groups = {"yamini"})
    void testYaminiAcBusBooking() {
        System.out.println("yamini ac bus!!");
    }

    @Test(groups = {"yamini"})
    @Parameters({"username", "password"})
    void testYaminiNonAcBusBooking(@Optional("IamOptional")String uname, @Optional("IamOptional")String password) {
        System.out.println("yamini non ac bus!!");
        System.out.println(uname + password);
    }
}
