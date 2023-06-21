package com.automationcode_25thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OWM_cssSelector {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		driver.findElement(By.cssSelector("div#desktop-menu > from + ul > li:nth-child(11) a:nth-child(1)")).click();

	}

}
