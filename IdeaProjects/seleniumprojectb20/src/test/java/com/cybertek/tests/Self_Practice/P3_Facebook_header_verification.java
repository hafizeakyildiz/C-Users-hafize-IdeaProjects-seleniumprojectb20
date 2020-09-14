package com.cybertek.tests.Self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #3: Facebook header verification
1.Open Chrome browser
2.Go to https://www.facebook.com
3.Verify header text is as expected:
 Expected: “Connect with friends and the world around you on Facebook.”
 */
public class P3_Facebook_header_verification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // SETS UP THE BROWSER


         WebDriver driver = new ChromeDriver(); // OPENS UP THE BROWSER
        driver.manage().window().maximize(); // maximizes the browser window

        driver.get("https://www.facebook.com");

        driver.findElement(By.className("_8eso"));

                String expectedHeader = "Connect with friends and the world around you on Facebook.";














    }
}
