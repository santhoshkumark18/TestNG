package org.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
    @Test(description = "this method for login page ", enabled = false)
    public void login() {
        System.out.println("login");
    }

    @Test(dependsOnMethods = {"login"}, alwaysRun = true)
    public void ChangeTitel() {
        System.out.println("Sginup");
    }

    @Test(invocationCount = 3, invocationTimeOut = 20000)
    public void passwd() {
        System.out.println("Passwd");
    }

    @Test(priority = 4)
    public void forgotPsd() {
        System.out.println("ForgotPsd");
    }

    @Test()
    public void sginIN() {
        System.out.println("sginIN");
    }
}