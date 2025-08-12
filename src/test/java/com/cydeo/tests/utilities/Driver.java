package com.cydeo.tests.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public static WebDriver getDriver(String browserType){
        if(browserType.equals("firefox")){
            FirefoxDriver driver=new FirefoxDriver();
            driver.manage().window().maximize();
            return driver;
        } else if (browserType.equals("chrome")) {
            ChromeDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }



        return null;

    }
}
