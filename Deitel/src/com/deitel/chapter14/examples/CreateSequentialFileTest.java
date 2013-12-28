// Fig. 14.19: CreateSequentialFile.java
// Writing objects sequentially to a file with class ObjectOutputStream
package com.deitel.chapter14.examples;

public class CreateSequentialFileTest {

	public static void main (String args[]) {
		
		CreateSequentialFile application = new CreateSequentialFile();
		
		application.openFile();
		application.addRecords();
		application.closeFile();
		
	} // end main
	
} // end CreateSequentialFileTest class
