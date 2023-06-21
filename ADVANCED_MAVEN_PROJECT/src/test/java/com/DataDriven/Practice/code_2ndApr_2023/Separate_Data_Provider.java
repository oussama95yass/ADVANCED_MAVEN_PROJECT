package com.DataDriven.Practice.code_2ndApr_2023;

import org.testng.annotations.DataProvider;

public class Separate_Data_Provider {

	
	@DataProvider(name = "dataForTN")
	public Object[][] getNinjaData(){
		
		Object[][]data = {{"seleniumpanda@gmail.com","Selenium@123"},
				          {"seleniumpanda1@gmail.com","Selenium@123"},
				          {"seleniumpanda2@gmail.com","Selenium@123"},
				          {"seleniumpanda845@gmail.com","Selenium@123"}};
		
		return data;
}
	
	@DataProvider(name = "dataForRediff")
	public Object[][] getRediffData(){
		
		Object[][]data = {{"seleniumpanda@rediffmail.com","Selenium@123"},
				          {"seleniumpanda1@rediffmail.com","Selenium@123"},
				          {"seleniumpanda2@rediffmail.com","Selenium@123"},
				          {"seleniumpanda23@rediffmail.com","Selenium@123"}};
	 
		return data;
	}
	
}
