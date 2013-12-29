// Fig. 10.5: SalariedEmployee.java
// SalariedEmployee class extends Employee
package com.deitel.chapter10.exercises;


public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	// four argument constructor
	public SalariedEmployee( String first, String last, String ssn,
			int month, int day, int year,
			double salary) {
		
		super(first, last, ssn, month, day, year);	// pass to Employee constructor
		setWeeklySalary(salary);	// validate and store salary
		
	} // end constructor
	
	
	// set salary
	public void setWeeklySalary(double salary) {
		
		weeklySalary = salary < 0.0 ? 0.0 : salary;
		
	} // end method setWeeklySalary
	
	
	// get salary
	public double getWeeklySalary() {
		
		return weeklySalary;
		
	} // end method getWeeklySalary
	
	
	// calculate earnings; override abstract method earnings in Employee
	public double earnings() {
		
		return getWeeklySalary();
		
	} // end method earnings
	

        // calculate earnngs; implement interface Payable method that was
        // abstract in superclass Employee
        public double getPaymentAmount() {
            
            return getWeeklySalary();
            
        } // end method getPamentAmount
        
	
	// return String representation of SalariedEmployee object
	public String toString() {
		
		return String.format("salaried employee: %s\n%s: $%,.2f",
				super.toString(), "weekly salary", 
                                getWeeklySalary());
		
	} // end method toString
	
} // end class SalariedEmployee
