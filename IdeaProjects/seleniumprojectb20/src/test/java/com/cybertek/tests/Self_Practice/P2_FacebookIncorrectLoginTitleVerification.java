package com.cybertek.tests.Self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_FacebookIncorrectLoginTitleVerification {
    public static void main(String[] args) {

      //TC #2: Facebook incorrect login title verification
        // 1.Open Chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3.Enter incorrect username
        driver.findElement(By.id("email")).sendKeys("lalal");
        // 4.Enter incorrect password
        driver.findElement(By.id("pass")).sendKeys("123321"+Keys.ENTER);
        // 5.Verify title changed to: Expected: “Log into Facebook | Facebook”

        String expectedTitle = "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED ");
        }else {
            System.out.println("Title verification FAILED");
        }











    }
}
