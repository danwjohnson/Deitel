// Exercise 10.10 - Square.java
// This class is a representation of a square
package com.deitel.chapter10.exercises;

public class Square extends TwoDimensionalShape{

	
	// constructor
	public Square(int x, int y, int side) {
		
		super(x, y, side, side);
		
	} // end three argument constructor
	
	
	// set the side
	public void setSide(int s) {
		
		setDimension1(s);
		setDimension2(s);
		
	} // end method setSide
	
	
	// get the side
	public int getSide() {
		
		return getDimension1();
		
	} // end method getSide
	
	
	// get the name of the shape
	public String getName() {
		
		return "Square";
		
	} // end method getName
	
	
	// get the area of the square
	public int getArea() {
		
		return getSide() * getSide();
		
	} // end method getArea
	
	
	// String representation of the Square object
	public String toString() {
		
		return String.format( "%s %s: %d\n",
				super.toString(), "side", getSide() );
	
	} // end method toString
	
} // end class Square
