// Exercise 7.14: VariableLengthArgs.java
// This class uses variable arguments to pass in numbers to
// method product that calculates the product of the numbers
// that are passed in.
package com.deitel.chapter07.exercises;

public class VariableLengthArgs {

	public int product (int... nums) {
		
		int product = 1;
		
		for ( int i : nums)
			product *= i;
		
		return product;
		
	} // end method product
	
} // end class VariableLengthArgs
