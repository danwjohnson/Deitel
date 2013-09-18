// Fig. 11.28: MouseTrackerFrame.java
// Demonstrating mouse events
package com.deitel.chapter11.examples;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel mousePanel;		// panel in which the mouse events will occur
	private JLabel statusBar;		// label that displays event information
	
	// constructor
	public MouseTrackerFrame() {
		
		super("Demonstrating Mouse Events");
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER);
		
		statusBar = new JLabel("Mouse outside JPanel");
		add(statusBar,BorderLayout.SOUTH);
		
		// create and register listener for mouse and mouse motion events
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
		
	} // end constructor
	
	
	private class MouseHandler implements MouseListener, MouseMotionListener {
		
		// MouseListener event handlers
		// handle event when mouse released immediately after press
		public void mouseClicked(MouseEvent event) {
			
			statusBar.setText(String.format("Clicked at [%d, %d]",
					event.getX(), event.getY()));
			
		} // end method mouseClicked
		
		
		// handle event when mouse pressed
		public void mousePressed(MouseEvent event) {
			
			statusBar.setText(String.format("Pressed at [%d, %d]",
					event.getX(), event.getY()));
			
		} // end method mousePressed
		
		
		// handle event when mouse released after dragging
		public void mouseReleased(MouseEvent event) {
			
			statusBar.setText(String.format("Released at [%d, %d]",
					event.getX(), event.getY()));
			
		} // end method mouseReleased
		
		
		// handle event when mouse enters area
		public void mouseEntered(MouseEvent event) {
			
			statusBar.setText(String.format("Mouse entered at [%d, %d]",
					event.getX(), event.getY()));
			mousePanel.setBackground(Color.GREEN);
			
		} // end method mouseEntered
		
		
		// handle event when mouse exits area
		public void mouseExited(MouseEvent event) {
			
			statusBar.setText(String.format("Mouse outside JPanel"));
			mousePanel.setBackground(Color.WHITE);
			
		} // end method mouseExited
		
		
		// MouseMotionListener event handlers
		// handle event when user drags mouse with button pressed
		public void mouseDragged(MouseEvent event) {
			
			statusBar.setText(String.format("Dragged at [%d, %d]",
					event.getX(), event.getY()));
			
		} // end method mouseDragged
		
		
		// handle event when user moves mouse
		public void mouseMoved(MouseEvent event) {
			
			statusBar.setText(String.format("Moved at [%d, %d]",
					event.getX(), event.getY()));
			
		} // end method mouseMoved
		
	} // end inner class MouseHandler
	
} // end class MouseTrackerFrame
