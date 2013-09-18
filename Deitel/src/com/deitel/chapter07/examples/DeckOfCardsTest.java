// Fig. 7.11: DeckOfCardsTest.java
// Card shuffling and dealing application
package com.deitel.chapter07.examples;

public class DeckOfCardsTest {

	// execute the application
	public static void main(String args[]) {
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();		// place Cards in random order
		
		// print all 52 Cards in the order in which the are dealt
		for (int i = 0; i < 13; i++) {
			
			// deal and print 4 Cards
			System.out.printf("%-20s%-20s%-20s%-20s\n",
					myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
					myDeckOfCards.dealCard(), myDeckOfCards.dealCard());
			
		} // end for loop
		
	} // end main
	
} // end class DeckOfCardsTest
