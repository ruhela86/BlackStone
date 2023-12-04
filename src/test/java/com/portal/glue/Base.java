package com.portal.glue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.quit();
    }
}
