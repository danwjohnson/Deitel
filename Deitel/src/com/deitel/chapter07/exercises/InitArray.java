// Exercise 7.15: InitArray.java
// Creating an array
package com.deitel.chapter07.exercises;

public class InitArray {

	public static void main(String args[]) {
		
		int array[];			// declare array-named array
		int index = Integer.parseInt(args[0]);
		
		array = new int[index];	// create the space for array
		
		System.out.printf("%s%8s\n", "Index", "Value");	// column headings
		
		// output each array element's value
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d\n", counter, array[counter] );
		
	} // end main
	
} // end class InitArray
