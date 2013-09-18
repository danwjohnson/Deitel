// Fig. 7.2: InitArray.java
// Fig. 7.3: InitArray.java
// Fig. 7.4: InitArray.java
// Creating an array
package com.deitel.chapter07.examples;

public class InitArray {

	public static void main(String args[]) {
		
		// int array[];				// declare array named array
		
		// array = new int[10];		// create the space for the array
		
		// initializer list specifies the value for each element
		int total = 0;
		int array[] = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		System.out.printf("%s%8s\n", "Index", "Value");	// Column headings
		
		// output each array element's value
		for (int counter = 0; counter < array.length; counter++) {
			
			System.out.printf("%5d%8d\n", counter, array[counter]);
			total += array[counter];
			
		} // end for loop
		
		System.out.printf("\nTotal of array elements: %d\n", total);
		
	} // end main
	
} // end class InitArray
