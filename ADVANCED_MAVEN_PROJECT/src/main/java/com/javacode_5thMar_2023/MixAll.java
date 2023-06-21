package com.javacode_5thMar_2023;

public class MixAll {

	public static void main(String[] args) {
	    System.out.println();//1
		int i = 1;
		System.out.println();
		int j = --i;
		int k = i++ + --i + i++;
		int l = j++ + ++k + --i - i--;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
