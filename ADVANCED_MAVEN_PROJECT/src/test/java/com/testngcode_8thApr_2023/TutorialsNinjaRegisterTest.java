package com.testngcode_8thApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TutorialsNinjaRegisterTest {

public WebDriver driver;
	
	@Test
	public void rediffLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Oussama");
		driver.findElement(By.id("input-lastname")).sendKeys("Yassmine");
		driver.findElement(By.id("input-email")).sendKeys("OussYassOuss@gmail");
		driver.findElement(By.id("input-telephone")).sendKeys("21621286148");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
