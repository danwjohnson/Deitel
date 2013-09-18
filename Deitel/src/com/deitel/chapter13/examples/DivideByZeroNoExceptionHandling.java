// Fig. 13.1: DivideByZeroNoExceptionHandling.java
// An application that attempts to divide by zero
package com.deitel.chapter13.examples;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {

	public static int quotient(int numerator, int denominator) {
		
		return numerator/denominator;	// possible division by zero
		
	} // end method quotient
	
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter an integer numerator: " );
		int numerator = scanner.nextInt();
		System.out.print("Please enter an integer denominator: ");
		int denominator = scanner.nextInt();
		
		int result = quotient(numerator, denominator);
		System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
		
	} // end main
	
} // end class DivideByZeroNoExceptionHandling
