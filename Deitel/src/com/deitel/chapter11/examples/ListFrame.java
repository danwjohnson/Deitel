// Fig. 11.23: ListFrame.java
// Selecting colors from a JList
package com.deitel.chapter11.examples;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JList colorJList;		// 
	private final String colorNames[] = {"Black", "Blue", "Cyan",
			"Dark Grey", "Gray", "Green", "Light Gray", "Magenta",
			"Orange", "Pink", "Red", "White", "Yellow" };
	private final Color colors[] ={Color.BLACK, Color.BLUE, Color.CYAN,
			Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,
			Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE,
			Color.YELLOW};
	
	// ListFrame constructor add JScrollPane containing JList to JFrame
	public ListFrame() {
		
		super("List Test");
		setLayout(new FlowLayout());		// set frame layout
		
		colorJList = new JList(colorNames);	// create with color names
		colorJList.setVisibleRowCount(5);	// display 5 rows at once
		
		// do not allow multiple selections
		colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// add a JScrollPane containing JList to frame
		add(new JScrollPane(colorJList));
		
		colorJList.addListSelectionListener(
				new ListSelectionListener() {
			
				// handle list selection events
				public void valueChanged(ListSelectionEvent event) {
				
					getContentPane().setBackground(
							colors[colorJList.getSelectedIndex()]);
				
				} // end method valueChanged
			
			} // end anonymous inner class
		
		); // end call to addListSelectionListener
		
	} // end constructor
	
} // end class ListFrame
