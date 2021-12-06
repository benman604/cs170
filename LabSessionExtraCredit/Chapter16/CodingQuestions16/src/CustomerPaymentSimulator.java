import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class CustomerPaymentSimulator extends JFrame {

	private JPanel contentPane;
	private JTextField cardNumber;
	private String billingMethod = "Credit Card";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerPaymentSimulator frame = new CustomerPaymentSimulator();
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
	public CustomerPaymentSimulator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{64, 39, 37, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Billing:"));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		
		JRadioButton creditCardRadio = new JRadioButton("Credit Card");
		creditCardRadio.setSelected(true);
		panel.add(creditCardRadio);
		
		JRadioButton billCustomerRadio = new JRadioButton("Bill Customer");
		panel.add(billCustomerRadio);
		
		creditCardRadio.addActionListener(e->{
			billCustomerRadio.setSelected(false);
			billingMethod = "Credit Card";
		});
		
		billCustomerRadio.addActionListener(e->{
			creditCardRadio.setSelected(false);
			billingMethod = "Bill Customer";
		});
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.NORTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		contentPane.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel = new JLabel("Card Type:  ");
		panel_1.add(lblNewLabel);
		
		JList cardType = new JList();
		cardType.setModel(new AbstractListModel() {
			String[] values = new String[] {"Visa", "Master Card", "American Express"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel_1.add(cardType);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 2;
		contentPane.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_1 = new JLabel("Card Number: ");
		panel_2.add(lblNewLabel_1);
		
		cardNumber = new JTextField();
		panel_2.add(cardNumber);
		cardNumber.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 3;
		contentPane.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));
		
		JLabel lblNewLabel_2 = new JLabel("Expiration Date: ");
		panel_3.add(lblNewLabel_2);
		
		JComboBox expDateMonth = new JComboBox();
		expDateMonth.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		panel_3.add(expDateMonth);
		
		JComboBox expDateYear = new JComboBox();
		expDateYear.setModel(new DefaultComboBoxModel(new String[] {"2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		panel_3.add(expDateYear);
		
		JCheckBox verifiedBox = new JCheckBox("Verified");
		panel_3.add(verifiedBox);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 4;
		contentPane.add(panel_4, gbc_panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
		
		JButton acceptButton = new JButton("Accept");
		panel_4.add(acceptButton);
		
		JButton exitButton = new JButton("Exit");
		panel_4.add(exitButton);

		acceptButton.addActionListener(e->{
			JOptionPane pane = new JOptionPane();
			JOptionPane.showMessageDialog(pane, "Inputed data: \n"
					+ "Billing Method: " + billingMethod + "\n"
					+ "Card Type: " + cardType.getSelectedValue() + "\n"
					+ "Card Number: " + cardNumber.getText() + "\n"
					+ "Expiration Date: " + expDateMonth.getSelectedItem() + " " + expDateYear.getSelectedItem() + "\n"
					+ "Verified: " + verifiedBox.isSelected());
		});
		
		exitButton.addActionListener(e->{
			dispose();
		});
	}

}
