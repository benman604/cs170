import java.io.FileInputStream;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class TitleScreen extends EmbeddedLayout {
	
	public TitleScreen(AlphabetLearningApp parent) {
		super(parent, "rgb(215, 165, 192)");
		
		HBox imageContainer = new HBox();
		imageContainer.setAlignment(Pos.CENTER);
		
		try {
			Image logoImage = new Image(new FileInputStream("logo.jpg"));
			Image titleImage = new Image(new FileInputStream("title-image.png"));
			ImageView logoView = new ImageView(logoImage);
			ImageView titleView = new ImageView(titleImage);
			logoView.setFitHeight(200);
			logoView.setPreserveRatio(true);
			titleView.setFitHeight(200);
			titleView.setPreserveRatio(true);
			imageContainer.getChildren().addAll(logoView, titleView);
		} 
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		Button playBtn = new Button("Play");
		Label welcome = new Label("Welcome!");
		welcome.setFont(new Font(50));
		playBtn.setPrefSize(200, 50);
		playBtn.setFont(new Font(30));
		layout.getChildren().addAll(welcome, imageContainer, playBtn);
		
		playBtn.setOnAction(e->{
			GameScreen game = new GameScreen(parent, new ImageQuestion('A', "Correct answer is A", "logo.jpg"));
			game.attachToParent();
		});
	}
}
