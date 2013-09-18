// Fig. 9.4: CommissionEmployee.java
// CommissionEmployee class represents a commission employee
package com.deitel.chapter09.examples;

public class CommissionEmployee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;				// gross weekly sales
	private double commissionRate;			// commission percentage
	
	// five argument constructor
	public CommissionEmployee(String first, String last, String ssn,
			double sales, double rate) {
		
		// implicit call to Object constructor occurs here
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		setGrossSales(sales);			// validate and store gross sales
		setCommissionRate(rate);		// validate and store commission rate
		
		System.out.printf(
				"\nCommisionEmployee constructor:\n%s\n", this);
		
	} // end five argument constructor
	
	
	// set first name
	public void setFirstName(String first) {
		
		firstName = first;
		
	} // end method setFirstName
	
	
	// return first name
	public String getFirstName() {
		
		return firstName;
		
	} // end method getFirstName
	
	
	// set last name
	public void setLastName(String last) {
		
		lastName = last;
		
	} // end method setLastName
	
	
	// return last name
	public String getLastName() {
		
		return lastName;
		
	} // end method getLastName
	
	
	// set social security number
	public void setSocialSecurityNumber(String ssn) {
		
		socialSecurityNumber = ssn;
		
	} // end method setSocialSecurityNumber
	
	
	// get social security number
	public String getSocialSecurityNumber() {
		
		return socialSecurityNumber;
		
	} // end method getSocialSecurityNumber
	
	
	// set gross sales amount
	public void setGrossSales( double sales ) {
		
		grossSales = ( sales < 0.0 ) ? 0.0 : sales;
		
	} // end method setGrossSales
	
	
	// return gross sales amount
	public double getGrossSales() {
		
		return grossSales;
		
	} // end method getGrossSales
	
	
	// set commission rate
	public void setCommissionRate(double rate) {
		
		commissionRate = ( rate > 0.0 && rate < 1.0) ? rate : 0.0;
		
	} // end method setCommissionRate
	
	
	// get commission rate
	public double getCommissionRate() {
		
		return commissionRate;
		
	} // end method getCommissionRate
	
	
	// calculate earnings
	public double earnings() {
		
		return commissionRate * grossSales;
		
	} // end method earnings
	
	
	// return String representation of CommissionEmployee object
	public String toString() {
		
		return String.format ("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
				"commission employee: ", getFirstName(), getLastName(),
				"social security number: ", getSocialSecurityNumber(),
				"gross sales: ", getGrossSales(),
				"commission rate", getCommissionRate() );
		
	} // end method toString
	
} // end class CommissionEmployee
