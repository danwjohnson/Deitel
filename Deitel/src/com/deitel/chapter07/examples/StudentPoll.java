// Fig. 7.8: StudentPoll.java
// Poll analysis program
package com.deitel.chapter07.examples;

public class StudentPoll {

	public static void main(String args[]) {
		
		// array of survey responses
		int responses[] = {1, 2, 6, 4, 8, 5, 9, 7, 8, 10, 1, 6, 3, 8, 6,
				10, 3, 8, 2, 7, 6, 8, 6, 7, 5, 6, 6, 5, 6, 7, 5, 6,
				4, 8, 6, 8, 10 };
		int frequency[] = new int[11];
		
		// for each answer, select responses element and use that value
		// as frequency index to determine element to increment
		for (int answer = 0; answer < responses.length; answer++)
			++frequency[responses[answer]];

		System.out.printf("%s%10s\n", "Rating", "Frequency");
		
		// output each array element's value
		for (int rating = 1; rating < frequency.length; rating++)
			System.out.printf("%6d%10d\n", rating, frequency[rating]);
		
	} // end main
	
} // end class StudentPoll
