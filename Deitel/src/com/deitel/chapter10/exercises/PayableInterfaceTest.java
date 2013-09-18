// Fig. 10.13: PayableInterfaceTest.java
// Tests interface Payable
package com.deitel.chapter10.exercises;


public class PayableInterfaceTest {
    
    public static void main(String args[]) {
        
        // Create four element Payable array
        Payable payableObjects[] = new Payable[4];
        
        // populate array with objects that implement Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee(
                "John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new SalariedEmployee(
                "Lise", "Barnes", "888-88-8888", 1200.00);
        
        System.out.println(
                "Invoices and Employees processed polymorphically:\n");
        
        // generically process each element in array payableObjects
        for (Payable currentPayable : payableObjects) {
            
            // output currentPayable and it appropriate payment amount
            System.out.printf("%s \n%s: $%,.2f\n\n", 
                    currentPayable.toString(),
                    "payment due", currentPayable.getPaymentAmount());
            
        } // end for loop
        
    } // end main
    
} // end class PayableInterfaceTest
