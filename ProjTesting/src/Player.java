import javax.swing.JTextField;

public class Player 
{
	// hard code players
	// add in an array list
	// sort
	// write into file?
	JTextField playerName;
	int score;
	
	public Player(JTextField playerName, int score)
	{
		this.playerName = playerName;
		this.score = score;
    }
	
	public JTextField getName() 
	{
		return playerName;
    }
	
	public int getScore()
	{
		return score;
	}
	
	public String toString()
	{
		return playerName + ": " + score;
	}
	
	

}
