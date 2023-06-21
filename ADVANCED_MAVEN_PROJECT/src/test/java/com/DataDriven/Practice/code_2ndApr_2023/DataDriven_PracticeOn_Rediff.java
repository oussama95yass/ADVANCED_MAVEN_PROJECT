package com.DataDriven.Practice.code_2ndApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_PracticeOn_Rediff {
	public class DataDriven_Practice {

		WebDriver driver;
		

		@Test(dataProvider = "getRediffData")
		public void loginRediffTest(String username, String password) {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.id("login1")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.className("signinbtn")).click();
		 
		}
		
		@DataProvider
		public Object[][] getRediffData(){
			
			Object[][]getRediffdata = {{"seleniumpanda@rediffmail.com","Selenium@123"},
					          {"seleniumpanda1@rediffmail.com","Selenium@123"},
					          {"seleniumpanda2@rediffmail.com","Selenium@123"},
					          {"seleniumpanda23@rediffmail.com","Selenium@123"}};
		 
			return getRediffdata;
		}
		
	}
}
