import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Driver code for app that prompts user to choose file and a term to find, and displays occurrences of that term
 * @author Benjamin Man
 *
 */
public class TextFileWordFinderApp extends JFrame { 

	private  JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { // main method
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextFileWordFinderApp frame = new TextFileWordFinderApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TextFileWordFinderApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // set layout
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JFileChooser fileChooser = new JFileChooser("New check box"); // create file chooser
		contentPane.add(fileChooser, BorderLayout.CENTER);
		
		JLabel titleLabel = new JLabel("Choose a text file to search a term");
		contentPane.add(titleLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel promptLabel = new JLabel("Enter term to search for");
		panel.add(promptLabel);
		
		JTextField inputText = new JTextField("", 20); // text field prompting term to search
		panel.add(inputText);
		
		JButton submitButton = new JButton("Find");
		panel.add(submitButton);
		
		submitButton.addActionListener(e->{ // submit button click action event listener
			File file = fileChooser.getSelectedFile(); // get selected file
			ArrayList<Integer> lines = new ArrayList<Integer>(); 
			int occurences = 0;
			
			try { // attempt to use scanner to read file line by line
				Scanner sc = new Scanner(file);
				int currentLine = 1;
				while(sc.hasNextLine()) { // loop through each line
					String str = sc.nextLine();
					if(str.contains(inputText.getText())) { // line contains match
						lines.add(currentLine); // add matching line
						occurences += str.split(inputText.getText(), -1).length - 1; // add number occurrences in line
					}
					currentLine++;
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			String lineListText = "";
			for(int line : lines) { // parse lines to string
				lineListText += line + ", ";
			}
			if(lineListText.length() > 2)
				lineListText = lineListText.substring(0, lineListText.length() - 2);
			
			JOptionPane pane = new JOptionPane("Word Finder"); // display output
			JOptionPane.showMessageDialog(pane, "Search term: " + inputText.getText() + "\n"
					+ "Number of occurances: " + lines.size() + "\n"
					+ "Appears in lines: " + lineListText);
		});
	}
	
	public JPanel getContents() {
		return contentPane;
	}

}
