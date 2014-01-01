// Exercise 13.18: Demo2.java
// Program demonstrates that exceptions can be
// caught with the Exception superclass
//
// Because I put all classes in the same package, had to change
// ExceptionA to ExceptionE and ExceptionB to ExceptionF because the
// ExceptionA and ExceptionB have already been defined in class Demo.
package com.deitel.chapter13.exercises;

import java.io.IOException;

public class Demo2 {

	public static void main(String args[]) {
		
		try {
			
			throw new ExceptionE();
			
		} // end try
		catch (Exception exception1) {
			
			System.err.println("Catching ExceptionE with Exception");
			exception1.printStackTrace();
			
		} // end catch
		
		
		try {
			
			throw new ExceptionF();
			
		} // end try
		catch (Exception exception2) {
			
			System.err.println("Catching ExceptionF with Exception");
			exception2.printStackTrace();
			
		} // end catch
		
		
		try {
			
			throw new NullPointerException();
			
		} // end try
		catch (Exception exception3) {
			
			System.err.println("Catching NullPointerException with Exception");
			exception3.printStackTrace();
			
		} // end catch
		
		
		try {
			
			throw new IOException();
			
		} // end try
		catch (Exception exception4) {
			
			System.err.println("Catching IOException with Exception");
			exception4.printStackTrace();
			
		} // end catch
		
	} // end main
	
} // end Demo2 class


class ExceptionE extends Exception {

	private static final long serialVersionUID = 1L;
	
} // end ExceptionA class


class ExceptionF extends ExceptionE {

	private static final long serialVersionUID = 1L;
	
} // end ExceptionB class

