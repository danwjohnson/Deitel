// Fig. 11.29: MouseTracker.java
// Testing MouseTrackerFrame
package com.deitel.chapter11.examples;

import javax.swing.JFrame;

public class MouseTracker {

	public static void main(String args[]) {
		
		MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
		mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouseTrackerFrame.setSize(300, 100);
		mouseTrackerFrame.setVisible(true);
		
	}  // end main
	
} // end class MouseTracker
