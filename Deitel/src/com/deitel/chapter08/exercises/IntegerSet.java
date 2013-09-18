// Exercise 8.15: IntegerSet.java
// This class represents a set of integers
package com.deitel.chapter08.exercises;

public class IntegerSet {

	private final int SET_SIZE = 101;
	boolean intSet[];
	
	
	// zero argument constructor
	public IntegerSet() {
		
		intSet = new boolean[SET_SIZE];
		
	} // end zero-argument constructor
	
	
	// one argument constructor
	public IntegerSet(int array[]) {
		
		intSet = new boolean[SET_SIZE];
		
		for (int i = 0; i < array.length; i++)
			insertElement(array[i]);
		
	} // end constructor
	
	
	// Set the intSet[index] to true if integer is valid
	public void insertElement(int insertInteger) {
		
		if (validEntry(insertInteger))
			intSet[insertInteger] = true;
		
	} // end method insertElement
	
	
	// Set the intSet[index] to false if integer is valid
	public void deleteElement(int deleteInteger) {
		
		if (validEntry(deleteInteger))
			intSet[deleteInteger] = false;
		
	} // end method deleteElement
	

	// Determine the union between two IntegerSets
	public IntegerSet union(IntegerSet integerSet) {
		
		IntegerSet temp = new IntegerSet();
		
		for (int i = 0; i < 101; i++)
			temp.intSet[i] = (intSet[i] || integerSet.intSet[i]);
		
		return temp;
		
	} // end method union
	
	
	// Determine the intersection between two IntegerSets
	public IntegerSet intersection(IntegerSet integerSet) {
		
		IntegerSet temp = new IntegerSet();
		
		for (int i = 0; i < 101; i++)
			temp.intSet[i] = (intSet[i] && integerSet.intSet[i]);
		
		return temp;
		
	} // end method intersection
	
	
	// Checks if the integer is valid between 0 and 100
	public boolean validEntry(int testInteger) {
		
		return testInteger >=0 && testInteger <= 100;
		
	} // end method validEntry
	
	
	// Determines if two IntegerSets are equal
	public boolean isEqualTo(IntegerSet integerSet) {
		
		for ( int i = 0; i < 101; i++ ) {
			
			if (intSet[i] != integerSet.intSet[i])
				return false;
			
		} // end for loop
		
		return true;
		
	} // end method isEqualTo
	
	
	// return string representation of set 
	@SuppressWarnings("unused")
	public String toString() {
	
		int x =1;
		
		boolean empty = true; // assume set is empty
		String setString = "{ ";
	
		// get set elements
		for ( int count = 0; count < 101; count++ ){
				
			if ( intSet[ count ] ){
				setString += count + " ";
				empty = false; // set is not empty
				x++;
			} // end if
			
		} // end for
	
		// empty set
		if ( empty )
			setString += "---"; // display an empty set
	
		setString += " }";
		
		return setString;
		
	} // end method toSetString
	
} // end classIntegerSet
