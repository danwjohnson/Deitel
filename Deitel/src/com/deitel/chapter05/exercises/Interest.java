package com.deitel.chapter05.exercises;
// Exercise 5.14: Interest.java
// Compound-interest calculations that uses a for loop to calculate multiple
// interest tables with an increasing rate from 5 percent to 10 percent.

public class Interest{ 
	
	public static void main( String args[] ){
		
		double amount; // amount on deposit at end of each year
		double principal = 1000.0; // initial amount before interest


		// display headers
		System.out.printf( "%s%20s \n", "Year", "Amount on deposit" );
		//calculate amount on deposit for each of ten years
		
		for ( int rate = 5; rate <= 10; rate++) {
			
			System.out.println("\nInterest table for a rate of " + rate + " percent");
			
			for ( int year = 1; year <= 10; year++ ){
				
				//calculate new amount for specified year
				amount = principal * Math.pow( 1.0 + (rate * .01), year );
				//display the year and the amount
				System.out.printf( "%4d%,20.2f\n", year, amount );
	
			} // end inner for

		} // end outer for
			
	} // end main

} // end class Interest