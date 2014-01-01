// Exercise 13.20: SomeException.java
// Program demonstrates throwing an exception
// within a constructor and handling that exception.
package com.deitel.chapter13.exercises;

public class SomeException {

	public SomeException() {
		
		try {
			
			throw new Exception();
			
		} // end try
		catch(Exception exception) {
			
			System.err.println("Catching an exception in the constructor");
			exception.printStackTrace();
			
		} // end catch
		
	} // end constructor
	
	
	
	public static void main(String args[]) {
		
		@SuppressWarnings("unused")
		SomeException someException = new SomeException();
		
	} // end main
	
} // end SomeException class
