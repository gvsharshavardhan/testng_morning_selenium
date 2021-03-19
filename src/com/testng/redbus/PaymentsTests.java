package com.testng.redbus;

import org.testng.annotations.Test;

public class PaymentsTests {

    @Test(groups = {"smoke","reg","cards"})
    void testCreditCardPayment() {
        System.out.println("credit card payment!!");
    }

    @Test(groups = {"smoke","cards"})
    void testDebitCardPayment() {
        System.out.println("debit card payment!!");
    }

    @Test(groups = {"reg","online"})
    void testUpiPayment() {
        System.out.println("upi payment!!");
    }

    @Test(groups = {"reg","online"})
    void testNetBankingPayment() {
        System.out.println("net banking payment!!");
    }
}
