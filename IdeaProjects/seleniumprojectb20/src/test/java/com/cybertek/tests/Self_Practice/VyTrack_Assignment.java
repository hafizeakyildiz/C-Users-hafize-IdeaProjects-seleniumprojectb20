package com.cybertek.tests.Self_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VyTrack_Assignment {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // sets up the chrome

        WebDriver driver = new ChromeDriver(); // opens the driver(chrome)
        driver.manage().window().maximize();


        driver.get("https://qa2.vytrack.com/");

        driver.findElement(By.id("prependedInput")).sendKeys("user160");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123"+Keys.ENTER);











    }
}
