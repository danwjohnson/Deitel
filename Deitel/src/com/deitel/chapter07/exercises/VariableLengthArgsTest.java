// Exercise 7.14: VariableLengthArgsTest.java
// Test the VariableLengthArgs class
package com.deitel.chapter07.exercises;

public class VariableLengthArgsTest {

	public static void main(String args[]) {
		
		VariableLengthArgs application = new VariableLengthArgs();
		System.out.println("The product of 1 2 3 4 5 is: " 
				+ application.product(1,2,3,4,5) );
		System.out.println("The product of 2 4 is: " 
				+ application.product(2,4));
		
	} // end main
	
} // end class VariableLengthArgsTest
