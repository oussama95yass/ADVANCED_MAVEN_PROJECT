package com.testngcode_9htApr_2023;

import org.testng.annotations.DataProvider;

public class DataProvider_TN {

	@DataProvider(name = "TN" , parallel = true)
	public Object[][] getData() {
		Object[][] data = {{"seleniumpanda@gmail.com", "Selenium@123" },
				            {"seleniumpanda1@gmail.com", "Selenium@123" },
				            {"seleniumpanda2@gmail.com", "Selenium@123" }};
				            
		
		   return data;
		}
	
}
