// Exercise: 5.15 Pattern.java
// This class uses several for loops to print patterns of asterisks.
package com.deitel.chapter05.exercises;

public class Patterns {

	public static void main (String args[]) {
		
		// first pattern
		for (int i = 1; i <= 10; i++ ) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print('*');
				
			} // end inner for
			
			System.out.println();
			
		} // end outer for
		
		System.out.println();
		
		// second pattern
		for (int i = 10; i>=1; i--) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print('*');
				
			} // end inner for
			
			System.out.println();
			
		} // end outer for
		
		
		// third pattern
		for (int i = 10; i>=1; i--) {
			
			for (int j = 1; j <= i; j++) {
				
				for (int k = j; k >= i; k-- ) {
					
					System.out.print(' ');
					
				}
				
				System.out.print('*');
				
			} // end inner for
			
			System.out.println();
			
		} // end outer for
		
	} // end main
	
} // end Patterns class
