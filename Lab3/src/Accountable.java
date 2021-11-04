/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Interface for accounts with ballances and ability to withdraw
 */

public interface Accountable { // interface
	void withdraw(double amount); // require withdraw method
	double getBallance(); // require get method for ballance
} // end interface
