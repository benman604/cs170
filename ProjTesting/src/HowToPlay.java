import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

//How to Play page
public class HowToPlay extends JFrame 
{

	private JPanel contentPane;
	Clip clip1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					HowToPlay frame = new HowToPlay();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HowToPlay()
	{	
		setTitle("Instructions");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 51, 153));
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How to Play");
		lblNewLabel.setForeground(new Color(0, 51, 153));
		lblNewLabel.setBounds(337, 139, 279, 88);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
		contentPane.add(lblNewLabel);
		
		// Green logo
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 0));
		panel.setBounds(0, 0, 988, 108);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("AlphabetLearner");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setBounds(54, 17, 238, 44);
		panel.add(lblNewLabel_2);
		
		// Create a text area
		JTextArea t = new JTextArea();
		t.setForeground(new Color(0, 51, 153));
		t.setBackground(new Color(204, 204, 255));
		t.setFont(new Font("Comic Sans MS", Font.PLAIN, 36));
		t.setText("You will be asked an alphabet question. \r\n"
				+ "4 choice will be displayed on the screen.\r\n"
				+ "Click on the choice you think is correct. ");
		t.setBounds(113, 284, 775, 210);
		t.setEditable(false);
		contentPane.add(t);
		
		JButton DONE_Button = new JButton("DONE");
		DONE_Button.setBackground(new Color(255, 255, 153));
		DONE_Button.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		DONE_Button.setBounds(368, 568, 209, 80);
		contentPane.add(DONE_Button);
		
		//Music 
		try
		{
			clip1 = AudioSystem.getClip();
			AudioInputStream input = 
					AudioSystem.getAudioInputStream
					(new File("Music/Bingo_Song.wav"));
			clip1.open(input);
			clip1.loop(Clip.LOOP_CONTINUOUSLY);
			clip1.start();
		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
		// Go Back to Main
		DONE_Button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dispose(); // throw away this page
				stopMusic(); // stop Music
				
				// Go back to main frame
				MainFrame m = new MainFrame();
				m.setLocationRelativeTo(null);
				m.setVisible(true);
			}
		});
		
	}
	
	public void stopMusic()
	{
		clip1.stop();
	}
}
