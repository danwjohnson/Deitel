// Exercise: 5.12 OddProduct.java
// This class calculates the product of the odd integers from 1 to 15
package com.deitel.chapter05.exercises;

public class OddProduct {

	public static void main(String args[]) {
		
		int counter;
		int product = 1;
		
		for (counter = 1; counter <= 15; counter+=2)
			product = product * counter;
			
		System.out.println("The product of the odd integers from 1 to 15 is: " + product);
		
	} // end main
	
} // end OddProduct class
