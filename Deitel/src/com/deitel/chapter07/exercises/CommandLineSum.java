// Exercise 7.16: CommandLineSum.java
// This class takes in two command-line arguments and
// sums them using the enhanced for statement
package com.deitel.chapter07.exercises;

public class CommandLineSum {

	public static void main(String args[]) {
		
		double sum = 0;
		
		for (String num : args)
			sum += Double.parseDouble(num);
		
		System.out.println("The sum is: " + sum);
		
	} // end main
	
} // end class CommandLineSum
