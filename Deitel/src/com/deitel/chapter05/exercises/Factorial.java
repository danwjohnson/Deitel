// Exercise: 5.13 Factorial.java
// This class calculates the factorial of the integers from
// 1 to 5 and display them in tabular form.
package com.deitel.chapter05.exercises;

public class Factorial {

	public static void main (String args[]) {
		
		int counter;
		int innerCounter;
		int factorial = 1;
		
		
		System.out.printf("Integer\tFactorial\n");
		System.out.printf("-------\t---------\n");
		
		for (counter = 1; counter <= 5; counter++) {
			
			for (innerCounter = 1; innerCounter <= counter; innerCounter++) {
				
				factorial = factorial * innerCounter;
				
			}
			
			System.out.printf("   %d   \t    %d\n", counter, factorial);
			
			factorial = 1;
			
		}
		
	} // end main 
	
} // end Factorial class
