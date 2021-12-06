
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.event.*;

public class WordCounter extends Application { // driver class
	private Label resultText; // label displaying results
	private TextArea input; // text field recieving input
	
	public static void main(String[] args) { // main method
		Application.launch(args); // launch app
	} // end main method
	
    public void start(Stage primaryStage) throws Exception { // start method
    	
    	
    	
        primaryStage.setTitle("Word Counter"); // set title
        primaryStage.setWidth(400); // set width
        primaryStage.setHeight(500); // set height
        
        resultText = new Label(""); // initalize result label
        input = new TextArea(); // initalize text field
        input.setWrapText(true);
        
        // initalize buttons
        Button submit = new Button("OK");
        Button exit = new Button("Exit");
        
        
        // set click listener for buttons 
        submit.setOnAction(new SubmitHandeler());
        exit.setOnAction(new ExitHandeler());

        VBox box = new VBox( // container for all elements
        		10,
        		input,
        		resultText,
        		submit,
        		exit
        );
        
        Scene scene = new Scene(box, 300, 100); // scene containing container
        box.setAlignment(Pos.CENTER); // align box center
        primaryStage.setScene(scene); // set scene
        primaryStage.show(); // show scene
    } // end start method
    
    class SubmitHandeler implements EventHandler<ActionEvent>{ // submit handler class
		@Override
		public void handle(ActionEvent arg0) { // handle method
			resultText.setText(input.getText().split("\\W+").length + " words"); // count words
		} // end handle method
    } // end submit handler class
    
    class ExitHandeler implements EventHandler<ActionEvent>{ // exit handler class
		@Override
		public void handle(ActionEvent arg0) { // handle method
			System.exit(0); // exit program
		} // end handle method
    } // end handler class
} // end driver class