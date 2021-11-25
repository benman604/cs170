import java.util.Random;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class GameScreen extends EmbeddedLayout {
	private Question question;
	
	public GameScreen(AlphabetLearningApp parent, Question question) {
		super(parent, "rgb(255, 200, 200)");
		this.question = question;
		
		HBox optionsLayout = new HBox();
		Random random = new Random();
		
		for(int i=0; i<4; i++) {
			char randomChar = (char)(random.nextInt(26) + 'a');
			Button wrongOption = new Button(String.valueOf(Character.toUpperCase(randomChar)));
			wrongOption.setPrefSize(70, 70);
			wrongOption.setFont(new Font(30));
			wrongOption.setOnAction(e->{
				question.answerQuestion(false);
			});
			optionsLayout.getChildren().add(wrongOption);
		}
		
		Button correctOption = new Button(question.getCorrectAnswer());
		correctOption.setPrefSize(70, 70);
		correctOption.setFont(new Font(30));
		correctOption.setOnAction(e->{
			question.answerQuestion(true);
		});
		optionsLayout.getChildren().add(random.nextInt(4), correctOption);
		
		optionsLayout.setAlignment(Pos.CENTER);
		layout.getChildren().addAll(question.getQuestionLayout(), optionsLayout);
	}
}
