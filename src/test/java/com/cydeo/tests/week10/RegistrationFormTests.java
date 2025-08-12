package com.cydeo.tests.week10;

import com.cydeo.tests.utilities.Driver;
import com.cydeo.tests.utilities.WaitUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationFormTests {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = Driver.getDriver("chrome");
        driver.get("https://practice.cydeo.com/registration_form");

    }

    @Test
    public void test1() {
        input("firstname", "Adam");
        input("lastname", "Brown");
        input("username", "adamb");
        input("email", "adam@gmail.com");
        input("password", "1234");

    }

    @Test
    public void test2() {


    }

    @Test
    public void test3() {

    }


    @AfterMethod
    public void tearDown() {
        WaitUtilities.sleep(3);
        driver.close();

    }

    /**
     * @param type  type can be firstname,lastname,phone,birthday,username
     * @param input
     */
    public void input(String type, String input) {

        String locator = "//input[@name='" + type + "']";
        driver.findElement(By.xpath(locator)).sendKeys(input);

    }
}
