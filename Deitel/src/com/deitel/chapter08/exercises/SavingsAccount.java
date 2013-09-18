// Exercise 8.6: SavingsAccount.java
// This class represents one user's savings account
package com.deitel.chapter08.exercises;

public class SavingsAccount {

	private static double annualInterestRate;

	private double savingsBalance = 0.0;
	
	
	
	// constructor
	public SavingsAccount( double savings) {
		
		savingsBalance = savings;
		
	} // end one-argument constructor
	
	
	
	// calculate the monthly interest
	public void calculateMonthlyInterest() {
		
		savingsBalance = savingsBalance + ((savingsBalance * annualInterestRate) / 12);
		
	} // end method calculateMonthlyInterest
	
	
	// set the interest rate
	public static void modifyInterestRate(double rate) {
		
		annualInterestRate = rate;
		
	} // end method modifyInterestRate
	
	
	// String representation of the SavingAccount object
	public String toString() {
		
		return String.format("%.2f", savingsBalance);
		
	} // end method toString
	
} // end class SavingsAccount
