// Fig. 14.6: AccountRecord.java
// A class that represents one record of information
package com.deitel.chapter14.examples;

public class AccountRecord {

	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	
	// no-argument constructor calls other constructor with default values
	public AccountRecord() {
		
		this(0, "", "", 0.0);		// call other four-argument constructor
		
	} // end no-argument constructor
	
	
	// initialize a record
	public AccountRecord(int acct, String first, String last, double bal) {
		
		setAccount(acct);
		setFirstName(first);
		setLastName(last);
		setBalance(bal);
		
	} // end four-argument constructor
	
	
	// set account number
	public void setAccount(int acct) {
		
		account = acct;
		
	} // end setAccount()
	
	
	// set first name
	public void setFirstName(String first) {
		
		firstName = first;
		
	} // end setFirstName()
	
	
	// set last name
	public void setLastName(String last) {
		
		lastName = last;
		
	} // end setLastName()
	
	
	// set balance
	public void setBalance(double bal) {
		
		balance = bal;
		
	} // end setBalance()
	
	
	// get account
	public int getAccount() {
		
		return account;
	
	} // end getAccount()
	
	
	// get first name
	public String getFirstName() {
		
		return firstName;
		
	} // end getFirstName()
	
	
	// get last name
	public String getLastName() {
		
		return lastName;
		
	} // end getLastName()
	
	
	// get balance
	public double getBalance() {
		
		return balance;
		
	} // end getBalance()
	
} // end AccountRecord class
