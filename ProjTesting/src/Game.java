import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Panel;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.util.HashSet;
import java.util.Set;

import java.util.Random;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Frame;
import javax.swing.UIManager;

public class Game extends JFrame implements ActionListener
{
	Clip clipSoundC;
	Clip clipSoundI;
	Clip gameSound;
	Frame frame;
	
	Random r = new Random();
	
	String[] questions = 
		{
				"What is the first letter of this fruit?",
				"When we greet people, we say _ello!",
				"What letter does this animal end with? ",
				"What’s the first letter of this plant?",
				"You can sing a _ong.",
				"What’s the first letter of this animal?",
				"When you're tired, you take a  _ap.",
				"What’s the first letter of this color?",
				"What letter does this vegetable end with?",
				"You can use a _encil to write things"
				
		};
	
	 Set<Integer> visited = new HashSet<>();
	
	int total_questions = questions.length;
	int index;
	
	JTextArea textarea;
	JLabel pic;
	
	JButton choice1;
	JButton choice2;
	JButton choice3;
	JButton choice4;
	
	int point;
	
	String choices [][] = 
		{
				{"A", "B", "F", "O"},
				{"X", "A", "H", "J"},
				{"B", "O", "W", "G"},
				{"H", "S", "X", "U"},
				{"S", "Q", "R", "P"},
				{"I", "B", "G", "S"},
				{"O", "U", "N", "B"},
				{"R", "P", "B", "V"},
				{"Y", "G", "Z", "N"},
				{"C", "P", "L", "S"}
		};
	
	char answer; 
	
	char[] answers = 
	{
			'A','C','D','B','A','B','C',
			'A','D','B'
	};
	
	ImageIcon[] image = 
	{
			 new ImageIcon(this.getClass().getResource("/apple1.jpg")),
			 null,
			 new ImageIcon(this.getClass().getResource("/dog1.jpg")),
			 new ImageIcon(this.getClass().getResource("/flower.jpg")),
			 null,
			 new ImageIcon(this.getClass().getResource("/animal.png")),
			 null,
			 new ImageIcon(this.getClass().getResource("/color.png")),
			 new ImageIcon(this.getClass().getResource("/corn.jpg")),
			 null
	};

	private JPanel contentPane;
	private Panel panel_1;
	private JTextField txtAlphabetLearner;
	private JTextField scoreText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setLocationRelativeTo(null);
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
	public Game() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 271, 763);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton EXIT2_Button = new JButton("Exit");
		EXIT2_Button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		EXIT2_Button.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		EXIT2_Button.setBounds(37, 469, 201, 85);
		panel.add(EXIT2_Button);
		
		JButton HTP2_Button = new JButton("How To Play");
		HTP2_Button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				UIManager.put("OptionPane.minimumSize",new Dimension(780,300));
				UIManager.put("OptionPane.background", new Color(204, 204, 255));
				UIManager.put("Panel.background",new Color(204, 204, 255));
				JTextArea msg = new JTextArea();
				msg.setBackground(new Color(204, 204, 255));
				msg.setText("  You will be asked an alphabet question.\r\n"
						+ "  choice will be displayed on the screen.\r\n"
						+ "  Click on the choice you think is correct.");
				msg.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
				JOptionPane.showMessageDialog(frame, msg, "How to Play",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		HTP2_Button.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		HTP2_Button.setBounds(37, 216, 201, 85);
		panel.add(HTP2_Button);
		
		txtAlphabetLearner = new JTextField();
		txtAlphabetLearner.setHorizontalAlignment(SwingConstants.CENTER);
		txtAlphabetLearner.setText("Alphabet\r\nLearner");
		txtAlphabetLearner.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		txtAlphabetLearner.setBounds(0, 0, 271, 120);
		txtAlphabetLearner.setEditable(false);
		panel.add(txtAlphabetLearner);
		
		scoreText = new JTextField();
		scoreText.setText("Score: 0/0");
		scoreText.setHorizontalAlignment(SwingConstants.CENTER);
		scoreText.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		scoreText.setEditable(false);
		scoreText.setBounds(0, 608, 271, 120);
		panel.add(scoreText);
		//txtAlphabetLearner.setColumns(10);
		
		choice1 = new JButton();
		choice1.setBounds(323, 576, 121, 118);
		choice1.addActionListener(this);
		contentPane.add(choice1);
		
		choice2 = new JButton();
		choice2.setBounds(470, 576, 121, 118);
		choice2.addActionListener(this);
		contentPane.add(choice2);
		
		choice3 = new JButton();
		choice3.setBounds(618, 576, 121, 118);
		choice3.addActionListener(this);
		contentPane.add(choice3);
		
		choice4 = new JButton();
		choice4.setBounds(772, 576, 121, 118);
		choice4.addActionListener(this);
		contentPane.add(choice4);
		
		panel_1 = new Panel();
		panel_1.setBounds(307, 42, 611, 465);
		
	
		textarea = new JTextArea();
		textarea.setLineWrap(true);
		textarea.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		textarea.setBounds(0,0,611,59);
		textarea.setEditable(false);
		
		
		pic = new JLabel("");
		pic.setBounds(106,65,400,400);
		
		
		nextQuestion();
		
		panel_1.setLayout(null);
		panel_1.add(textarea);
		panel_1.add(pic);
		
		contentPane.add(panel_1);
		
		try
		{
			gameSound = AudioSystem.getClip();
			AudioInputStream input = 
					AudioSystem.getAudioInputStream
					(new File("Music/Jingle_Bells.wav"));
			gameSound.open(input);
			gameSound.loop(Clip.LOOP_CONTINUOUSLY);
			gameSound.start();
		}
		
		catch (UnsupportedAudioFileException e) 
		{
            e.printStackTrace();
        } 
		
		catch (IOException e) 
		{
            e.printStackTrace();
        } 
		
		catch (LineUnavailableException e) 
		{
            e.printStackTrace();
        }
		
		
	}
	
	// ask question
	public void nextQuestion()
	{
		scoreText.setText("Score: " + point + "/" + visited.size());
		if(visited.size() >= total_questions) // user completed all questions
		{
			System.out.println("Points: " + point);
			// Testing statement
			System.exit(0);
		}
		
		else 
		{
			index = r.nextInt(questions.length);
			
			 while (visited.contains(index)) 
			 {
	                index = r.nextInt(questions.length);
	         }
			 
	         visited.add(index);
			

			textarea.setText(questions[index]);
			pic.setIcon(image[index]);

			choice1.setText(choices[index][0]);
			choice1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

			choice2.setText(choices[index][1]);
			choice2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

			choice3.setText(choices[index][2]);
			choice3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));

			choice4.setText(choices[index][3]);
			choice4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
			

		}
		
		
	}
	
	// user answered, check if correct
	public void actionPerformed(ActionEvent e)
	{
		/* choice1.setEnabled(false);

		choice2.setEnabled(false);

		choice3.setEnabled(false);

		choice4.setEnabled(false); */
		
		UIManager.put("OptionPane.minimumSize",new Dimension(400,100));
		UIManager.put("OptionPane.background", new Color(229,204,255));
		UIManager.put("Panel.background", new Color(229,204,255));
		
		if(e.getSource()== choice1) 
		{
			answer = 'A';
			if(answer == answers[index]) 
			{
				try
				{
					clipSoundC = AudioSystem.getClip();
					AudioInputStream input = 
							AudioSystem.getAudioInputStream
							(new File("Music/CorrectFINAL.wav"));
					clipSoundC.open(input);
					clipSoundC.start();
					
					JLabel correct = new JLabel("    Correct!");
					correct.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
					correct.setForeground(Color.BLUE);
					JOptionPane.showMessageDialog(frame, correct);
					stopMusicC();
					
				}
				
				catch (UnsupportedAudioFileException err) 
				{
		            err.printStackTrace();
		        } 
				
				catch (IOException ex) 
				{
		            ex.printStackTrace();
		        } 
				
				catch (LineUnavailableException er) 
				{
		            er.printStackTrace();
		        }
				
				point++;
				nextQuestion();
			}
			
			else
			{
				try
				{
					clipSoundI = AudioSystem.getClip();
					AudioInputStream input = 
							AudioSystem.getAudioInputStream
							(new File("Music/IncorrectFINAL.wav"));
					clipSoundI.open(input);
					clipSoundI.start();
					
					JLabel incorrect = new JLabel("    Incorrect!");
					incorrect.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
					incorrect.setForeground(Color.RED);
					JOptionPane.showMessageDialog(frame, incorrect);
					
					stopMusicI();
				}
				
				catch (UnsupportedAudioFileException err) 
				{
		            err.printStackTrace();
		        } 
				
				catch (IOException ex) 
				{
		            ex.printStackTrace();
		        } 
				
				catch (LineUnavailableException er) 
				{
		            er.printStackTrace();
		        }
				
				nextQuestion();
			}
		}
		
		if(e.getSource()== choice2) 
		{
			answer = 'B';
			if(answer == answers[index]) 
			{
				try
				{
					clipSoundC = AudioSystem.getClip();
					AudioInputStream input = 
							AudioSystem.getAudioInputStream
							(new File("Music/CorrectFINAL.wav"));
					clipSoundC.open(input);
					clipSoundC.start();
					
					JLabel correct = new JLabel("    Correct!");
					correct.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
					correct.setForeground(Color.BLUE);
					JOptionPane.showMessageDialog(frame, correct);
					stopMusicC();
					
				}
				
				catch (UnsupportedAudioFileException err) 
				{
		            err.printStackTrace();
		        } 
				
				catch (IOException ex) 
				{
		            ex.printStackTrace();
		        } 
				
				catch (LineUnavailableException er) 
				{
		            er.printStackTrace();
		        }
				
				point++;
				nextQuestion();
			}
			
			else
			{
				try
				{
					clipSoundI = AudioSystem.getClip();
					AudioInputStream input = 
							AudioSystem.getAudioInputStream
							(new File("Music/IncorrectFINAL.wav"));
					clipSoundI.open(input);
					clipSoundI.start();
					
					JLabel incorrect = new JLabel("    Incorrect!");
					incorrect.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
					incorrect.setForeground(Color.RED);
					JOptionPane.showMessageDialog(frame, incorrect);
					
					stopMusicI();
				}
				
				catch (UnsupportedAudioFileException err) 
				{
		            err.printStackTrace();
		        } 
				
				catch (IOException ex) 
				{
		            ex.printStackTrace();
		        } 
				
				catch (LineUnavailableException er) 
				{
		            er.printStackTrace();
		        }
				
				nextQuestion();
			}
		}
		
		if(e.getSource()== choice3) 
		{
			answer = 'C';
			if(answer == answers[index]) 
			{
				try
				{
					clipSoundC = AudioSystem.getClip();
					AudioInputStream input = 
							AudioSystem.getAudioInputStream
							(new File("Music/CorrectFINAL.wav"));
					clipSoundC.open(input);
					clipSoundC.start();
					
					JLabel correct = new JLabel("    Correct!");
					correct.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
					correct.setForeground(Color.BLUE);
					JOptionPane.showMessageDialog(frame, correct);
					
					stopMusicC();
					
				}
				
				catch (UnsupportedAudioFileException err) 
				{
		            err.printStackTrace();
		        } 
				
				catch (IOException ex) 
				{
		            ex.printStackTrace();
		        } 
				
				catch (LineUnavailableException er) 
				{
		            er.printStackTrace();
		        }
				
				point++;
				nextQuestion();
			}
			
			else
			{
				try
				{
					clipSoundI = AudioSystem.getClip();
					AudioInputStream input = 
							AudioSystem.getAudioInputStream
							(new File("Music/IncorrectFINAL.wav"));
					clipSoundI.open(input);
					clipSoundI.start();
					
					JLabel incorrect = new JLabel("    Incorrect!");
					incorrect.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
					incorrect.setForeground(Color.RED);
					JOptionPane.showMessageDialog(frame, incorrect);
					
					stopMusicI();
					
				}
				
				catch (UnsupportedAudioFileException err) 
				{
		            err.printStackTrace();
		        } 
				
				catch (IOException ex) 
				{
		            ex.printStackTrace();
		        } 
				
				catch (LineUnavailableException er) 
				{
		            er.printStackTrace();
		        }
				
				nextQuestion();
			}
		}
		
		if(e.getSource()== choice4) 
		{
			answer = 'D';
			if(answer == answers[index]) 
			{
				try
				{
					clipSoundC = AudioSystem.getClip();
					AudioInputStream input = 
							AudioSystem.getAudioInputStream
							(new File("Music/CorrectFINAL.wav"));
					clipSoundC.open(input);
					clipSoundC.start();
					
					JLabel correct = new JLabel("    Correct!");
					correct.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
					correct.setForeground(Color.BLUE);
					JOptionPane.showMessageDialog(frame, correct);
					
					stopMusicC();
					
				}
				
				catch (UnsupportedAudioFileException err) 
				{
		            err.printStackTrace();
		        } 
				
				catch (IOException ex) 
				{
		            ex.printStackTrace();
		        } 
				
				catch (LineUnavailableException er) 
				{
		            er.printStackTrace();
		        }
				
				point++;
				nextQuestion();
			}
			
			else
			{
				try
				{
					clipSoundI = AudioSystem.getClip();
					AudioInputStream input = 
							AudioSystem.getAudioInputStream
							(new File("Music/IncorrectFINAL.wav"));
					clipSoundI.open(input);
					clipSoundI.start();
					
					JLabel incorrect = new JLabel("    Incorrect!");
					incorrect.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
					incorrect.setForeground(Color.RED);
					JOptionPane.showMessageDialog(frame, incorrect);
					
					stopMusicI();
					
				}
				
				catch (UnsupportedAudioFileException err) 
				{
		            err.printStackTrace();
		        } 
				
				catch (IOException ex) 
				{
		            ex.printStackTrace();
		        } 
				
				catch (LineUnavailableException er) 
				{
		            er.printStackTrace();
		        }
				
				nextQuestion();
			}
		}
		
		
	}
	
	public void stopMusicC()
	{
		clipSoundC.stop();
	}
	
	public void stopMusicI()
	{
		clipSoundI.stop();
	}
}
