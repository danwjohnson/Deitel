// Fig. 10.1: PolymorphismTest.java
// Assigning superclass and subclass references to superclass and
// subclass variables
package com.deitel.chapter10.examples;

public class PolymorphismTest {
    
    public static void main(String args[]) {
        // assign superclass reference to superclass variable
        CommissionEmployee3 commissionEmployee = new CommissionEmployee3(
                "Sue", "Jones", "222-22-2222", 10000, .06);

        // assign subclass reference to subclass variable
        BasePlusCommissionEmployee4 basePlusCommissionEmployee =
                new BasePlusCommissionEmployee4(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // invoke toString on superclass object using superclass variable
        System.out.printf("%s %s:\n\n%s\n\n", 
                "Call CommissionEmployee3's toString with superclass reference",
                "to superclass object", commissionEmployee.toString());
        
        // invoke toString on subclass object using subclass variable
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call BasePlusCommissionEmployee4's toString with subclass",
                "reference to subclass object",
                basePlusCommissionEmployee.toString());
        
        // invoke toString on subclass object using superclass variable
        CommissionEmployee3 commissionEmployee2 =
                basePlusCommissionEmployee;
        System.out.printf("%s %s:\n\n%s\n\n",
                "Call BasePlusCommissionEmployee4's toString with superclass",
                "reference to subclass object", commissionEmployee2.toString());
        
    } // end main
               
} // end class PolymorphismTest
