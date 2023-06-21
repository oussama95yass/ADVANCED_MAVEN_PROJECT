package com.automationcode_19thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_xpath {

	
	public static WebDriver driver;
	public static ChromeOptions options;
	
	@BeforeMethod
	public void setUp() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
	public void clickOnCreatNewAccount() {
		driver.findElement(By.linkText("Create new account")).click();
	}
	@Test(priority=2, dependsOnMethods="clickOnCreatNewAccount")
	public void createNewAccountDetailsPage() throws Exception {
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Oussama");
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Boukachabine");
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Bomber.Bomber@gmail.com");
	    driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Bomber.Bomber@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("AmoreZandobbio1995");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
