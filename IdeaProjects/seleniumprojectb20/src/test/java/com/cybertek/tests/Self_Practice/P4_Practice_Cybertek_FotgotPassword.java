package com.cybertek.tests.Self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_Practice_Cybertek_FotgotPassword {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( "http://practice.cybertekschool.com/forgot_password");

        driver.findElement(By.name("email")).sendKeys("akyldz@gmail.com");
        driver.findElement(By.id("form_submit")).click();











    }
}
