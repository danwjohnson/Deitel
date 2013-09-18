// Fig. 11.16: ButtonTest.java
// Testing ButtonFrame
package com.deitel.chapter11.examples;

import javax.swing.JFrame;

public class ButtonTest {

	public static void main(String args[]) {
		
		ButtonFrame buttonFrame = new ButtonFrame();	// create ButtonFrame
		buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonFrame.setSize(300, 110);	// set frame size
		buttonFrame.setVisible(true);
		
	} // end main
	
} // end class ButtonTest
