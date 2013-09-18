// Fig. 7.13: PassArray.java
// Passing arrays and individual array elements to methods
package com.deitel.chapter07.examples;

public class PassArray {

	public static void main(String args[]) {
		
		int array[] = { 1, 2, 3, 4, 5 };
		
		System.out.println(
				"\n\nEffects of passing reference to entire array: \n" +
				"The values of the original array are:" );
		
		// output original array element
		for (int value : array)
			System.out.printf("   %d", value );
		
		modifyArray(array);			// pass array reference
		System.out.println("\n\nThe values of the modified array are: " );
		
		// output modified array elements
		for (int value : array)
			System.out.printf("   %d", value );
		
		System.out.printf(
				"\n\nEffects of passing array element value:\n" +
				"array[3] before modifyElement: %d\n", array[3]);
		
		modifyElement(array[3]);	// attempt to modify array[3]
		System.out.printf(
				"array[3] after modifyElement: %d\n", array[3]);
		
	} // end main
	
	
	// multiply each element of an array by 2
	public static void modifyArray( int array2[]) {
		
		for (int counter = 0; counter < array2.length; counter++)
			array2[counter] *= 2;
		
	} // end method modifyArray
	
	
	// multiply argument by 2
	public static void modifyElement(int element) {
		
		element *= 2;
		System.out.printf(
				"Value of element in modifyElement: %d\n", element );
		
	} // end method modifyElement
	
} // end class PassArray
