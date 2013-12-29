// Fig. 8.7: Date.java
// Date class declaration
//
// Exercise 10.9: Add getters to the Date class

package com.deitel.chapter08.examples;

public class Date {

	private int month;			// 1-12
	private int day;			// 1-31 based on month
	private int year;			// any year
	
	
	// constructor: call checkMonth to confirm proper value for month;
	// call checkDay to confirm proper value for day
	public Date(int theMonth, int theDay, int theYear) {
		
		month = checkMonth(theMonth);		// validates month
		year = theYear;						// could validate the year
		day = checkDay(theDay);				// validate day
		
		System.out.printf(
				"Date oject constructor for date %s\n", this);
		
	} // end constructor
	
	
	// utility method to confirm proper month value
	private int checkMonth(int testMonth) {
		
		if (testMonth > 0 && testMonth <= 12)	// validate month
			return testMonth;
		else {									// month is invalid
			
			System.out.printf(
					"Invalid month (%d) set to 1.", testMonth);
			return 1;		// maintain object in consistent state
			
		} // end if/else
					
	} // end checkMonth()
	
	
	// utility method to confirm proper day value based on month and year
	private int checkDay(int testDay) {
		
		int daysPerMonth[] =
			{ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// check if day in range for month
		if(testDay > 0 && testDay <= daysPerMonth[month])
			return testDay;
		
		// check for leap year
		if (month == 2 && testDay == 29 && (year % 400 == 0 ||
				(year % 4 == 0 && year % 100 != 0)))
			return testDay;
		
		System.out.printf("Invalid day (%d) set to 1.", testDay);
		return 1;			// maintain object in consistent state
		
	} // end checkDay()
	
	
	// get the month
	public int getMonth() {
		
		return month;
		
	} // end getMonth()
	
	
	// get the day
	public int getDay() {
		
		return day;
		
	} // end getDay()
	
	
	// get the year
	public int getYear() {
		
		return year;
		
	} // end getYear();
	
	// return a String of the form month/day/year
	public String toString() {
		
		return String.format("%d/%d/%d", month, day, year);
		
	} // end toString()
	
} // end Date class
