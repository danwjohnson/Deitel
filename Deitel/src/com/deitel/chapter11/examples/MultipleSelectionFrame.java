// Fig. 11.25: MultipleSelectionFrame.java
// Copying items from one List to another
package com.deitel.chapter11.examples;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	private JList colorJList;		// list to hold color names
	private JList copyJList;		// list to copy color names into
	private JButton copyJButton;	// button to copy select names
	private final String colorNames[] = {"Black", "Blue", "Cyan",
			"Dark Grey", "Gray", "Green", "Light Gray", "Magenta",
			"Orange", "Pink", "Red", "White", "Yellow" };
	
	// constructor
	public MultipleSelectionFrame() {
		
		super("Multiple Selection Lists");
		setLayout(new FlowLayout());		// set frame layout
		
		colorJList = new JList(colorNames);	// holds names of all colors
		colorJList.setVisibleRowCount(5);	// show five rows
		colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorJList));	// add list with scroll pane
		
		copyJButton = new JButton("Copy >>>");	// create copy button
		copyJButton.addActionListener(
				
				new ActionListener() { 		// anonymous inner class
					
					// handle button event
					public void actionPerformed(ActionEvent event) {
						
						// place selected values in copyJList
						copyJList.setListData(colorJList.getSelectedValues());
						
					} // end method actionPerformed
					
				} // end anonymous inner class
				
		);	// end call to addActionListener
		
		add(copyJButton);
		
		copyJList = new JList();			// create list to hold copied color names
		copyJList.setVisibleRowCount(5);	// show 5 rows
		copyJList.setFixedCellWidth(100);	// set width
		copyJList.setFixedCellHeight(15);	// set height
		copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(copyJList));	// add list with scroll pane
		
	} // end constructor
	
} // end class MultipleSelectionFrame
