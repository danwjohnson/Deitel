// Fig. 13.2: DivideByZeroWithExceptionHandling.java
// An exception-handling example that checks for divide-by zero.
package com.deitel.chapter13.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

	// demonstrate throwing an exception when a divide by zero occurs
	public static int quotient(int numerator, int denominator) 
		throws ArithmeticException {
		
		return numerator / denominator;
		
	} // end method quotient
	
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);	// scanner for input
		boolean continueLoop = true;		// determines if more input is needed
	  	
		do {
			
			try {			// read two numbers and calculate quotient
				
				System.out.print("Please enter an integer numerator: ");
				int numerator = scanner.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = scanner.nextInt();
				
				int result = quotient(numerator, denominator);
				System.out.printf("\nResult: %d / %d = %d\n", numerator,
						denominator, result);
				continueLoop = false;
				
			} // end try
			catch (InputMismatchException inputMismatchException) {
				
				System.err.printf("\nException: %s\n", 
						inputMismatchException);
				scanner.nextLine();		// discard input so user can try again
				System.out.println(
						"You must enter integers.  Please try again.\n");
				
			} // end catch
			catch (ArithmeticException arithmeticException) {
				
				System.err.printf("\nException: %s\n", arithmeticException);
				System.out.println(
						"Zero is an invalid denominator.  Please try again.\n");
				
			} // end catch
			
		} while (continueLoop);				// end do...while
		
	} // end main
	
} // end class DivideByZeroWithExceptionHandling
