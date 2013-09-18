// Fig. 11.26: MultipleSelectionTest.java
// Testing MultipleSelectionFrame.
package com.deitel.chapter11.examples;

import javax.swing.JFrame;

public class MultipleSelectionTest {

	public static void main(String args[]) {
		
		MultipleSelectionFrame multipleSelectionFrame = 
				new MultipleSelectionFrame();
		multipleSelectionFrame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		multipleSelectionFrame.setSize(350, 140);
		multipleSelectionFrame.setVisible(true);
		
	} // end main
	
} // end class MultipleSelctionTest
