package com.testngcode_8thApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TutorialsNinjaLoginTest {

public WebDriver driver;
	
	@Test
	@Parameters({"Browser", "url", "username", "password"})
	public void rediffLogin(String Browser, String url, String username, String password) {
		
		if (Browser.equals("chromr")) {
			driver = new ChromeDriver();
		}else if (Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("username");
		driver.findElement(By.id("input-password")).sendKeys("password");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
