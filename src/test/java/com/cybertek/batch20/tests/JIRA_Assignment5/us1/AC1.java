package com.cybertek.batch20.tests.JIRA_Assignment5.us1;
/*

User Story – 1. As a user, I should be able to send messages by clicking on Message tab under Active Stream.

AC:
1. User should be able to click on upload files icon to upload files and pictures from local disks, download from external drive, select documents from bixtrix24, and create files to upload.

 */

/*
/*
login2.nextbasecrm.com
https://docs.google.com/spreadsheets/d/1jBYMIGUBHgzvWZ16vJA8K5MCtiunFXq9PqBSH132E4U/edit#gid=1003894512
 */


import com.cybertek.batch20.tests.base.TestBase;
import com.cybertek.batch20.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AC1 extends TestBase {

     @Test
    public void AC1(){

         driver.findElement(By.xpath("//input[@type='text']")).sendKeys(ConfigurationReader.getProperty("username"));
         // send password
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys(ConfigurationReader.getProperty("password"));
         //click Login
         driver.findElement(By.xpath("//input[@class='login-btn']")).click();

         System.setProperty("search", "liverpool");

     }


}


//beforeClass



    //test1



    //test2


    //test3


//AfterClass





