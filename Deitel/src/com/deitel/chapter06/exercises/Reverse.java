// Exercise 6.26: Reverse.java
// This class reverses the integer
package com.deitel.chapter06.exercises;

import java.util.Scanner;

public class Reverse {

	public int reverseNumber(int num) {
		
		int reversedNumber = 0;
		
		while (num != 0) {
			
			reversedNumber = reversedNumber * 10 + num % 10;
			num /= 10;
			
		} // end while loop
		
		return reversedNumber;
		
	} // end method reversedNumber
	
	
	public void enterNumber() {
		
		int num;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		num = input.nextInt();
		
		System.out.println("The reverse of the number is: " + reverseNumber(num));
		
	} // end method enterNumber
	
} // end class Reverse
