package com.cybertek.tests.Self_Practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveElements {
    public static void main(String[] args) {

        // 1. open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to "http://practice.cybertekschool.com/add_remove_elements/
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        // 3. maximize the windows
        driver.manage().window().maximize();

        // 4. locate an click to "Add Element" button

        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();

        // 5. verify delete button is displayed after clicking
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        System.out.println("Delete button: "+deleteButton.isDisplayed());

        //6. Click to Delete button

        deleteButton.click();


        //7. Verify "Delete Button" is Not displayed after clicking


        System.out.println("Delete button is displayed: "+deleteButton.isDisplayed());

     driver.close();




    }
}
