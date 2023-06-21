package com.javacode_11thMar_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Browsers {

	public static void main(String[] args) {
	
		String browserName = "edge";
		
		if(browserName.equals("chrome")) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo");
			driver.quit();
		}else if(browserName.equals("firefox")) {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://flipkart.com");
			driver.quit();
		}else if(browserName.equals("edge")) {
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("hppt://amazon.com");
			driver.quit();
		}else {	
		}

	}

}
