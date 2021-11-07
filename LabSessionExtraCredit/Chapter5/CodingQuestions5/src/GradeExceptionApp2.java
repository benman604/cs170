//Demo of testing the Grade class with nested while loop, if-else exception handling, and throw

import javax.swing.JOptionPane;

public class GradeExceptionApp2 {

	public static void main(String[] args) {
		Grade grade = new Grade();	//create an object

		double score = 0;

		String str, message;
		boolean notDone = true;
	    while (notDone) {
		  try {		//
			//ask for input score
			str = JOptionPane.showInputDialog("please enter an integer score: ");
			score = Double.parseDouble(str); //convert to int; will automatically throw NumberFormatException if it cannot be converted
		    if (score < 0 || score > 100)  //if the score is out of the range
		    	throw new Exception ("Score is out of the range 0-100");  //otherwise score is verified
				notDone = false;
		  }
		  catch (NumberFormatException e ){  //handling score is not a valid integer 
			JOptionPane.showMessageDialog(null, "Input error.  Enter an double as student score.");
			continue;
		  }
		  
		  catch (Exception e ){   //handling score is out of the range 
				JOptionPane.showMessageDialog(null, "Input error.  Score is out of the range 0-100");
				continue;
		  }
	    }     //end of while loop
		grade.setScore(score);			//call the method to set the score
		grade.assginGrade();			//call the method to assign the grade

		//build the output message
		message = "Your score is " + score + " and grade is " + grade.getGrade();

		//output the message
		JOptionPane.showMessageDialog(null, message);
	}	//end of main()
}		//end of GradeApp class
