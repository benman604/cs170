import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class Question {
	private char correctAnswer;
	protected String question;
	
	public Question(char correctAnswer, String question) {
		this.correctAnswer = correctAnswer;
		this.question = question;
	}
	
	public String getCorrectAnswer() {
		return String.valueOf(Character.toUpperCase(correctAnswer));
	}
	
	public VBox getQuestionLayout() {
		VBox box = new VBox();
		Label label = new Label(question);
		label.setFont(new Font(30));
		box.getChildren().add(label);
		box.setAlignment(Pos.CENTER);
		return box;
	}
	
	public void answerQuestion(Boolean correct) {
		if(correct) {
        	Alert alert = new Alert(AlertType.INFORMATION);
        	alert.setTitle("Correct!");
        	alert.setHeaderText("Alphabet Learner");
        	alert.setContentText("Congratulations!");
        	alert.showAndWait();
		}
		else {
        	Alert alert = new Alert(AlertType.ERROR);
        	alert.setTitle("Wrong!");
        	alert.setHeaderText("Alphabet Learner");
        	alert.setContentText("Close! The correct answer was " + correctAnswer);
        	alert.showAndWait();
		}
	}
}
