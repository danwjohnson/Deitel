// Exercise 8.6: SavingsAccountTest.java
// Test the SavingsAccount class
package com.deitel.chapter08.exercises;

public class SavingsAccountTest {

	public static void main(String args[]) {
		
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		SavingsAccount.modifyInterestRate(.04);
		
		System.out.println("Testing the SavingsAccount class");
		System.out.println("Interest Rate = .04%");
		
		System.out.printf( "%20s%10s\n", "Saver 1", "Saver 2" );
		System.out.printf( "%-10s%10s%10s\n", "Base",
				saver1.toString(), saver2.toString() );
		
		for (int i = 1; i <= 12; i++) {
			
			String monthLabel = String.format("Month %d:", i);
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			
			System.out.printf("%-10s%10s%10s\n", monthLabel,
					saver1, saver2);
			
		} // end for loop
		
		System.out.println("\n\nAfter changing the interest to .05%");
		SavingsAccount.modifyInterestRate(.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.printf("%-10s%10s%10s\n", "Month 13:",
				saver1, saver2);
		
		
	} // end main
	
} // end class SavingsAccount
