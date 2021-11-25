import java.io.FileInputStream;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class ImageQuestion extends Question {
	private String imageLocation;
	
	public ImageQuestion(char correctAnswer, String question, String imageLocation) {
		super(correctAnswer, question);
		this.imageLocation = imageLocation;
	}
	
	@Override
	public VBox getQuestionLayout() {
		VBox box = new VBox();
		try {
			Label label = new Label(question);
			Image image = new Image(new FileInputStream(imageLocation));
			ImageView imageView = new ImageView(image);
			imageView.setFitHeight(300);
			imageView.setPreserveRatio(true);
			box.getChildren().addAll(label, imageView);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		box.setAlignment(Pos.CENTER);
		return box;
	}

}
