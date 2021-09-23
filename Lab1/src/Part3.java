/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 1
 * Submission Date: Sep 22 10PM
 * Brief Description: Driver class to create SquareCube objects and call their methods to display result.
 */

public class Part3{ // driver class
	public static void main(String[] args){ // main method
		System.out.printf("%-10s %-10s %-10s\n", "Number", "Square", "Cube"); // print header
		for(int i=1; i<=10; i++){ // loop through i=1 to i=10
			SquareCube object = new SquareCube(i); // create SquareCube
			object.DisplayResult(); // display result
		} // end loop
	} // end main method
} // end driver class
