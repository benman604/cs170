/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 4
 * Submission Date: Wed Nov 10, 2021 10pm
 * Brief Description: Operation class for a runnable thread which prints even or odd numbers
 */

public class EvenOddThread extends Thread implements Runnable{ // operation class
	boolean isEven; // true if thread prints even numbers
	
	public EvenOddThread(boolean isEven) { // constructor 
		this.isEven = isEven; // set isEven
	} // end constructor
	
	@Override
	public synchronized void run() { // run method
		for(int number=1; number <= 100; number++) { // loop 1-100
			if((isEven && number % 2 == 0) || (!isEven && number % 2 == 1)) { // check if number should be printed
				System.out.println(Thread.currentThread().getName() + " : " + number); // print thread name and number
			}
			Thread.yield(); // yield to other thread 
		}
	} // end run method
} // end operation class
