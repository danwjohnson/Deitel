// Exercise 8.12: Complex.java
// This class represents a complex number
package com.deitel.chapter08.exercises;

public class Complex {

	private double real;
	private double imaginary;
	
	
	// constructors
	public Complex() {
		
		this(0.0, 0.0);
		
	} // end no-argument constructor
	
	public Complex ( double r, double i) {
		
		real = r;
		imaginary = i;
		
	} // end two-argument constructor
	
	// add two Complex numbers
	public Complex add ( Complex right) {
		
		return new Complex(real + right.real,
				imaginary + right.imaginary);
		
	} // end method add
	
	
	// subtract two Complex numbers
	public Complex subtract(Complex right) {
		
		return new Complex(real - right.real,
				imaginary - right.imaginary);
		
	} // end method subtract
	
	
	// String representation of the Complex class
	public String toString() {
		
		return String.format("(%.1f, %.1f)", real, imaginary);
		
	} // end method toString
	
} // end class Complex
