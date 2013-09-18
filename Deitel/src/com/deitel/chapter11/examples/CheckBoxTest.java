// Fig. 11.18: CheckBoxTest.java
// Testing CheckBoxFrame
package com.deitel.chapter11.examples;

import javax.swing.JFrame;

public class CheckBoxTest {

	public static void main(String args[]) {
		
		CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
		checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		checkBoxFrame.setSize(275, 100);
		checkBoxFrame.setVisible(true);
		
	} // end main
	
} // end class CheckBoxFrame
