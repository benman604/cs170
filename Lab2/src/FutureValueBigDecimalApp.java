/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 2
 * Submission Date: Oct 6 10pm
 * Brief Description: Driver class to run FutureValueBigDecimal via console
 */

// import libraries
import java.util.Scanner; 
import java.math.BigDecimal;

public class FutureValueBigDecimalApp { // driver class

	public static void main(String[] args) { // main method
		String choice = "y",		//loop control initial value
				   userName;
		
		while(choice.equalsIgnoreCase("y")) { // input loop
			
			FutureValueBigDecimal futureValue = new FutureValueBigDecimal();  //create an object of FutureValue
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Welcome to future value application!\n\n");
			
			System.out.print("Please enter your name: ");
			userName = sc.next();   //get name
			futureValue.setName(userName);				//set user name
			System.out.println();

			BigDecimal investAmount = Validator.validateBigDecimalWithRange(sc, "enter your monthly invest: ", "1", "1000000"); //verify data
			futureValue.setMonthlyInvestment(investAmount);		//set monthly invest

			BigDecimal interestRate = Validator.validateBigDecimalWithRange(sc, "enter your yearly interest rate: ", "0.1", "3.5"); //verify data
			futureValue.setYearlyRate(interestRate);			//set yearly rate

			int years = Validator.validateIntWithRange(sc, "enter number of years: ", 0, 130); //verify data
			futureValue.setYears(years);	// set years
			
			futureValue.computeFutureValue();			//calculate
			
			futureValue.outputResult(null);  			//formatted output

			choice = Validator.validateYN(sc, "continue? (y/n): ");	//ask for continue or no
	 	} //end of while

	 	System.out.println("\nThank you for using future value application.");

	} // end main method

} // end driver class
