
/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Project: Alphabet Learning Game
 * Submission Date: 
 * Brief Description: Driver class to create GUI for game layout
 */

// import javafx library components
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class AlphabetLearningApp extends Application implements ExtendableLayout { // driver class
	private BorderPane pane = new BorderPane();
	
	public static void main(String[] args) { // main method
		Application.launch(args); // launch app
	} // end main method
	
    public void start(Stage primaryStage) throws Exception { // start method
        primaryStage.setTitle("Alphabet Learner"); // set title
        primaryStage.setWidth(900); // set width
        primaryStage.setHeight(700); // set height
        
        BackgroundFill background_fill = new BackgroundFill(Color.DARKGREEN, CornerRadii.EMPTY, Insets.EMPTY);
        
        BorderPane topMenu = new BorderPane();
        HBox topLeft = new HBox();
        HBox topRight = new HBox();
        Button htpBtn = new Button("How to Play");
        Button exitBtn = new Button("Exit");
        Label title = new Label("Alphabet Learner");
        title.setTextFill(Color.WHITE);
        topLeft.getChildren().add(title);
        topRight.getChildren().addAll(htpBtn, exitBtn);
        topRight.setAlignment(Pos.TOP_RIGHT);
        topLeft.setAlignment(Pos.TOP_LEFT);
        topMenu.setPadding(new Insets(10, 10, 10, 10));
        topMenu.setBackground(new Background(background_fill));
        topMenu.setLeft(topLeft);
        topMenu.setRight(topRight);
        
        htpBtn.setOnAction(e->{
        	Alert htp = new Alert(AlertType.INFORMATION);
        	htp.setTitle("How to Play");
        	htp.setHeaderText("Alphabet Learner");
        	htp.setContentText("How to Play");
        	htp.showAndWait();
        });
        
        exitBtn.setOnAction(e->{
            Stage stage = (Stage) exitBtn.getScene().getWindow();
            stage.close();
        });
        
        pane.setTop(topMenu);
        
        TitleScreen titleScreen = new TitleScreen(this);
        titleScreen.attachToParent();
        
        Scene scene = new Scene(pane, 300, 100); // scene containing container
        primaryStage.setScene(scene); // set scene
        primaryStage.show(); // show scene
    } // end start method
    
    public void updateMainArea(Node node) {
    	pane.setCenter(node);
    }
    
} // end driver class

