// Exercise 6.22: TempConversion.java
// This class converts the temperature in fahrenheit to celsius and
// the temperature in celsius to fahrenheit
package com.deitel.chapter06.exercises;

import java.util.Scanner;

public class TempConversion {

	public double celsius (double fahrenheit) {
		
		return 5.0 / 9.0 * (fahrenheit - 32 );
		
	} // end method celsius
	
	
	public double fahrenheit(double celsius) {
		
		return 9.0 / 5.0 * celsius + 32;
		
	} // end method fahrenheit
	
	
	public void menu() {
		
		int choice;
		double temp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the temperature conversion application");
		System.out.println("Please choose the temperature you wish to convert to: ");
		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2. Celsius to Fahrenheit");
		System.out.println();
		
		choice = input.nextInt();
		
		while (choice < 1 || choice > 2) {
			
			System.out.print("Invalid choice, please choose 1 or 2: ");
			choice = input.nextInt();
			
		} // end of while loop to make sure user isn't stupid
		
		if ( choice == 1 ) {
			
			System.out.print("Please enter the temperature in F: ");
			temp = input.nextDouble();
			System.out.printf("Fahrenheit temperature: %.1f is %.1f in Celsius."
					, temp, celsius(temp));
			
		} else {
			
			System.out.print("Please enter the temperature in C: ");
			temp = input.nextDouble();
			System.out.printf("Celsius temperature: %.1f is %.1f in Fahrenheit."
					, temp, fahrenheit(temp));
			
		} // end else/if
		
	} // end method menu
	
} // end class TempConversion
