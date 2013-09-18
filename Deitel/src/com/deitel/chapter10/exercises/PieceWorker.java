// Exercise 10.11: PieceWorker.java
// Representation of an employee that gets paid based on pieces
package com.deitel.chapter10.exercises;

public class PieceWorker extends Employee {

	private double wage;			// wage per piece
	private int pieces;				// number of pieces
	
	
	// five argument constructor
	public PieceWorker(String first, String last, String ssn,
			double hourlyWage, int piecesMade) {
		
		super(first, last, ssn);
		setWage(hourlyWage);
		setPieces(piecesMade);
		
	} // end constructor
	
	
	// set the wage
	public void setWage(double hourlyWage) {
		
		wage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;
		
	} // end method setWage
	
	
	// set pieces made
	public void setPieces(int piecesMade) {
		
		pieces = (piecesMade < 0) ? 0 : piecesMade;
		
	} // end method setPieces
	
	
	// get the wage
	public double getWage() {
		
		return wage;
		
	} // end method getWage
	
	
	// get the pieces made
	public int getPieces() {
		
		return pieces;
		
	} // end method getPieces
	
	
	
	// calculate payment amount
	public double getPaymentAmount() {
		
		return getWage() * getPieces();
		
	} // end method getPaymentAmount
	
	
	public double earnings() {
		
		return getWage() * getPieces();
		
	} // end method earnings
	
	
	// return String representation of HourlyEmployee ojbect
    public String toString() {
        
        return String.format("piece worker employee: %s\n%s: $%,.2f, %s: %d",
                super.toString(), "piece wage", getWage(),
                "pieces made", getPieces());
       
    } // end method toString
	
} // end method PieceWorker
