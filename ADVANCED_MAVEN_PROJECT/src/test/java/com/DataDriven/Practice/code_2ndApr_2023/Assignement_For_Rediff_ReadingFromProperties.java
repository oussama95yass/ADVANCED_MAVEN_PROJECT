package com.DataDriven.Practice.code_2ndApr_2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Assignement_For_Rediff_ReadingFromProperties {

	public WebDriver driver;
	
	@Test
	public void rediffLogin() throws IOException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("The common Path with can be universel : " + System.getProperty("user.dir"));
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/filehandling_8thApr_2023/TN_Rediff.properties");
		prop.load(ip);
		
		driver.get(prop.getProperty("url1"));
		driver.findElement(By.id("login1")).sendKeys(prop.getProperty("validRUsername"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("validRPassword"));
		driver.findElement(By.className("signinbtn")).click();
		}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
