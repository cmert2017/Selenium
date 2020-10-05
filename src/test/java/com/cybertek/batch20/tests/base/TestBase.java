package com.cybertek.batch20.tests.base;

import com.cybertek.batch20.utilities.ConfigurationReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

   protected WebDriver driver;

    @BeforeClass
    public  void setup(){

        System.setProperty("webDriverManager.chromedriver","chromedriver");

        //WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(ConfigurationReader.getProperty("bitrixUrl"));

    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


}
