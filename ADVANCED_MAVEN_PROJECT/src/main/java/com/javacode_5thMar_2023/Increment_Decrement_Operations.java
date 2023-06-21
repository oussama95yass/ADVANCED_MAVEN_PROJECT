package com.javacode_5thMar_2023;

public class Increment_Decrement_Operations {

	public static void main(String[] args) {
 
		int i = 10; // last value of i is 10
		i++;
		System.out.println(i); 
		int j = i++;
		System.out.println(j);
		System.out.println(i);
		
		j = i++ + i++;
		System.out.println(j);
		System.out.println(i);
		

	}

}
