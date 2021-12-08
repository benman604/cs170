/*
 * AWT app driver class to create robot using paint graphics
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class MultiColoredRobot extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiColoredRobot frame = new MultiColoredRobot();
					frame.setVisible(true);
					frame.repaint();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MultiColoredRobot() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
    @Override
    public void paint(Graphics g) // paints robot
    {
    	g.setColor(Color.GREEN);
        g.fillOval(200-105/2, 100, 105, 75); // oval head
        g.setColor(Color.RED);
        g.fillRect(200-50/2, 170, 50, 100); // body
        g.fillOval((200-105/2) + 70, 120, 20, 20); // circular eyes
        g.fillOval((200-105/2) + 20, 120, 20, 20);
        g.setColor(Color.BLACK);
        g.fillRect((200-105/2) + 45, 150, 50, 10); // rect mouth
    }
}
