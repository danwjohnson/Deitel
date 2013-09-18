// Exercise 10.10 - Shape.java
// This class is a representation of the superclass Shape
package com.deitel.chapter10.exercises;

public abstract class Shape {

	private int x;		// x coordinate
	private int y;		// y coordinate
	
	public Shape(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	} // end two argument constructor
	
	
	// set the x coordinate
	public void setX(int x) {
		
		this.x = x;
		
	} // end method setX
	
	
	// set the y coordinate
	public void setY(int y) {
		
		this.y = y;
		
	} // end method setY
	
	
	// get the x coordinate
	public int getX() {
		
		return x;
		
	} // end method getX
	
	
	// get the y coordinate
	public int getY() {
		
		return y;
		
	} // end method getY
	
	
	// return String representation of Shape object
	public String toString(){
		
		return String.format( "(%d, %d)", getX(), getY() );
	
	} // end method toString
	
	
	// abstract methods
	public abstract String getName();
	
	
} // end class Shape
