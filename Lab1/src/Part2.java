/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 1
 * Submission Date: Sep 22 10PM
 * Brief Description: Driver class to collect input, create WeightConvertor objects, and call its methods.
 */


import java.util.Scanner; // import scanner

public class Part2 { // driver class

	public static void main(String[] args) { // main method
		Scanner keyboard = new Scanner(System.in); // create scanner
		
		while(true) { // input loop
			System.out.print("Enter weight: "); // prompt user
			String input = keyboard.next(); // read input
			
			if(input.equals("n")) {
				break;
			}
			
			try { // attempt to parse input string as double
				double weight = Double.parseDouble(input); // parse input string
				WeightConvertor convertor = new WeightConvertor(weight); // create WeightConvertor
				convertor.Compute(); // call compute method
			} // end try
			catch(Exception e){ // catch any exceptions
				System.out.println("ERROR: " + e.getMessage());
			} // end try-catch
		} // end input loop
		
		keyboard.close(); // close scanner
	} // end main method

} // end driver class
