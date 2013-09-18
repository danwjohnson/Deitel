// Fig. 11.19: RadioButtonFrame.java
// Creating radio buttons using ButtonGroup and JRadioButton
package com.deitel.chapter11.examples;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JTextField textField;		// used to display font changes
	private Font plainFont;				// font for plan text
	private Font boldFont;				// font for bold text
	private Font italicFont;			// font for italic text
	private Font boldItalicFont;		// font for bold italic text
	private JRadioButton plainJRadioButton;		// selects plain text
	private JRadioButton boldJRadioButton;		// selects bold text
	private JRadioButton italicJRadioButton;	// selects italic text
	private JRadioButton boldItalicJRadioButton;	// bold and italic
	private ButtonGroup radioGroup;		// buttongroup to hold radio buttons
	
	
	// RadioButtonFrame constructor adds JRadioButton to JFrame
	public RadioButtonFrame() {
		
		super("RadioButton Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField( "Watch the font style change", 25);
		add(textField);
		
		// create radio buttons
		plainJRadioButton = new JRadioButton("Plain", true);
		boldJRadioButton = new JRadioButton("Bold", false);
		italicJRadioButton = new JRadioButton("Italic", false);
		boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
		add(plainJRadioButton);
		add(boldJRadioButton);
		add(italicJRadioButton);
		add(boldItalicJRadioButton);
		
		// create logical relationship between JRadioButtons
		radioGroup = new ButtonGroup();			// create button group
		radioGroup.add(plainJRadioButton);		// add plain to the group
		radioGroup.add(boldJRadioButton);		// add bold to the group
		radioGroup.add(italicJRadioButton);		// add italic to the group
		radioGroup.add(boldItalicJRadioButton);	// add bold italic to the group
		
		// create font objects
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		
		// register events for JRadioButtons
		plainJRadioButton.addItemListener(
				new RadioButtonHandler(plainFont));
		boldJRadioButton.addItemListener(
				new RadioButtonHandler(boldFont));
		italicJRadioButton.addItemListener(
				new RadioButtonHandler(italicFont));
		boldItalicJRadioButton.addItemListener(
				new RadioButtonHandler(boldItalicFont));
		
	} // end constructor
	
	
	// private inner class to handle radio button events
	private class RadioButtonHandler implements ItemListener {
		
		private Font font;		// font associated with this listener
		
		public RadioButtonHandler( Font f) {
			
			font = f;			// set the font of this listener
			
		} // end constructor
		
		// handle radio button events
		public void itemStateChanged(ItemEvent event) {
			
			textField.setFont(font);
			
		} // end method itemStateChanged
		
	} // end private inner class
	
} // end RadioButtonFrame
