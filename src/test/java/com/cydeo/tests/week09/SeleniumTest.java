package com.cydeo.tests.week09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTest {


    public static void main(String[] args) {

        WebDriver driver = getFirefoxDriver();
        driver.get("https://app.seamlessly.net/index.php/login");
        driver.navigate().refresh();
        driver.navigate().to("https://qa1.vytrack.com/user/login");
        driver.navigate().back();
        driver.close();



    }



    public static ChromeDriver getChromeDriver() {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static FirefoxDriver getFirefoxDriver() {
        FirefoxDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }


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
