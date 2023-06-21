package com.automationcode_25thMar_2023;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_DropDown {

	public WebDriver driver;
	public Select select;
	
	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}
	
	@Test
	public void dropDownTest() throws Exception {
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Oussama");
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Boukachabine");
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Bomber.Bomber@gmail.com");
	    driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Bomber.Bomber@gmail.com");
	    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("AmoreZandobbio1995");
		//dropdown automation
	    
	    select = new Select(driver.findElement(By.id("month")));
	    select.selectByVisibleText("Jul"); 
	    
	    select = new Select(driver.findElement(By.id("day")));
	    select.selectByVisibleText("10");
	    
	    select = new Select(driver.findElement(By.id("year")));
	    select.selectByVisibleText("1965");
	    
	}
	

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
