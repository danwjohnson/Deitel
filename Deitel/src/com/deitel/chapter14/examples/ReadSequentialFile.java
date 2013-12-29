// Fig. 14.20: ReadSequentialFile.java
// This program reads a file of objects sequentially 
// and displays each record
package com.deitel.chapter14.examples;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSequentialFile {

	private ObjectInputStream input;
	
	// enable user to open file
	public void openFile() {
		
		try {
			
			input = new ObjectInputStream(
					new FileInputStream("clients.ser"));
			
		} // end try
		catch (IOException ioException) {
			
			System.err.println("Error opening file");
			System.exit(1);
			
		} // end catch
		
	} // end openFile()
	
	
	// read record from file
	public void readRecords() {
		
		// object to be written to screen
		AccountRecordSerializable record;
		
		System.out.printf("%-10s%-12s%-12s%10s\n", "Account",
				"First Name", "Last Name", "Balance");
		
		try {	// read records from file using Scanner object
			
			while (true) {
				
				record = (AccountRecordSerializable) input.readObject();
				
				// display record contents
				System.out.printf("%-10d%-12s%-12s%10.2f\n", 
						record.getAccount(), record.getFirstName(),
						record.getLastName(), record.getBalance());
				
			} // end while loop
			
		} // end try
		catch (EOFException endOfFileException) {
			
			return;		// end of file was reached
			
		} // end catch
		catch ( ClassNotFoundException classNotFoundException) {
			
			System.err.println("Unable to create object");
			
		} // end catch
		catch (IOException ioException) {
			
			System.err.println("Error during read from file.");
			
		} // end catch
		
	} // end readRecords()
	
	
	// close file and terminate application
	public void closeFile() {
		
		try {
			if (input != null)
				input.close();
		} // end try
		catch (IOException ioExcpetion) {
			
			System.err.println("Error closing file.");
			System.exit(1);
			
		} // end catch
		
	} // end closeFile()
	
} // end ReadTextFile class
