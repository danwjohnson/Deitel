// Exercise
package com.deitel.chapter14.exercises;

public class CreateTextFilesTest {

	public static void main(String args[]) {
		
		CreateTextFiles application = new CreateTextFiles();
		
		// add records to the master file
//		application.openFile(1);
//		application.addMasterRecords();
//		application.closeFile();
		
		// add records to the transaction file
		application.openFile(2);
		application.addTransRecords();
		application.closeFile();
		
	} // end main
	
}
