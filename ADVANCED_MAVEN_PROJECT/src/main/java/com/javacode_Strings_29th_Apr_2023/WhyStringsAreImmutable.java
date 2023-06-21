package com.javacode_Strings_29th_Apr_2023;

public class WhyStringsAreImmutable {
	
	        //Immutability concept is used for String Objects
			//String object are immutable that's mean not changeable
			//Once String objects are created, it's data or state cannot be changed
			
			//So basically what happens is - if we try to change the state of the String Object,
			//instead of changing it, we will create another Object

	public static void main(String[] args) {
		
		String S = new String("Apple");
		S.concat("Macbook"); //only trying to modify the object
		System.out.println(S); //AppleMacbook
		
		S = S.concat("iPhone");//here you are modifying the object as well as the pointing the reference to the new object
		
		System.out.println(S);
		
		String state1 = "Virginia";
		String state2 = "Virginia";
		String state3 = "Virginia";
		String state4 = "Virginia";
		String state5 = "Virginia";
		
		
		//String state30 = "Virginia";
		
		String state30 = "Maryland";
		
		String state50 = "Virginia";
		
		
	}

}
