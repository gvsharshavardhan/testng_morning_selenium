package com.testng.redbus;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests {

    @Test(groups = {"smoke","login"})
    @Parameters({"username", "password"})
    void testCustomerLogin(String uname, String password) {
        boolean flag = false;
        System.out.println("customer login!!");
        if (uname.equals("goutham") && password.equals("password123")) {
            System.out.println("logged in successfully");
            flag = true;
        }
        Assert.assertTrue(flag);
    }

    @Test(groups = {"reg"})
    void testAdminLogin() {
        System.out.println("admin login!!");
    }
}
