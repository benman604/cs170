/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 1
 * Submission Date: Sep 22 10PM
 * Brief Description: Operation class to compute squares and cubes of values
 */


public class SquareCube{ // operation class
	public int value = 0; // variable
	public SquareCube(int value){ // constructor method
		this.value = value; // set value
	} // end constructor method

	public int ComputeSquare(){ // square method
		return (int)Math.pow(value, 2); // return square
	} // end square method

	public int ComputeCube(){ // cube method
		return (int)Math.pow(value, 3); // return cube
	} // end cube method

	public void DisplayResult(){ // display result method 
		System.out.printf("%-10s %-10s %-10s\n", value, ComputeSquare(), ComputeCube()); // print result
	} // end display result mehthod
} // end operation class
