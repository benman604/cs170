
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
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // yield to other thread 
		}
	} // end run method
} // end operation class