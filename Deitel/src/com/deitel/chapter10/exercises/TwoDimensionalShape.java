// Exercise 10.10 - TwoDimensional.java
// This class is a representation of a two dimensional shape
package com.deitel.chapter10.exercises;

public abstract class TwoDimensionalShape extends Shape {

	private int dimension1;
	private int dimension2;
	
	
	public TwoDimensionalShape(int x, int y, int dim1, int dim2) {
		
		super(x,y);
		dimension1 = dim1;
		dimension2 = dim2;
		
	} // end two argument constructor
	
	
	// set dimension 1
	public void setDimension1(int dim1) {
		
		dimension1 = dim1;
		
	} // end method setDimension1
	
	
	// set dimension 2
	public void setDimension2(int dim2){
		
		dimension2 = dim2;
		
	} // end method setDimension2
	
	
	// get dimension1
	public int getDimension1() {
		
		return dimension1;
		
	} // end method getDimension1
	
	
	// get dimension2
	public int getDimension2() {
		
		return dimension2;
		
	} // end method getDimension2
	
	
	// abstract methods
	public abstract int getArea();
	
} // end class TwoDimensionalShape
