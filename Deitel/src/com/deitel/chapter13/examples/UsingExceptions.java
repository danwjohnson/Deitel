// Fig. 13.5: UsingExceptions.java
// Demonstration of the try...catch...finally exception handling
// mechanism
package com.deitel.chapter13.examples;

public class UsingExceptions {

	public static void main(String args[]) {
		
		try {
		
			throwException();			// call method throwException
		
		}// end try
		catch (Exception exception) {	// exception thrown to throwExcpetion
			
			System.err.println("Exception handled in main");
			
		} // end catch
		
		doesNotThrowException();
		
	} // end main
	
	
	// demonstrate try...catch...finally
	public static void throwException() throws Exception {
		
		try {		// throw an exception and immediately catch it
			
			System.out.println("Method thowException");
			throw new Exception();		// generate exception
			
		} // end try
		catch (Exception exception) {	// catch exception thrown in try
			
			System.err.println(
					"Exception handled in method throwException");
			throw exception;			// re-throw for further processing
			
			// any code here would not be reached
			
		} // end catch
		finally {	// execute regardless of what occurs in try...catch
			
			System.err.println("Finally executed in throwException");
			
		} // end finally
		
		// any code here would not be reached, exception re-thrown in catch
		
	} // end method throwException
	
	
	
	// demonstrate finally when no exception occurs
	public static void doesNotThrowException() {
		
		try {			// try block does not throw an exception
			
			System.out.println("Method doesNotThrowException");
			
		} // end try
		catch (Exception exception) {	// does not execute
			
			System.err.println(exception);
			
		} // end catch
		finally {		// executes regardless of what occurs in try...catch
			
			System.err.println(
					"Finally executed in doesNotThrowException");
			
		} // end finally
		
		System.out.println("End of method doesNotThrowException");
		
	} // end method doesNotThrowException
	
} // end class UsingExceptions