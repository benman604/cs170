/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 4
 * Submission Date: Wed Nov 10, 2021 10pm
 * Brief Description: Validator class to collect and validate input
 */

import java.util.Scanner;

public class Validator {
	public static int validateIntWithRange(Scanner sc, String prompt, int min, int max) {
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
	
	public static char validataCharWithRange(Scanner sc, String prompt, char min, char max) {
		boolean isValid = false;
		char data = 'a';
		sc.nextLine();								//Clear the buffer

		 while(!isValid) {
		  try {
	 		System.out.print(prompt);
			if (!sc.hasNext())
				throw new NumberFormatException("\nData input error.  Please enter an character type data...");
			String input = sc.next();
			if(input.length() > 1) {
				throw new Exception("Data input error.  Please enter an character type data...");
			}
			data = input.charAt(0);
			
			if (data < min || data > max || data == 'E') 				//less than min (also no "e")
					throw new Exception("Data is out of range " + min + " - " + max + " (No Es)");		//Throw the exception
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
	}
	
	
}
