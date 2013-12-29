// Fig 14.22: FileDemonstration2.java
// Demonstrating the File class
package com.deitel.chapter14.examples;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileDemonstration2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextArea outputArea;			// used for output
	private JScrollPane scrollPane;			// used to provide scrolling to output
	
	
	// set up GUI
	public FileDemonstration2() {
		
		super("Test class File");
		
		outputArea = new JTextArea();
		
		// add outputArea to scrollPane
		scrollPane = new JScrollPane(outputArea);
		
		add(scrollPane, BorderLayout.CENTER);	// add scrollPane to GUI
		
		setSize(400, 400);		// set GUI size
		setVisible(true);		// display GUI
		
		analyzePath();			// create and analyze File object
		
	} // end constructor
	
	
	// allow user to specify file name
	private File getFile() {
		
		// display file dialog, so user can choose file to open
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(
				JFileChooser.FILES_AND_DIRECTORIES);
		
		int result = fileChooser.showOpenDialog(this);
		
		// if user clicked Cancel button on dialog, return
		if (result == JFileChooser.CANCEL_OPTION)
			System.exit(1);
		
		File fileName = fileChooser.getSelectedFile();	// get the selected file
		
		// display error if invalid
		if ((fileName == null) || (fileName.getName().equals(""))) {
			
			JOptionPane.showMessageDialog(this, "Invalid File Name",
					"Invalid File Name", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
			
		} // end if
		
		return fileName;
		
	}  // end getFile()
	
	
	// display information about file user specifies
	public void analyzePath() {
		
		// create File object based on user input
		File name = getFile();
		
		if (name.exists()) {	// if name exists, output information about it
			
			// display file (or directory) information
			outputArea.setText(String.format(
					"%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
					name.getName()," exists",
					(name.isFile() ? "is a file" : "is not a file"),
					(name.isDirectory() ? "is a directory" :
						"is not a directory"),
					(name.isAbsolute() ? "is absolute path" :
						"is not absolute path"), "Last modified: ",
					name.lastModified(), "Length: ", name.length(),
					"Path: ", name.getPath(), "Absolute path: ",
					name.getAbsolutePath(), "Parent: ", name.getParent()));
					
			if (name.isDirectory()) {	// output directory listing
				
				String directory[] = name.list();
				outputArea.append("\n\nDirectory contents:\n");
				
				for (String directoryName : directory)
					outputArea.append(directoryName + "\n");
				
			} // end if
			
		} // end outer if
		else {		// not file or directory, output error message
			
			JOptionPane.showMessageDialog(this, name +
					" does not exist.", "ERROR", JOptionPane.ERROR_MESSAGE);
			
		} // end else
		
	} // end analyzePath()
	
} // end FileDemonstration2 class
