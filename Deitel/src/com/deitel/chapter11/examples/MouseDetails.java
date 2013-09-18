// Fig. 11.32: MouseDetails.java
// Testing MouseDetailsFrame
package com.deitel.chapter11.examples;

import javax.swing.JFrame;

public class MouseDetails {

	public static void main(String args[]) {
		
		MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
		mouseDetailsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouseDetailsFrame.setSize(400, 150);
		mouseDetailsFrame.setVisible(true);
		
	} // end main
	
} // end class MouseDetails
