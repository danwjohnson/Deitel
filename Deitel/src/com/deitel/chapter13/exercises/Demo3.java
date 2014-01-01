// Exercise 13.19: Demo3.java
// Program demonstrates that the order of catch blocks
// matter.   Trying to catch the superclass of an
// Exception class before the sub class should cause a 
// compiler error.
//
// Commented out the bad catch to clean up compiler error.
// 
// ExceptionA and ExceptionB classes are defined in class Demo
package com.deitel.chapter13.exercises;

public class Demo3 {

	public static void main(String args[]) {
		
		try {
			
			throw new ExceptionC();
			
		} // end try
		catch(ExceptionA exception1) {
			
			System.err.println("Catching exceptionC with ExceptionA in catch block");
			exception1.printStackTrace();
			
		} // end catch
//		catch(ExceptionB exception2) {
//			
//			// trying to catch subclass ExceptionB after superclass ExceptionA
//			
//		}
		
		
		try {
			
			throw new ExceptionB();
			
		} // end try
		catch(ExceptionB exception2) {
			
			System.err.println("Catching exceptionB with ExceptionA in catch block");
			exception2.printStackTrace();
			
		} // end catch
		
		
	} // end main
	
	
} // end Demo class
