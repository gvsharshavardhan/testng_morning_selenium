package com.testng.redbus;

import org.testng.annotations.Test;

public class CancelTicketsTests {

    @Test(groups = {"smoke"})
    void testLatestCancelTicket(){
        System.out.println("cancel recent booking");
    }

    @Test
    void testWeekAgoCancelTicket(){
        System.out.println("cancel week ago booking");
    }
}