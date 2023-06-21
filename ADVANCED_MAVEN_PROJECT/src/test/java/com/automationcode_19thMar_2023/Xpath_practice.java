package com.automationcode_19thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xpath_practice {

	public static WebDriver driver;
	public static ChromeOptions options;
	
	@BeforeMethod
	public void setUp() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo/");
}
	
	@Test(priority = 2, dependsOnMethods ="CreatAccountOnRegister")
	public void enterCridentialOnLoginLink() {
		driver.findElement(By.xpath("//span[text() ='My Account']")).click();
		driver.findElement(By.xpath("//a[text() = 'Login']")).click();
		driver.findElement(By.xpath("//input[@name = 'email' and @id ='input-email']")).sendKeys("Bomber.Bomber@gmail.com");
		driver.findElement(By.xpath("//input[@name='password' and @id='input-password']")).sendKeys("LulaLula@123");
	}
	
	@Test(priority = 1)
	public void CreatAccountOnRegister() {
		driver.findElement(By.xpath("//span[text() ='My Account']")).click();
		driver.findElement(By.xpath("//a[text() = 'Register']")).click();
		driver.findElement(By.xpath("//input[@name='firstname' and @id='input-firstname']")).sendKeys("Oussama");
		driver.findElement(By.xpath("//input[@name='lastname' and @id='input-lastname']")).sendKeys("Boukachabine");
		driver.findElement(By.xpath("//input[@name='email' and @id='input-email']")).sendKeys("Bomber.Bomber@gmail.com");
		driver.findElement(By.xpath("//input[@name='telephone' and @id='input-telephone']")).sendKeys("0629695191");
		driver.findElement(By.xpath("//input[@name='password' and @id='input-password']")).sendKeys("LulaLula@123");
		driver.findElement(By.xpath("//input[@name='confirm' and @id='input-confirm']")).sendKeys("LulaLula@123");
		driver.findElement(By.xpath("//input[@name='agree' ]")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		
		
		
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
