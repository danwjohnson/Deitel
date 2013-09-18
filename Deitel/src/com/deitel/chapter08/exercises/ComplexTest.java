// Exercise 8.12: ComplexTest.java
// Test the Complex class
package com.deitel.chapter08.exercises;

public class ComplexTest {

	public static void main(String args[]) {
		
		Complex a = new Complex(9.5, 7.7);
		Complex b = new Complex(1.2, 3.1);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println();
		
		System.out.println("a + b = " + a.add(b));
		System.out.println("a - b = " + a.subtract(b));
		
		
	} // end main
	
} // end class ComplexTest
