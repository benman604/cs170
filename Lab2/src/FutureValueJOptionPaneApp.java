/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 2
 * Submission Date: Oct 6 10pm
 * Brief Description: Driver class to run FutureValueBigDecimal with JOptionPane
 */

// import libraries
import java.math.BigDecimal;
import javax.swing.*;

public class FutureValueJOptionPaneApp { // driver class

	public static void main(String[] args) { // main method
		JFrame frame = new JFrame("Future Value");
		String choice = "y",		//loop control initial value
				   userName;
		
		while(choice.equalsIgnoreCase("y")) { // input loop
			
			FutureValueBigDecimal futureValue = new FutureValueBigDecimal();  //create an object of FutureValue
			JOptionPane.showMessageDialog(frame, "Welcome to future value application!\n\n");
			
			userName = JOptionPane.showInputDialog(frame, "Please enter your name:");   //get name
			futureValue.setName(userName);	

			BigDecimal investAmount = Validator.validateBigDecimalWithRangeAndJOptionPane(frame, "enter your monthly invest: ", "1", "1000000"); //verify data
			futureValue.setMonthlyInvestment(investAmount);		//set monthly invest

			BigDecimal interestRate = Validator.validateBigDecimalWithRangeAndJOptionPane(frame, "enter your yearly interest rate: ", "0.1", "3.5"); //verify data
			futureValue.setYearlyRate(interestRate);			//set yearly rate

			int years = Validator.validateIntWithRangeAndJOptionPane(frame, "enter number of years: ", 0, 130); //verify data
			futureValue.setYears(years);	//set years
			
			futureValue.computeFutureValue();			//calculate
			
			futureValue.outputResult(frame);  			//formatted output

			choice = Validator.validateYNWithJOptionPane(frame, "continue? ");	//ask for continue or no
	 	} //end of while

	 	JOptionPane.showMessageDialog(frame, "Thank you for using future value application.");

	} // end main method

} // end driver class
