/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 4
 * Submission Date: Wed Nov 10, 2021 10pm
 * Brief Description: Driver class to create odd and even threads and run them
 */

public class OddAndEvenApp { // driver class

	public static void main(String[] args) { // main method
		Thread evenThread = new EvenOddThread(true); // create even thread
		Thread oddThread = new EvenOddThread(false); // create odd thread
		oddThread.setName("Odd Thread "); // set name
		evenThread.setName("Even Thread");
		oddThread.start(); // start thread
		evenThread.start();
	} // end main method

} // end driver class