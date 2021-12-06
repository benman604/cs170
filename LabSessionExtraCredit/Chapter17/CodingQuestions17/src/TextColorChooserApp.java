import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.colorchooser.*;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TextColorChooserApp extends JFrame {

	private  JPanel contentPane;
	private JTextField inputField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextColorChooserApp frame = new TextColorChooserApp();
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
	public TextColorChooserApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		inputField = new JTextField();
		panel.add(inputField);
		inputField.setColumns(10);
		
		JLabel textOutput = new JLabel("Type something...");
		panel.add(textOutput);
		
		JButton submitButton = new JButton("Submit");
		panel.add(submitButton);
		submitButton.addActionListener(e->{
			textOutput.setText(inputField.getText());
		});
		
		JColorChooser colorChooser = new JColorChooser(textOutput.getForeground());
		contentPane.add(colorChooser, BorderLayout.NORTH);
		colorChooser.getSelectionModel().addChangeListener(e->{
			textOutput.setForeground(colorChooser.getColor());
		});
	}

	public JPanel getContents() {
		return contentPane;
	}
}
