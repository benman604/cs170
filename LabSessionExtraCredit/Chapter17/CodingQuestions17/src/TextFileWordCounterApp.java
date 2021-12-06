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

public class TextFileWordCounterApp extends JFrame {

	private  JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JFileChooser fileChooser = new JFileChooser("New check box");
		contentPane.add(fileChooser, BorderLayout.CENTER);
		
		JLabel titleLabel = new JLabel("Choose a text file to count words for");
		contentPane.add(titleLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton submitButton = new JButton("Count Words ");
		panel.add(submitButton);
		
		submitButton.addActionListener(e->{
			File file = fileChooser.getSelectedFile();
			int wordCount = 0;
			try {
				Scanner sc = new Scanner(file);
				while(sc.hasNextLine()) {
					wordCount += sc.nextLine().split(" ").length;
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			JOptionPane pane = new JOptionPane("Word Counter");
			JOptionPane.showMessageDialog(pane, wordCount + " words");
		});
	}
	
	public JPanel getContents() {
		return contentPane;
	}

}
