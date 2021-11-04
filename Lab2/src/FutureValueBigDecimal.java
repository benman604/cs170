/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 2
 * Submission Date: Oct 6 10pm
 * Brief Description: Operation class for calculating future value with BigDecimal
 */

// import libraries
import java.math.BigDecimal;
import java.math.MathContext;
import javax.swing.*;

public class FutureValueBigDecimal { // Operation class
	// Initialize variables
	String name;
	BigDecimal monthlyInvestment;
	BigDecimal yearlyRate;
	BigDecimal futureValue = new BigDecimal(0);
	int years;
	
	// Getters and Setters for variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getMonthlyInvestment() {
		return monthlyInvestment;
	}
	public void setMonthlyInvestment(BigDecimal monthlyInvestment) {
		this.monthlyInvestment = monthlyInvestment;
	}
	public BigDecimal getYearlyRate() {
		return yearlyRate;
	}
	public void setYearlyRate(BigDecimal yearlyRate) {
		this.yearlyRate = yearlyRate;
	}
	public BigDecimal getFutureValue() {
		return futureValue;
	}
	public void setFutureValue(BigDecimal futureValue) {
		this.futureValue = futureValue;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	public void computeFutureValue() { // Method to compute future value
		BigDecimal monthlyRate = yearlyRate.divide(new BigDecimal(12 * 100), MathContext.DECIMAL128); // set monthly rate to yearlyRate / 12 / 100
		int months = years * 12;
		int i = 0;
		while(i <= months) { // loop till i <= months
			// calculate future value
			futureValue = futureValue.add(monthlyInvestment).multiply((monthlyRate.add(new BigDecimal(1))));
			i++;
		}
	} // end computeFutureValue
	
	public void outputResult(JFrame frame) { // print/show output to console or JOptionPane
		String message = "Your future value report: " 
				        + "Name: " + name + "\nMonthly investment: "				//build output message
				 		+ FormattedOutput.currencyOutput(monthlyInvestment)
				 		+ "\nYearly interest rate: "
						+ FormattedOutput.percentOutput(yearlyRate, 3)
						+ "\nInvest years: " + years
						+ "\nFuture return: " + FormattedOutput.currencyOutput(futureValue);							
		if(frame == null) { // not using JOptionPane, print message
			System.out.println(message);
		} else { // Show message using JOptionPane
			JOptionPane.showMessageDialog(frame, message);
		} // end if statement
	} // end outputResult
	
	
	
} // End operation class
