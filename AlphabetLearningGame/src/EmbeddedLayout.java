import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class EmbeddedLayout {
	protected AlphabetLearningApp parent;
	protected VBox layout;
	
	public EmbeddedLayout(AlphabetLearningApp parent, String backgroundColor) {
		this.parent = parent;
		layout = new VBox();
        BackgroundFill fill = new BackgroundFill(Color.web(backgroundColor), CornerRadii.EMPTY, Insets.EMPTY);
		layout.setPadding(new Insets(10, 10, 10, 10));
		layout.setBackground(new Background(fill));
		layout.setAlignment(Pos.CENTER);
	}
	
	public void attachToParent() {
		parent.updateMainArea(layout);
	}
}
