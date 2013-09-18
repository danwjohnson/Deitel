// Fig. 11.15: ButtonFrame.java
// Creating JButtons
package com.deitel.chapter11.examples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton plainJButton;		// button with just text
	private JButton fancyJButton;		// button with icons
	
	
	// ButtonFrame adds JButtons to JFrame
	public ButtonFrame() {
		
		super("Testing Buttons");
		setLayout(new FlowLayout());	// set frame layout
		
		plainJButton = new JButton("Plain Button"); // button with text
		add(plainJButton);				// add planJButton to JFrame
		
		Icon bug1 = new ImageIcon(getClass().getResource("bug1.gif"));
		Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
		fancyJButton = new JButton("Fancy Button", bug1);
		fancyJButton.setRolloverIcon(bug2);
		add(fancyJButton);
		
		// create new ButtonHandler for button event handling
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener(handler);
		plainJButton.addActionListener(handler);
		
	} // end constructor
	
	
	// inner class for button event handling
	private class ButtonHandler implements ActionListener {
		
		// handle button event
		public void actionPerformed(ActionEvent event) {
			
			JOptionPane.showMessageDialog(ButtonFrame.this,
					String.format("You pressed: %s", event.getActionCommand()));
			
		} // end method actionPerformed
		
	} // end private inner class ButtonHandler
	
} // end class ButtonFrame
