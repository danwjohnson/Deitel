// Exercise 10.10 - Circle.java
// This class is a representation of a circle shape
package com.deitel.chapter10.exercises;

public class Circle extends TwoDimensionalShape {
	
	// constructor
	public Circle(int x, int y, int radius) {
		
		super(x, y, radius, radius);
		
	} // end three argument constructor
	
	
	// set the radius
	public void setRadius(int radius) {
		
		setDimension1(radius);
		setDimension2(radius);
		
	} // end method setRadius
	
	
	// get the radius
	public int getRadius() {
		
		return getDimension1();
		
	} // end method getDimension1
	
	
	// get the shape's name
	public String getName() {
		
		return "Circle";
		
	} // end method getName
	
	
	public int getArea() {
		
		return (int) (Math.PI * (getRadius() * getRadius()));
		
	} // end method getArea
	
	
	// String representation of the Circle object
	public String toString() {
		
		return String.format( "%s %s: %d\n",
				super.toString(), "radius", getRadius() );
	
	} // end method toString
	
} // end class Circle
