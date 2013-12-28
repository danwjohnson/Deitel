// Fig. 14.11: ReadTextFile.java
// This program reads a text file and displays each record
package com.deitel.chapter14.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {

	private Scanner input;
	
	// enable user to open file
	public void openFile() {
		
		try {
			
			input = new Scanner(new File("clients.txt"));
			
		} // end try
		catch (FileNotFoundException fileNotFoundException) {
			
			System.err.println("Error opening file");
			System.exit(1);
			
		} // end catch
		
	} // end openFile()
	
	
	// read record from file
	public void readRecords() {
		
		// object to be written to screen
		AccountRecord record = new AccountRecord();
		
		System.out.printf("%-10s%-12s%-12s%10s\n", "Account",
				"First Name", "Last Name", "Balance");
		
		try {	// read records from file using Scanner object
			
			while (input.hasNext()) {
				
				record.setAccount(input.nextInt());
				record.setFirstName(input.next());
				record.setLastName(input.next());
				record.setBalance(input.nextDouble());
				
				// display record contents
				System.out.printf("%-10d%-12s%-12s%10.2f\n", 
						record.getAccount(), record.getFirstName(),
						record.getLastName(), record.getBalance());
				
			} // end while loop
			
		} // end try
		catch (NoSuchElementException elementException) {
			
			System.err.println("File improperly formed.");
			input.close();
			System.exit(1);
			
		} // end catch
		catch (IllegalStateException stateException) {
			
			System.err.println("Error reading from file.");
			System.exit(1);
			
		} // end catch
		
	} // end readRecords()
	
	
	// close file and terminate application
	public void closeFile() {
		
		if (input != null)
			input.close();
		
	} // end closeFile()
	
} // end ReadTextFile class
