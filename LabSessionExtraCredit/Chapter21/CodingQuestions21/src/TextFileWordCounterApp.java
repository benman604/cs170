import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Driver code for app that prompts user to choose file and displays the number of words in that file.
 * @author Benjamin Man
 *
 */
public class TextFileWordCounterApp extends JFrame { 

	private  JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { // main method
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextFileWordCounterApp frame = new TextFileWordCounterApp();
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
	public TextFileWordCounterApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // set layout
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JFileChooser fileChooser = new JFileChooser("New check box"); // create file chooser
		contentPane.add(fileChooser, BorderLayout.CENTER);
		
		JLabel titleLabel = new JLabel("Choose a text file to count words for");
		contentPane.add(titleLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton submitButton = new JButton("Count Words ");
		panel.add(submitButton);
		
		submitButton.addActionListener(e->{ // submit button click action event listener
			File file = fileChooser.getSelectedFile(); // get selected file
			int wordCount = 0; 
			try { // attempt to use scanner to read file line by line
				Scanner sc = new Scanner(file);
				while(sc.hasNextLine()) { // loop through each line
					wordCount += sc.nextLine().split(" ").length; // count words in line, add to word count
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			JOptionPane pane = new JOptionPane("Word Counter"); // show number of words
			JOptionPane.showMessageDialog(pane, wordCount + " words");
		});
	}
	
	public JPanel getContents() {
		return contentPane;
	}

}
