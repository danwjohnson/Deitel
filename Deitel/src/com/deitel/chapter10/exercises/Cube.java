// Exercise 10.10 - Cube.java
// This class is a representation of a cube shape
package com.deitel.chapter10.exercises;

public class Cube extends ThreeDimensionalShape {

	
	// three argument constructor
	public Cube(int x, int y, int side) {
		
		super(x, y, side, side, side);
		
	} // end three argument constructor
	
	
	// set the side
	public void setSide(int side) {
		
		setDimension1(side);
		setDimension2(side);
		setDimension3(side);
		
	} // end method setSide
	
	
	// get the side
	public int getSide() {
		
		return getDimension1();
		
	} // end method getSide
	
	
	// get the area of a cube
	public int getArea() {
		
		return 6 * (getSide() * getSide());
		
	} // end method getArea
	
	
	// get the volume of the cube
	public int getVolume() {
		
		return getSide() * getSide() * getSide();
		
	} // end method getVolume
	
	
	// get the name of the shape
	public String getName() {
		
		return "Cube";
		
	} // end method getName
	
	
	// String representation of the Cube object
	public String toString() {
		
		return String.format( "%s %s: %d\n",
				super.toString(), "side", getSide() );
	
	} // end method toString
	
} // end class Cube
