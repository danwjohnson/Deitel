// Fig. 11.17: CheckBoxFrame.java
// Creating JCheckBox buttons
package com.deitel.chapter11.examples;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JTextField textField;		// displays text in changing fonts
	private JCheckBox boldJCheckBox;	// to select/deselect bold
	private JCheckBox italicJCheckBox;	// to select/deselect italic
	
	
	// CheckBoxFrame constructor adds JCheckBoxes to JFrame
	public CheckBoxFrame() {
		
		super("JCheckBox Test");
		setLayout(new FlowLayout());	// set frame layout
		
		// set up JTextField and set its font
		textField = new JTextField("Watch the font style change", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);
		
		boldJCheckBox = new JCheckBox("Bold");
		italicJCheckBox = new JCheckBox("Italic");
		add(boldJCheckBox);
		add(italicJCheckBox);
		
		// register listeners for JCheckBox
		CheckBoxHandler handler = new CheckBoxHandler();
		boldJCheckBox.addItemListener(handler);
		italicJCheckBox.addItemListener(handler);
		
	} // end constructor
	
	
	// private inner class for ItemListener even handling
	private class CheckBoxHandler implements ItemListener {
		
		private int valBold = Font.PLAIN;	// constant bold font style
		private int valItalic = Font.PLAIN;	// constant italic font style
		
		// respond to checkbox events
		public void itemStateChanged(ItemEvent event) {
			
			// process bold checkbox events
			if (event.getSource() == boldJCheckBox)
				valBold = boldJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
			
			// process italic checkbox events
			if (event.getSource() == italicJCheckBox)
				valItalic = italicJCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;
			
			// set text field font
			textField.setFont(
					new Font("Serif", valBold + valItalic, 14));
			
		} // end method itemStateChanged
		
	} // end private inner class CheckBoxHandler
	
} // end class CheckBoxFrame
