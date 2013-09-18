// Exercise 6.21: Division.java
// This class determines the integer part of the quotient and the remainder part
package com.deitel.chapter06.exercises;

import java.util.Scanner;

public class Division {

	// determine the quotient of 2 integers
	public int quotient(int a, int b) {
		
		return a / b;
		
	} // end method quotient
	
	
	// determine the remainder of 2 integers
	public int remainder(int a, int b) {
		
		return a % b;
		
	} // end method remainder
	
	
	// display the digits of a integer
	public void displayDigits(int num) {
		
		int reversedNum = 0;
		
		while ( num != 0 ) {
			
			reversedNum = reversedNum * 10 + num % 10;
			num /= 10;
			
		}
		
		while ( reversedNum > 0) {
			
			System.out.print(remainder(reversedNum,10) + " ");
			reversedNum = quotient(reversedNum, 10);
			
		} // end while loop
		
	} // end method displayDigits
	
	
	// ask user to input an integer
	public void inputInteger() {
		
		int inputInt;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		inputInt = input.nextInt();
		
		System.out.print("The digits of the integer are: ");
		displayDigits(inputInt);
		System.out.println();
		
	} // end method inputInteger
	
} // end class Division
