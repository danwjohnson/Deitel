// Exercise 10.10 - Sphere.java
// This class is a representation of a sphere shape
package com.deitel.chapter10.exercises;

public class Sphere extends ThreeDimensionalShape{

	
	// three argument constructor
	public Sphere(int x, int y, int radius) {
		
		super(x, y, radius, radius, radius);
		
	} // end constructor
	
	
	// set the radius
	public void setRadius(int r) {
		
		setDimension1(r);
		setDimension2(r);
		setDimension3(r);
		
	} // end method setRadius
	
	
	// get the radius
	public int getRadius() {
		
		return getDimension1();
		
	} // end method getRadius
	
	
	// get the name of the Shape
	public String getName() {
		
		return "Sphere";
		
	} // end method getShape
	
	
	// get the area of the sphere
	public int getArea() {
		
		return (int) ((4 * Math.PI) * (getRadius() * getRadius()));
		
	} // end method getArea
	
	
	// get the volume of the sphere
	public int getVolume() {
		
		return (int) (4.0/3.0 * Math.PI * getRadius() * getRadius() * getRadius());
		
	} // end method getVolume
	
	
	// String representation of a Sphere object
	public String toString() {
	
		return String.format( "%s %s: %d\n",
				super.toString(), "radius", getRadius() );
		
	} // end method toString
	
} // end class Sphere
