// Exercise 10.10 - ShapeTest.java
// This class tests the shape hierarchy
package com.deitel.chapter10.exercises;

public class ShapeTest {

	public static void main (String args[]) {
		
		Shape shapes[] = new Shape[4];
		shapes[0] = new Circle(22, 88, 4);
		shapes[1] = new Square(71, 96, 10);
		shapes[2] = new Sphere(8, 89, 2);
		shapes[3] = new Cube(79, 61, 8);
		
		
		for (Shape currentShape : shapes) {
			
			System.out.printf("%s: %s",
					currentShape.getName(), currentShape);
			
			if (currentShape instanceof TwoDimensionalShape) {
				
				TwoDimensionalShape twoDimensionalShape = 
					(TwoDimensionalShape) currentShape;
				
				System.out.printf("%s's area is %d\n",
						currentShape.getName(), twoDimensionalShape.getArea()); 
			
			} // end if statement
			
			if (currentShape instanceof ThreeDimensionalShape) {
				
				ThreeDimensionalShape threeDimensionalShape =
						(ThreeDimensionalShape) currentShape;
				
				System.out.printf("%s's area is %d\n",
						currentShape.getName(), threeDimensionalShape.getArea());
				System.out.printf("%s's volume is %d\n",
						currentShape.getName(), threeDimensionalShape.getVolume());
				
			} // end if statement
			
			System.out.println();
						
		} // end for loop
		
	} // end main
	
	
} // end class ShapeTest
