import java.util.Random;

public class Question {
	private String question;
	private char correctAnswer;
	
	public Question(String question, char correctAnswer) {
		this.question = question;
		this.correctAnswer = correctAnswer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public char getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(char correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	public char[] getChoices() {
		char[] choices = new char[4];
		choices[0] = correctAnswer;
		
		Random r = new Random();
		int i = 1;
		while(i < 3) {
			char c = (char)(r.nextInt(26) + 'A');
			if (c != correctAnswer){
				choices[i] = c;
				i++;
			}
		}
		return choices;
	}
}
