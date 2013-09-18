// Exercise 10.10 - ThreeDimensional.java
// This class is a representation of a three dimensional shape
package com.deitel.chapter10.exercises;

public abstract class ThreeDimensionalShape extends Shape {

	private int dimension1;
	private int dimension2;
	private int dimension3;
	
	public ThreeDimensionalShape(int x, int y, 
			int dim1, int dim2, int dim3) {
		
		super(x, y);
		dimension1 = dim1;
		dimension2 = dim2;
		dimension3 = dim3;
		
	} // end constructor
	
	
	// set dimension 1
	public void setDimension1(int dim1) {
		
		dimension1 = dim1;
		
	} // end method setDimension1
	
	
	// set dimension 2
	public void setDimension2(int dim2) {
		
		dimension2 = dim2;
		
	} // end method setDimension2
	
	
	// set dimension 3
	public void setDimension3(int dim3) {
		
		dimension3 = dim3;
		
	} // end method setDimension3
	
	
	// get dimension1
	public int getDimension1() {
		
		return dimension1;
		
	} // end method getDimension1
	
	
	// get dimension 2
	public int getDimension2() {
		
		return dimension2;
		
	} // end method getDimension 2
	
	
	// get dimension 3
	public int getDimension3() {
		
		return dimension3;
		
	} // end method getDimension3
	
	
	// abstract methods
	public abstract int getArea();
	public abstract int getVolume();
	
} // end class ThreeDimensionalShape
