/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Driver class for business account app
 */

public class BusinessAccountApp { // driver class

	public static void main(String[] args) { // main method
		BusinessAccount john = new BusinessAccount(); // create instance
		john.setName("John Q. Adams"); // call methods
		john.deposit(500.00);
		john.withdraw(25.50);
		System.out.println(john.toString()); // display output
		
		BusinessAccount jackson = new BusinessAccount(); // create instance
		jackson.setName("Andrew Jackson"); // call methods
		jackson.deposit(20000.00);
		jackson.withdraw(20000.00);
		System.out.println(jackson.toString()); // display output
	} // end main method

} // end driver class
