package org.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edge {
    @Test
    public void testOne() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}
