import java.io.FileInputStream;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class TitleScreen extends EmbeddedLayout {
	
	public TitleScreen(AlphabetLearningApp parent) {
		this.parent = parent;
		layout = new VBox();
		
		HBox imageContainer = new HBox();
        BackgroundFill fill = new BackgroundFill(Color.web("rgb(215, 165, 192)"), CornerRadii.EMPTY, Insets.EMPTY);
        
		layout.setPadding(new Insets(10, 10, 10, 10));
		layout.setBackground(new Background(fill));
		layout.setAlignment(Pos.CENTER);
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
	}
}
