/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Operation class for senior workers
 */

public class SeniorWorker extends RegularWorker { // operation class
	private double meritPay; 
	
	public SeniorWorker(String name, double salary, double overtimePay) { // constructor
		super(name, salary, overtimePay);
		this.meritPay = salary / 10;
	}
	
	@Override
	public double earnings() { // calculate and returns earnings
		return salary + overtimePay + meritPay;
	}
	
	@Override
	public String toString() { // returns data and results
		return "Senior Worker: " + getName() + "\n" +
				"Salary: " + salary + "\n" +
				"Overtime Pay: " + overtimePay + "\n" +
				"Merit Pay: " + meritPay + "\n" +
				"Total Salary: " + earnings();
	}

} // end operation class
