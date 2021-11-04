/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 2
 * Submission Date: Oct 6 10pm
 * Brief Description: Utility class to validate data
 */

import java.util.Scanner;
import java.math.BigDecimal;
import javax.swing.*;

public class Validator {
	
	public static BigDecimal validateBigDecimalWithRange(Scanner sc, String prompt, String min, String max) { // validates BigDecimal input with min and max
		boolean isValid = false;
		BigDecimal data = new BigDecimal(0);

		while(!isValid) {
			try {
				   System.out.print(prompt);

				   if (!sc.hasNext())     //Not a double					   												
						throw new NumberFormatException("\nData input error.  Please enter a BegDecimal type data...");	 
						data = new BigDecimal(sc.next());	//Receive double

						if (data.compareTo(new BigDecimal(min)) == -1 || data.compareTo(new BigDecimal(max)) == 1)		//not in the right range
					       throw new Exception("Data is out of range " + min + " - " + max); //throw the error message
						isValid = true;				
			 }								//End of try

			catch (NumberFormatException e) {
				System.out.println(e);
				sc.nextLine();		//Clear buffer
			 }						//End of catch
			catch (Exception e) {
				System.out.println(e);
				sc.nextLine();
			 }
			} //End of while
			return data;
		}	//end of validateBigDecimalWithRange()

	//Method of validateInt()with range
	public static int validateIntWithRange(Scanner sc, String prompt, int min, int max) { // validates interger with a range
		boolean isValid = false;
		int data = 0;
		sc.nextLine();								//Clear the buffer

		 while(!isValid) {
		  try {
	 		System.out.print(prompt);
			if (!sc.hasNextInt())
				throw new NumberFormatException("\nData input error.  Please enter an integer type data...");
			data = sc.nextInt();

			if (data < min || data > max) 				//less than min
					throw new Exception("Data is out of range " + min + " - " + max);		//Throw the exception
			isValid = true;   //otherwise data is correct
		  }		//End of try
		catch (NumberFormatException e) {
			System.out.println(e);
			sc.nextLine();		//Clear buffer
		 }						//End of catch
		catch (Exception e) {
			System.out.println(e);
			sc.nextLine();
		 }
		} 						//End of while
		return data;
	 }	//End of validateIntWithRange()


	public static String validateYN(Scanner sc, String prompt) { // validates a yes or no
		boolean isValid = false; 
		String choice = "";
		while (!isValid) {
			try {
				System.out.println(prompt);
				choice = sc.next(); 
				if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n"))
					isValid = true;
				else
					throw new Exception("Invalid entry and try again...");
			}
			catch (Exception e) {
				System.out.println(e);
				sc.nextLine();
				continue;
			}
		}   //end of while loop
		return choice;
	}  //end of validateYN()
	
	public static BigDecimal validateBigDecimalWithRangeAndJOptionPane(JFrame frame, String prompt, String min, String max) { // validates BigDecimal via JOptionPane
		boolean isValid = false;
		BigDecimal data = new BigDecimal(0);

		while(!isValid) { 
			try {
				   String input = JOptionPane.showInputDialog(frame, prompt);

				   if (input.isBlank())     //Not a double					   												
						throw new NumberFormatException("\nData input error.  Please enter a BegDecimal type data...");	 
						data = new BigDecimal(input);	//Receive double

						if (data.compareTo(new BigDecimal(min)) == -1 || data.compareTo(new BigDecimal(max)) == 1)		//not in the right range
					       throw new Exception("Data is out of range " + min + " - " + max); //throw the error message
						isValid = true;				
			 }								//End of try

			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(frame, e);
			 }						//End of catch
			catch (Exception e) {
				JOptionPane.showMessageDialog(frame, e);
			 }
			} //End of while
			return data;
	} // end validateBigDecimalWithRangeAndJOptionPane
	
	public static int validateIntWithRangeAndJOptionPane(JFrame frame, String prompt, int min, int max) { // validates interger with JOptionPane
		boolean isValid = false;
		int data = 0;

		 while(!isValid) {
		  try {
	 		String strinput = JOptionPane.showInputDialog(frame, prompt);
	 		data = Integer.parseInt(strinput);

			if (data < min || data > max) 				//less than min
					throw new Exception("Data is out of range " + min + " - " + max);		//Throw the exception
			isValid = true;   //otherwise data is correct
		  }		//End of try
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame, e);
		 }						//End of catch
		catch (Exception e) {
			JOptionPane.showMessageDialog(frame, e);
		 }
		} 						//End of while
		return data;
	 }	//End of validateIntWithRangeAndJOptionPane()
	
	public static String validateYNWithJOptionPane(JFrame frame, String prompt) { // validates yes/no with JOptionPane
		boolean isValid = false; 
		int choice;
		String result = "y";
		while (!isValid) {
			try {
				choice = JOptionPane.showConfirmDialog(frame, prompt);
				System.out.println(choice);
				switch(choice) {
				case 0:
					result = "y";
					break;
				case 1:
					result = "n";
					break;
				}
				isValid = true;
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(frame, e);
				continue;
			}
		}   //end of while loop
		return result;
	}  //end of validateYNWithJOptionPane()
	
}	   //End of Validator