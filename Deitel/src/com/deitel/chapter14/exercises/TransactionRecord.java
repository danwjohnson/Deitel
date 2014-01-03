// Exercise 14.8: TranscationRecord.java
// This class represents a transaction record
package com.deitel.chapter14.exercises;

public class TransactionRecord {

	private int account;
	private double amount;
	

	/**
	 * Zero arugment constructor
	 */
	public TransactionRecord() {
		
		this(0, 0.0);
		
	} // end zero argument constructor
	
	
	/**
	 * Two argument constructor
	 * @param acct
	 * @param amt
	 */
	public TransactionRecord(int acct, double amt) {
		
		setAccount(acct);
		setAmount(amt);
		
	} // end constructor
	
	
	public void setAccount(int acct) {
		
		account = acct;
		
	} // end setAccount();
	
	
	public void setAmount(double amt) {
		
		amount = amt;
		
	} // end setAmount()
	
	
	public int getAccount() {
		
		return account;
		
	} // end getAccount()
	
	
	public double getAmount() {
		
		return amount;
		
	} // end getAmount()
	
}
