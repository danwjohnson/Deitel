// Exercise 13.17: Demo.java
// Program demonstrates that the exception
// superclass will catch the subclass exceptions.
package com.deitel.chapter13.exercises;

public class Demo {

	public static void main(String args[]) {
		
		try {
			
			throw new ExceptionC();
			
		} // end try
		catch(ExceptionA exception1) {
			
			System.err.println("Catching exceptionC with ExceptionA in catch block");
			exception1.printStackTrace();
			
		} // end catch
		
		
		try {
			
			throw new ExceptionB();
			
		} // end try
		catch(ExceptionB exception2) {
			
			System.err.println("Catching exceptionB with ExceptionA in catch block");
			exception2.printStackTrace();
			
		} // end catch
		
		
	} // end main
	
	
} // end Demo class

class ExceptionA extends Exception {

	private static final long serialVersionUID = 1L;
	
} // end ExceptionA class

class ExceptionB extends ExceptionA {

	private static final long serialVersionUID = 1L;
	
} // end ExceptionB class

class ExceptionC extends ExceptionB {

	private static final long serialVersionUID = 1L;
	
} // end ExceptionC class