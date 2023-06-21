package com.automationcode_18thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tutorials_ninja_registration_practice {

	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void openinhTutorilasninja() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
	}
	
	
	@Test(priority=1)
	public void confirmRegisterCridentials() throws Exception {
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input-firstname")).sendKeys("Oussama");
		Thread.sleep(1000);
		driver.findElement(By.id("input-lastname")).sendKeys("Boukachabine");
		Thread.sleep(1000);
		driver.findElement(By.id("input-email")).sendKeys("Bomberbomber@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-telephone")).sendKeys("0669298291");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("Boukachabine123");
		Thread.sleep(1000);
		driver.findElement(By.id("input-confirm")).sendKeys("Boukachabine123");
		Thread.sleep(1000);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@AfterMethod
	public void clickOnConfirm() {
		driver.quit();
	}
}
