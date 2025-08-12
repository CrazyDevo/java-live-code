package com.cydeo.tests.week10;

import com.cydeo.tests.utilities.DataGenerator;
import com.cydeo.tests.utilities.Driver;
import com.cydeo.tests.utilities.WaitUtilities;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
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

        Faker faker = new Faker();

        input("firstname", "test_"+faker.name().firstName());
        input("lastname", "Brown");
        input("username", "adamb");
        input("email", "test_"+ DataGenerator.getEmail());
        input("password", "1234");
        input("phone", "123-456-7890");
        input("birthday", "12/05/2025");
        select("Male");
        WaitUtilities.sleep(3);
        select("Female");
        WaitUtilities.sleep(3);
        select("otHer");
        WaitUtilities.sleep(3);
        select("Java");
        WaitUtilities.sleep(3);
        select("javaScripT");
        WaitUtilities.sleep(3);


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

    /**
     *
     *
     * @param value  value can be java, javscript, male, female
     */
    public void select(String value){
        String locator="//input[@value='"+value.toLowerCase()+"']";
        driver.findElement(By.xpath(locator)).click();
    }
}
