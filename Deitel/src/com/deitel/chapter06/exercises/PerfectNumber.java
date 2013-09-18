// Exercise 6.24: PerfectNumber.java
// This class calculates all the perfect numbers within
// a range entered by the user.
package com.deitel.chapter06.exercises;

import java.util.Scanner;

public class PerfectNumber {

	public boolean perfect ( int number ) {
		
		int sum = 0;
		
		for (int counter = 1; counter < number; counter++) {
				
			if( number % counter == 0 )
				
				sum += counter;
			
		} // end out for
		
		if (sum == number)
			return true;
		else
			return false;
		
	} // end method perfect
	
	
	public void listPerfects(int number) {
		
		System.out.println("The list of perfect numbers up to " + number);
		
		for ( int counter = 1; counter <= number; counter++) {
			
			if (perfect(counter))
				System.out.println(counter);
			
		} // end for loop
		
	} // end method listPerfects
	
	
	public void inputNumber() {
		
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number you wish to go to: ");
		
		number = input.nextInt();
		
		listPerfects(number);
		
	} // end inputNumber method
	
} // end class PerfectMethod
