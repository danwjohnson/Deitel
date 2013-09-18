// Fig. 9.8: BasePlusCommissionEmployee.java
// BasePlusCommissionExmployee inherits from class CommissionEmployee
package com.deitel.chapter09.examples;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;		// base salary per week
	
	
	// six argument constructor
	public BasePlusCommissionEmployee( String first, String last, String ssn,
			double sales, double rate, double salary) {
		
		// explicit call to superclass CommissionEmployee constructor
		super(first, last, ssn, sales, rate);
		
		setBaseSalary(salary);		// validate and store base salary
		
		System.out.printf(
				"\nBasePlusCommissionEmployee constructor:\n%s\n", this);
		
	} // end six-argument constructor
	
	
	// set base salary
	public void setBaseSalary( double salary ) {
		
		baseSalary = (salary < 0.0) ? 0.0 : salary;
		
	} // end method setBaseSalary
	
	
	// get base salary
	public double getBaseSalary() {
		
		return baseSalary;
		
	} // end method getBaseSalary
	
	
	// calculate earnings
	public double earnings() {
		
		return getBaseSalary() + super.earnings();
		
	} // end method earnings
	
	
	// return String representation of CommissionEmployee object
		public String toString() {
			
			return String.format ("%s %s\n%s: %.2f", "base-salaried",
					super.toString(), "base salary", getBaseSalary());
		} // end method toString
	
} // end class BasePlusCommissionEmployee
