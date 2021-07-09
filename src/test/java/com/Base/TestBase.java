package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static WebDriver driver;
    public static void main(String a[]){
        chromeLaunch();

    }
    public static void chromeLaunch(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///C:/Users/Wife/Documents/BITM SQA Training Materials/Your Store.html");
        System.out.println("Chrome is closed");

    }
    public static void getWebURL(String URL){
        driver.get("URL");
    }
    public static void chromeClose(){
driver.close();
        System.out.println("Chrome is closed");

    }
}
