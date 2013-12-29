// Fig. 10.8: BasePlusCommissionEmployee.java
// BasePlusCommissionEmploye class extends CommissionEmployee
package com.deitel.chapter10.exercises;


public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;          // base salary per week
    
    
    // six argument constructor
    public BasePlusCommissionEmployee(String first, String last, String ssn,
    		int month, int day, int year,
            double sales, double rate, double salary) {
        
        super(first, last, ssn, month, day, year, sales, rate);
        setBaseSalary(salary);
        
    } // end constructor
    
    
    // set base salary
    public void setBaseSalary(double salary) {
        
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
    
    
    // return String representation of BasePlusCommissionEmployee
    public String toString() {
        
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
        
    } // end method toString
    
} // end class BasePlusCommissionEmployee
