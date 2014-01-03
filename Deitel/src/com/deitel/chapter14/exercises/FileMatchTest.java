// Exercise 14.8: FileMatchTest.java
// Tests FileMath program.
package com.deitel.chapter14.exercises;

public class FileMatchTest {

	public static void main(String args[]) {
		
		FileMatch application = new FileMatch();
		
		application.openFiles();
		application.processFiles();
		application.closeFiles();
		
	} // end main
	
} // end FileMatchTest class
