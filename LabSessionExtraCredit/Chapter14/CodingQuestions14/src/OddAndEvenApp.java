/*
 * Driver class to test EvenOddThread
 */
public class OddAndEvenApp { // driver class

	public static void main(String[] args) { // main method
		Thread evenThread = new EvenOddThread(true); // create even thread
		Thread oddThread = new EvenOddThread(false); // create odd thread
		oddThread.setName("Odd Thread "); // set name
		evenThread.setName("Even Thread");
		oddThread.setPriority(2); // set priority
		evenThread.setPriority(1);
		oddThread.start(); // start thread
		evenThread.start();
	} // end main method

} // end driver class