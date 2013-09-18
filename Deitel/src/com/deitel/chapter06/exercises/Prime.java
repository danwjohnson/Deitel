// Exercise 6.23: Prime.java
// This class determines if an integer is a prime number
package com.deitel.chapter06.exercises;

import java.util.Scanner;

public class Prime {

	public boolean isPrime(int num) {
		
		if ( num % 2 == 0)
			return false;
		
		for (int i = 3; i < num; i++) {
			
			if ( num % i == 0 )
				return false;
			
		} // end of for loop to check the odds
		
		return true;
		
	} // end method isPrime
	
	
	public void displayPrimes(int num) {

		System.out.println("List of primes up to and including " + num);
		
		for ( int i = 1; i <= num; i++){
			
			if (isPrime(i)) {
				
				System.out.println(i);
				
			} // end if
			
		} // end for loop
			
	} // end method displayPrimes
	
	
	public void enterNumber() {
		
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		displayPrimes(num);
		
	} // end method enterNumber
	
} // end class Prime
