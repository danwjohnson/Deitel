// Fig. 11.9: TextFieldFrame.java
// Demonstrating the JTextField class
package com.deitel.chapter11.examples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	private JTextField textField1;		// text field with set size
	private JTextField textField2;		// text field constructed with text
	private JTextField textField3;		// text field with text and size
	private JPasswordField passwordField;	// password field with text
	
	
	// TextFieldFrame constructor adds JTextField to JFrame
	public TextFieldFrame() {
		
		super("Testing JTextField and JPasswordField");
		setLayout(new FlowLayout());
		
		// construct textfield with 10 columns
		textField1 = new JTextField(10);
		add(textField1);			// add textField1 to JFrame
		
		// construct textfield with default text
		textField2 = new JTextField("Enter text here");
		add(textField2);			// add textField2 to JFrame
		
		// construct textfield with default text and 21 columns
		textField3 = new JTextField("Uneditable text field", 21);
		textField3.setEditable(false);
		add(textField3);			// add textField3 to JFrame
		
		// construct passwordField with default text
		passwordField = new JPasswordField("Hidden text");
		add(passwordField);			// add passwordField to JFrame
		
		// register event handlers
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	} // end constructor
	
	
	// private inner class for event handling
	private class TextFieldHandler implements ActionListener {
		
		// process text field events
		public void actionPerformed(ActionEvent event) {
			
			String string = "";			// declare string to display
			
			// user pressed Enter in JTextField textField1
			if (event.getSource() == textField1)
				string = String.format("textField1: %s", 
						event.getActionCommand());
			
			// user pressed Enter in JTextField textField1
			else if (event.getSource() == textField2)
				string = String.format("textField2: %s", 
						event.getActionCommand());
			
			// user pressed Enter in JTextField textField1
			else if (event.getSource() == textField3)
				string = String.format("textField3: %s", 
						event.getActionCommand());
						
			// user pressed Enter in JTextField textField1
			else if (event.getSource() == passwordField)
				string = String.format("passwordField: %s", 
						new String(passwordField.getPassword()));
						
			// display JTextField content
			JOptionPane.showMessageDialog(null, string);
			
		} // end method actionPerformed
		
	} // end private inner class TextFieldHandler
	
} // end class TextFieldFrame
