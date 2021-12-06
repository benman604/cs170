import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class CalculatorApp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp frame = new CalculatorApp();
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
	public CalculatorApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 414, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 40, 134, 210);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 0, 45, 45);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBounds(43, 0, 45, 45);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.setBounds(89, 0, 45, 45);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setBounds(0, 45, 45, 45);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.setBounds(43, 45, 45, 45);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("6");
		btnNewButton_1_1_1.setBounds(89, 45, 45, 45);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.setBounds(0, 91, 45, 45);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_1_3 = new JButton("8");
		btnNewButton_1_3.setBounds(43, 91, 45, 45);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_1_2 = new JButton("9");
		btnNewButton_1_1_2.setBounds(89, 91, 45, 45);
		panel.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_6 = new JButton("0");
		btnNewButton_6.setBounds(0, 136, 45, 45);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_1_1_4 = new JButton("00");
		btnNewButton_1_1_4.setBounds(43, 136, 91, 45);
		panel.add(btnNewButton_1_1_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setLayout(null);
		panel_1.setBounds(154, 40, 134, 210);
		contentPane.add(panel_1);
		
		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.setBounds(10, 11, 52, 118);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_1_1_3 = new JButton("-");
		btnNewButton_1_1_3.setBounds(72, 11, 52, 39);
		panel_1.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_1_1 = new JButton("*");
		btnNewButton_1_1_1_1.setBounds(72, 50, 52, 39);
		panel_1.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_2_1 = new JButton("/");
		btnNewButton_1_1_2_1.setBounds(72, 90, 52, 39);
		panel_1.add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_1_1_2_1_1 = new JButton("=");
		btnNewButton_1_1_2_1_1.setBounds(72, 129, 52, 39);
		panel_1.add(btnNewButton_1_1_2_1_1);
		
		JButton btnNewButton_1_1_2_1_1_1 = new JButton(".");
		btnNewButton_1_1_2_1_1_1.setBounds(10, 129, 52, 39);
		panel_1.add(btnNewButton_1_1_2_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(298, 42, 126, 126);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("C");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(10, 11, 106, 39);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("C/A");
		btnNewButton_5_1.setBounds(10, 65, 106, 39);
		panel_2.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_1_1 = new JButton("OFF");
		btnNewButton_5_1_1.setBounds(307, 193, 106, 39);
		contentPane.add(btnNewButton_5_1_1);
	}
}
