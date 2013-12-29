// Fig. 10.4: Employee.java
// Employee abstract superclass
//
// Exercise 10.9: Add birthDate to the Employee class
package com.deitel.chapter10.exercises;

import com.deitel.chapter08.examples.Date;


public abstract class Employee implements Payable{

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private Date birthDate;
	
	
	// three argument constructor
	public Employee(String first, String last, String ssn, 
			int birthMonth, int birthDay, int birthYear) {
		
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		
		birthDate = new Date(birthMonth, birthDay, birthYear);
		
	} // end constructor
	
	
	// set first name
	public void setFirstName(String first) {
		
		firstName = first;
		
	} // end method setFirstName
	
	
	// get first name
	public String getFirstName() {
		
		return firstName;
		
	} // end method getFirstName
	
	
	// set last name
	public void setLastName(String last) {
		
		lastName = last;
		
	} // end method setLastName
	
	
	// get last name
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
	
	
	// get birth date
	public String getBirthDate() {
		
		return String.format("%s", birthDate);
		
	}
	
	
	// get birth month
	public int getBirthMonth() {
		
		return birthDate.getMonth();
		
	} // end getBirthMonth()
	
	
	
	// return String representation of Employee object
	public String toString() {
		
		return String.format( "%s %s\nsocial security number: %s\nbirth date: %s",
				getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
		
	} // end method toString
	
	
	// abstract method overridden by subclasses
	public abstract double earnings();// no implementation here
	
} // end abstract class Employee
