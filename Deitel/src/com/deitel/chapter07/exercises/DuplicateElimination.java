// Exercise 7.12: DuplicateElimination.java
// This class allows a user to enter 5 numbers between 10 and 100 and
// displays it if it isn't a duplicate and then displays the complete
// set of unique numbers.
package com.deitel.chapter07.exercises;

import java.util.Scanner;

public class DuplicateElimination {

	int array[] = new int[5];
	
	public void eliminateDuplicates(int num) {
		
		boolean saved = false;
		
		for(int counter = 0; counter < array.length; counter++) {
			
			if ( array[counter] == 0 || array[counter] == num) {
			
				if (num != array[counter] ) {
					
					if (!saved) {
						
						array[counter] = num;
						System.out.println("Unique number: "+ num);
						saved = true;
						
					} // end if statement
					
				} 
				else
					saved = true;
				
			} // end if
			
		} // end for loop
		
	} // end method eliminateDuplicates
	
	
	public void enterNumbers() {
		
		int num;
		int counter = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 5 numbers followed by ENTER after each (numbers must be between 10 and 100):");
		
		while (counter < 5) {
			
			num = input.nextInt();
			if (num >= 10 && num <= 100) {
			
				eliminateDuplicates(num);
				counter++;
				
			}
			else
				System.out.println("Number entered is out of range!!!!");
			
		} // end while loop to enter numbers
		
	} // end method enterNumbers
	
	
	public void displayUniques() {
		
		System.out.println("The unique numbers entered are: ");
		
		for ( int counter = 0; counter < array.length; counter++) {
			
			if ( array[counter] != 0) {
				
				System.out.printf("%d ", array[counter]);
				
			} // end if statement
			
		} // end for loop
		
	} // end method displayUniques
	
} // end class DuplicateElimination
