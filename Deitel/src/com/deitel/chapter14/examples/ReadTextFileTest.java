// Fig. 14.12: ReadTextFileTest.java
// This program test class ReadTextFile
package com.deitel.chapter14.examples;

public class ReadTextFileTest {

	public static void main(String args[]) {
		
		ReadTextFile application = new ReadTextFile();
		
		application.openFile();
		application.readRecords();
		application.closeFile();
		
	} // end main
	
} // end ReadTextFileTest class
