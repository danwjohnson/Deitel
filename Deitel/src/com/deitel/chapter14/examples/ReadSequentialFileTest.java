// Fig. 14.21: ReadSequntialFile.java
// This program tests class ReadSequentialFile
package com.deitel.chapter14.examples;

public class ReadSequentialFileTest {

	public static void main(String args[]) {
		
		ReadSequentialFile application = new ReadSequentialFile();
		
		application.openFile();
		application.readRecords();
		application.closeFile();
		
	} // end main
	
} // end ReadSequentialFileTest
