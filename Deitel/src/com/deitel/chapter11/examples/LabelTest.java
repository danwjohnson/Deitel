// Fig. 11.7: LabelTest.java
// Testing LabelFrame
package com.deitel.chapter11.examples;

import javax.swing.JFrame;

public class LabelTest {

	public static void main(String args[]) {
		
		LabelFrame labelFrame = new LabelFrame();	// create LabelFrame
		labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labelFrame.setSize(275, 180);				// set frame size
		labelFrame.setVisible(true);				// display frame
		
	} // end main
	
} // end class LabelTest
