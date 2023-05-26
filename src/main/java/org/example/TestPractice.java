package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestPractice {
    WebDriver driver;

    @Parameters({"emailId", "pass", "browser"})
    @Test
    public void webSite(String email, String pass, String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new EdgeDriver();
                break;
            default:
                System.err.println("browser is not defined");
                break;
        }
        //WebDriver driver= new ChromeDriver();
        System.out.println(email + " " + pass);
        driver.get("https://letcode.in/");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.name("email"))
                .sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.xpath("//button[.='LOGIN']")).click();
        String title = driver.getTitle();
        System.out.println("Title is " + title);
    }
}
