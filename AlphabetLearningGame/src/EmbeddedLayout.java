import javafx.scene.layout.VBox;

public class EmbeddedLayout {
	protected AlphabetLearningApp parent;
	protected VBox layout;
	
	public void attachToParent() {
		parent.updateMainArea(layout);
	}
}
