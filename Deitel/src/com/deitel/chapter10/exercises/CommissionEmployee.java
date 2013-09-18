// Fig. 10.7: CommissionEmployee.java
// CommissionEmployee class extends Employee
package com.deitel.chapter10.exercises;


public class CommissionEmployee extends Employee{
    
    private double grossSales;          // gross weekly sales
    private double commissionRate;      // commission percentage
    
    
    // five argument constructor
    public CommissionEmployee(String first, String last, String ssn, 
            double sales, double rate) {
        
        super(first, last, ssn);
        setGrossSales(sales);
        setCommissionRate(rate);
        
    } // end constructor
    
    
    // set commission rate
    public void setCommissionRate(double rate) {
        
        commissionRate = (rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
        
    } // end method setCommissionRate
    
    
    // get commission rate
    public double getCommissionRate() {
        
        return commissionRate;
        
    } // end method getCommissionRate
    
    
    // set gross sales
    public void setGrossSales(double sales) {
        
        grossSales = ( sales < 0.0) ? 0.0 : sales;
        
    } // end method setGrossSales
    
    
    // get gross sales
    public double getGrossSales() {
        
        return grossSales;
        
    } // end method getGrossSales
    
    
    // calculate earnings; override abstract method earnings in Employee
    public double earnings() {
        
        return getCommissionRate() * getGrossSales();
        
    } // end method earnings
    
    
    // implement getPaymentAmountMethod
    public double getPaymentAmount() {
        
        return getCommissionRate() * getGrossSales();
        
    }
    
    // return String representation of CommissionEmployee object
    public String toString() {
        
        return String.format ("%s: %s\n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
        
    } // end method toString
    
} // end class CommissionEmployee
