package com.cybertek.tests.Self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_FacebookTitleVerification {

    public static void main(String[] args) {

        //TC #1: Facebook title verification
        //1.Open Chrome browser

        WebDriverManager.chromedriver().setup(); //set up the browser driver

        WebDriver driver = new ChromeDriver(); // opens chrome driver
        driver.manage().window().maximize();
        //2.Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Verify title:
        // Expected: “Facebook -Log In or Sign Up

        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }










    }





}
