package com.testing.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practice {

	
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorilasninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	}
	
	@Test(priority = 1)
	public void verifyNinjaPolicyWarningMessageTest() {
		softassert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed());
		softassert.assertAll();
	}
	
	@Test(priority = 2)
	public void verifyNinjaFirstNameWarningMessageTest() {
		softassert.assertTrue(driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div[1]")).isDisplayed());
		softassert.assertAll();
	}
	
	@Test(priority = 3)
	public void verifyNinjaLastNameWarningMessageTest() {
		softassert.assertTrue(driver.findElement(By.xpath("//input[@id='input-laststname']/following-sibling::div[1]")).isDisplayed());
		softassert.assertAll();
	}
}
