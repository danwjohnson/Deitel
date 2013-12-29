// Fig. 10.6: HourlyEmployee.java
// HourlyEmployee class extends Employee
package com.deitel.chapter10.exercises;


public class HourlyEmployee extends Employee {
    
    private double wage;        // wage per hour
    private double hours;       // hours worked for week
    
    // five argument constructor
    public HourlyEmployee( String first, String last, String ssn,
    		int month, int day, int year,
            double hourlyWage, double hoursWorked) {
        
        super(first, last, ssn, month, day, year);
        setWage(hourlyWage);
        setHours(hoursWorked);
        
    } // end constructor
    
    
    // set wage
    public void setWage(double hourlyWage) {
        
        wage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;
        
    } // end method setWage
    
    
    // set wage
    public double getWage() {
        
        return wage;
        
    } // end method getWage
    
    
    // set hours worked
    public void setHours(double hoursWorked) {
        
        hours = ((hoursWorked >= 0.0) && (hoursWorked <= 168.0)) ?
                hoursWorked : 0.0;
        
    } // end method setHours
    
    
    // get hours worked
    public double getHours() {
        
        return hours;
        
    } // end method getHours
    
    
    // calculate earnings; override abstract method earnings in Employee
    public double earnings() {
        
        if (getHours() <= 40)       // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        
    } // end method earnings
    
    
    // implement getPaymentAmount method
    public double getPaymentAmount() {
        
         if (getHours() <= 40)       // no overtime
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        
    } // end method getPaymentAmount
    
    // return String representation of HourlyEmployee ojbect
    public String toString() {
        
        return String.format("hourly employee: %s\n%s: $%,.2f, %s: %,.2f",
                super.toString(), "hourl wage", getWage(),
                "hours worked", getHours());
       
    } // end method toString
    
} // end class HourlyEmployee
