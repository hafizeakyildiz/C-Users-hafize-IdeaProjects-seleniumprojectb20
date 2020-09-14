package com.cybertek.tests.Self_Practice.P5_PracticeCybertek;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
1: PracticeCybertek.com_ForgotPassword WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
 */
public class com_ForgatPasswordWebElementVerification {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");



     //a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a[href='/']"));


     //b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.xpath("div.example>h2"));


     //c. “E-mail” text
        WebElement eMailText = driver.findElement(By.xpath("//label[.='E-mail']"));


    // d. E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z0')]"));


     //e. “Retrieve password” button
        WebElement retrieveButton = driver.findElement(By.xpath("//*[@class='icon-2x icon-signin']"));


    // f. “Powered by Cybertek School” text
        WebElement poweredByCybertekSchoolText = driver.findElement(By.xpath("//div[contains(@style,'text-al')]"));


        System.out.println("HomeLink: "+homeLink.isDisplayed());
        System.out.println("forgotPassWord Header: "+forgotPassword.isDisplayed());
        System.out.println("Email text: "+eMailText.isDisplayed());
        System.out.println("Email Input Box: "+inputBox.isDisplayed());
        System.out.println("Retrieve Password button: "+retrieveButton.isDisplayed());
        System.out.println("Powered by cybertek Text: "+poweredByCybertekSchoolText.isDisplayed());





    }
}
