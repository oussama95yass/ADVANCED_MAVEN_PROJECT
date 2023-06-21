package com.testngcode_8thApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ReddifCreateAccountTest {

public WebDriver driver;
public SoftAssert softassert = new SoftAssert();
public Select select;
	
	@Test
	public void rediffLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com");
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[starts-with(@name, 'name')]")).sendKeys("Selenium Panda");
		driver.findElement(By.xpath("//input[starts-with(@name,'login')]")).sendKeys("selenium995");
		driver.findElement(By.className("btn_checkavail")).click();
		String actualAvailabilityMessage = driver.findElement(By.id("check_availability")).getText();
		String expectedAvailabilityMesssage = "Yippie! The ID you've chosen is available. ";
		softassert.assertTrue(actualAvailabilityMessage.contains(actualAvailabilityMessage));
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("mobno")).sendKeys("629694851");
		
		select = new Select(driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Day')]")));
		select.selectByVisibleText("01");
		
		select = new Select(driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Month')]")));
		select.selectByVisibleText("JAN");
		
		select = new Select(driver.findElement(By.xpath("//select[starts-with(@name, 'DOB_Year')]")));
		select.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("input[starts-with(@name,'gender')][@value = 'm']")).click();
		
		select = new Select(driver.findElement(By.id("contry")));
		select.selectByVisibleText("United States");
		
		driver.findElement(By.className("captcha")).sendKeys("ABCD");
		driver.findElement(By.id("Register")).click();
		
		String actualUnregistredWarningMessage = driver.findElement(By.className("errbody")).getText();
		String expectedUnregistredWarninngMessage = "Sorry! We will not be able to rigister you right now. ";
		softassert.assertTrue(actualUnregistredWarningMessage.contains(expectedUnregistredWarninngMessage));
		
		
	
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
