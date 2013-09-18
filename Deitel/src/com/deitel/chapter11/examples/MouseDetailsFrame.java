// Fig. 11.31L MouseDetailsFrame.java
// Demonstrating mouse clicks and distinguishing between mouse buttons
package com.deitel.chapter11.examples;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private String details;
	private JLabel statusBar;	// JLabel that appears at bottom of window
	
	// constructor
	public MouseDetailsFrame() {
		
		super("Mouse clicks and buttons");
		
		statusBar = new JLabel("Click the mouse");
		add(statusBar, BorderLayout.SOUTH);
		addMouseListener(new MouseClickHandler());	// add handler
		
	} // end constructor
	
	
	// inner class to handle mouse event
	private class MouseClickHandler extends MouseAdapter {
		
		// handle mouse-click event and determine which button was pressed
		@SuppressWarnings("unused")
		public void mouseClicked(MouseEvent event) {
			
			int xPos = event.getX();		// get x-position of mouse
			int yPos = event.getY();		// get y-position of mouse
			
			details = String.format("Clicked %d time(s)",
					event.getClickCount());
			
			if (event.isMetaDown())			// right mouse button
				details += " with right mouse button";
			else if (event.isAltDown())		// middle mouse button
				details += " with center mouse button";
			else							// left mouse button
				details += " with left mouse button";
			
			statusBar.setText(details);
				
		} // end method mouseClicked
		
	} // end class MouseClickHandler
	
} // end class MouseDetailsFrame
