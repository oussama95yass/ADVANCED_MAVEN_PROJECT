package com.automationcode_15thApr_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApplyingInterfaceLogic {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		
		// WebDriver is an interface
		// ChromeDriver is an implementing class
		
		// WebDriver has lot of abstract methods
		// an interface can refer to the object of a class
		
		driver.manage().window().maximize();
		driver.get("hhtps://rediff.com");
		
	}
	
}
