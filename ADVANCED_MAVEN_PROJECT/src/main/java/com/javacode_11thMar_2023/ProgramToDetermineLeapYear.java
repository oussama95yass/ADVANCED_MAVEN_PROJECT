package com.javacode_11thMar_2023;

public class ProgramToDetermineLeapYear {

	public static void main(String[] args) {
		
		int year = 1980;
		
		//how will you prove this year is a leap year or not ?
		
		//1996 is a leap year
		//2000 is a leap year
		
		//The condition to determine a year is leap or not
		
		//1. the year is divisible by 400
		//2. the year is divisible by 4 but not divisible by 100
		
		if(year%4 ==0 && year%100 !=0 || year%400 == 0) {
			System.out.println("year 1980 is a leap year"); 
		}else {
			System.out.println("year is not leap");
		}
		}

	}


