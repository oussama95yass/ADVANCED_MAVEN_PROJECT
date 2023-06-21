package com.DataDriven.Practice.code_2ndApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_Practice {

	WebDriver driver;
	

	@Test(dataProvider = "getData")
	public void loginNinjaTest(String username, String password) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	 
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][]data = {{"seleniumpanda@gmail.com","Selenium@123"},
				          {"seleniumpanda1@gmail.com","Selenium@123"},
				          {"seleniumpanda2@gmail.com","Selenium@123"},
				          {"seleniumpanda845@gmail.com","Selenium@123"}};
	 
		return data;
	}
	
}
		
	

	

