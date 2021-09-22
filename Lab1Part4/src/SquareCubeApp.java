/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 1
 * Submission Date: Sep 22 10PM
 * Brief Description: Driver class to collect input, create SquareCube objects, and call its methods.
 */

import java.util.Scanner; // import scanner
public class SquareCubeApp{ // driver class
	public static void main(String[] args){ // main method
		Scanner keyboard = new Scanner(System.in); // create scanner

		System.out.print("Enter lower bound: "); // prompt input
		int lowerBound = keyboard.nextInt(); // collect input

		System.out.print("Enter upper bound: "); // prompt input
		int upperBound = keyboard.nextInt(); // collect input

		System.out.printf("%-10s %-10s %-10s\n", "Number", "Square", "Cube"); // print header
		for(int i=lowerBound; i<=upperBound; i++){ // loop through bounds
			SquareCube object = new SquareCube(i); // create SquareCube object
			object.DisplayResult(); // display result
		} // end loop
	} // end main method
} // end driver class
