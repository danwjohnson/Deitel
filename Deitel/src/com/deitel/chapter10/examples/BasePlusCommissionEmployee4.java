// Fig. 9.13: BasePlusCommissionEmployee4.java
// BasePlusCommissionEmployee4 class inherits from CommissionEmployee3 and
// accesses CommissionEmployee3's private data via CommissionEmployee3's 
// public method.
package com.deitel.chapter10.examples;

public class BasePlusCommissionEmployee4 extends CommissionEmployee3 {
    
    private double baseSalary;          // base salary per week
    
    // six argument constructor
    public BasePlusCommissionEmployee4(String first, String last, String ssn,
            double sales, double rate, double salary) {
        
        super( first, last, ssn, sales, rate);
        setBaseSalary(salary);              // validate and store base salary
        
    }// end six argument constructor
    
    
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
    
    
    // return String representation of BasePlusCommissionEmployee4
    public String toString() {
        
        return String.format("%s %s\n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
        
    } // end method toString
    
} // end class BasePlusCommissionEmployee4
