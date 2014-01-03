package com.deitel.chapter14.exercises;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFiles {

	private Formatter output;	// object used to output text to file
	
	public void openFile(int type) {
		
		String fileName = "";
		
		try {
			
			if (type == 1) {
				
				fileName = "oldmast.txt";
				output = new Formatter("oldmast.txt");
				
			}				
			else{
				
				fileName = "trans.txt";
				output = new Formatter("trans.txt");
			
			}
			
		} // end try
		catch(SecurityException securityException) {
			
			System.err.println("You are not authorized to access " + fileName);
			securityException.printStackTrace();
			System.exit(1);
			
		}// end catch
		catch(FileNotFoundException fileNotFoundException) {
			
			System.err.println("Error creating file " + fileName);
			fileNotFoundException.printStackTrace();
			System.exit(1);
			
		} // end catch
		
	} // end method open file
	
	
	public void addMasterRecords() {
		
		// object to be written to file
		AccountRecord acctRecord = new AccountRecord();
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s\n%s\n%s\n%s\n\n",
				"To terminate input, type the end-of-file indicator ",
				"when you are prompted to enter input.",
				"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				"On Windows tyoe <ctrl> z then press Enter");
		
		System.out.printf("%s\n%s",
				"Enter account number (>0), first name, last name and balace.",
				"? " );
		
		while(input.hasNext()) {
			
			try {
				
				acctRecord.setAccount(input.nextInt());
				acctRecord.setFirstName(input.next());
				acctRecord.setLastName(input.next());
				acctRecord.setBalance(input.nextDouble());
				
				if (acctRecord.getAccount() > 0) {
					
					output.format("%d %s %s %.2f\n", acctRecord.getAccount(),
							acctRecord.getFirstName(), acctRecord.getLastName(),
							acctRecord.getBalance());
					
				} // end if
				else {
					
					System.out.println("Account number must be greater than 0.");
					
				}
				
			} // end try
			catch(FormatterClosedException formatterClosedException) {
				
				System.err.println("Error writing to account master file.");
				formatterClosedException.printStackTrace();
				return;
				
			} // end catch
			catch(NoSuchElementException elementException) {
				
				System.err.println("Invalid input.  Please try again");
				input.nextLine();
				
			} // end catch
			
			System.out.printf("%s %s\n%s", "Enter account number (>0),",
					"first name, last name and balance.", "? ");
			
		} // end while
		
	}  // end addMasterRecords()
	
	
	public void addTransRecords() {
		
		// object to be written
		TransactionRecord transRecord = new TransactionRecord();
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s\n%s\n%s\n%s\n\n",
				"To terminate input, type the end-of-file indicator ",
				"when you are prompted to enter input.",
				"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				"On Windows tyoe <ctrl> z then press Enter");
		
		System.out.printf("%s\n%s",
				"Enter account number (>0) and transaction amount",
				"? " );
		
		while(input.hasNext()) {
			
			try {
				
				transRecord.setAccount(input.nextInt());
				transRecord.setAmount(input.nextDouble());
				
				if (transRecord.getAccount() > 0) {
					
					// write the transaction record
					output.format("%d %.2f\n", transRecord.getAccount(),
							transRecord.getAmount());
					
				} // end if
				else {
					
					System.out.println("Account number must be greater than 0." );
					
				} // end else
				
			} // end try
			catch(FormatterClosedException formatterClosedException) {
				
				System.err.println("Error writing to account master file.");
				formatterClosedException.printStackTrace();
				return;
				
			} // end catch
			catch(NoSuchElementException elementException) {
				
				System.err.println("Invalid input.  Please try again");
				input.nextLine();
				
			} // end catch
				
			System.out.printf("%s\n%s",
					"Enter account number (>0) and transaction amount",
					"? " );
			
		} // end while loop
		
	} // end addTransRecords()
	
	public void closeFile() {
		
		if (output != null)
			output.close();
		
	} // end closeFile()
	
} // end CreateTextFiles class
