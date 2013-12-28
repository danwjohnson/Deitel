// Fig. 14.9: CreateTextFileTest.java
// Testing the CreateTextFile class
package com.deitel.chapter14.examples;

public class CreateTextFileTest {

	public static void main(String args[]) {
		
		CreateTextFile application = new CreateTextFile();
		
		application.openFile();
		application.addRecords();
		application.closeFile();
		
	} // end main
	
} // end CreateTextFileTest class
