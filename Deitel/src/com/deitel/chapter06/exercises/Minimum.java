// Exercise 6.23: Minimum.java
// This class determines the minimum of 3 floating point numbers
// by using the Math.min function
package com.deitel.chapter06.exercises;

import java.util.Scanner;

public class Minimum {

	
	public double minimum3 ( double num1, double num2, double num3) {
		
		double smallest;
		
		if ( Math.min(num1, num2) == num1)
			smallest = num1;
		else
			smallest = num2;
		
		if (Math.min(smallest, num3)== num3)
			smallest = num3;
		
		return smallest;
		
	} // end method minimum3
	
	
	public void inputNumbers() {
		
		double num1 = 0.0, num2 = 0.0, num3 = 0.0, tmp = 0.0;
		int counter = 1;
		
		Scanner input = new Scanner(System.in);
		
		while (counter <= 3) {
			
			System.out.print("Enter floating point number " + counter + ": ");
			tmp = input.nextDouble();
			
			switch (counter) {
				
				case 1:
					num1 = tmp;
					break;
				case 2:
					num2 = tmp;
					break;
				case 3:
					num3 = tmp;
					break;
				
			} // end switch statement
			
			counter++;
			
		} // end while loop
		
		System.out.printf("The smallest number entered was: %.3f\n"
				, minimum3(num1, num2, num3));
		
	} // end method inputNumbers
	
	
} // end class Minimum
