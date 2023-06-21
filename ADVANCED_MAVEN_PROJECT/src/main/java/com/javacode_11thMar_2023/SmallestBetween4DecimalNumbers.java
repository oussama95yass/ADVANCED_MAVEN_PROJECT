package com.javacode_11thMar_2023;

public class SmallestBetween4DecimalNumbers {

	public static void main(String[] args) {
		
    double a = 1.1;
    double b = 1.3;
    double c = 3.7;
    double d = 2;
    
    if(a<b && a<c && a<d) {
    	System.out.println("a is smaller:" + a);
    }else if(b<a && b<c && b<d) {
    	System.out.println("b is smaller:" + b);
    }else if(c<a && c<b && c<d) {
    	System.out.println("c is smaller:" + c);
    }else if(d<a && d<b && d<c) {
    	System.out.println("d is smaller:" + d);
    }
	}

}


