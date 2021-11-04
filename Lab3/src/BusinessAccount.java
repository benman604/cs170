/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Operation class for business account app
 */

// import formatter
import java.text.NumberFormat;

public class BusinessAccount implements Accountable, AccountReceivable { // operation class, implement interfaces
	// instance variables
	private double ballance = 0;
	private String name = "";
	
	// setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void deposit(double amount) { // add to ballance
		ballance += amount;
	}

	@Override
	public void withdraw(double amount) { // subtract from ballance
		ballance -= amount;
	}

	@Override
	public double getBallance() { // getter for ballance
		return ballance;
	}
	
	@Override
	public String toString() { // format data to string 
		NumberFormat formatter = NumberFormat.getCurrencyInstance(); // currency formatter
		return name + "'s current ballance is " + formatter.format(ballance); // formatted output
	}
} // end operation class
