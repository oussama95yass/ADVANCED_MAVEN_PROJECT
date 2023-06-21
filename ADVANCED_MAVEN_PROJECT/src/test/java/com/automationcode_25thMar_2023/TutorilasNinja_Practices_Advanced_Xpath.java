package com.automationcode_25thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorilasNinja_Practices_Advanced_Xpath {

	
	public static WebDriver driver;
	public static ChromeOptions options;
	
	@BeforeMethod
	public void setUp() {
		options = new ChromeOptions ();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://www.tutorialsninja.com/demo/");
	}
	
	@Test(priority=1)
	public void tutorialsNinjaLoginTry() throws Exception {
		driver.findElement(By.xpath("//a[text() ='Login']")).click();
		Thread.sleep(2000);
	}
		
		@Test(priority=2)
		public void tutorialsNinjaLogin() throws Exception {
			driver.findElement(By.xpath("//a[text() ='Login']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("seleniumpanda@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='account-login']/descendant ::input[@id='input-email']")).sendKeys("Selenium@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
		}
			
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		
		
		
	
}
