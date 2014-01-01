// Exercise 13.21: Demo4.java
// Program demonstrates re-throwing an exception.
package com.deitel.chapter13.exercises;

public class Demo4 {

	public static void main(String args[]) {
		
		try {
			
			someMethod();
			
		} // end try
		catch (Exception exception) {
			
			System.err.printf( "%s\n\n", exception.getMessage() );
			exception.printStackTrace();
			
		} // end catch
		
	} // end main
	
	
	public static void someMethod() throws Exception {
		
		try {
			
			someMethod2();
			
		} // end try
		catch(Exception exception2) {
			
			throw exception2;
			
		} // end catch
		
	} // end someMethod()
	
	
	public static void someMethod2() throws Exception {
		
		throw new Exception("Exception thrown in someMethod2()");
		
	} // end someMethod2()
	
} // end Demo4
