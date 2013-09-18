// Fig. 9.17: ConstructorTest.java
// Display order in which superclass and subclass constructors are called.
package com.deitel.chapter09.examples;

public class ConstructorTest {

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		
		CommissionEmployee employee1 = new CommissionEmployee(
				"Bob", "Lewis", "333-33-3333", 5000, .04);
		
		System.out.println();
		
		BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee(
				"Lisa", "Jones", "555-55-5555", 2000, .06, 800);
		
		System.out.println();
		
		BasePlusCommissionEmployee employee3 = new BasePlusCommissionEmployee(
				"Mark", "Sands", "888-88-8888", 8000, .15, 2000);
		
	} // end main
	
}
