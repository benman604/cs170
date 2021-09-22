/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 1
 * Submission Date: Sep 22 10PM
 * Brief Description: Operation class to compute conversion of weights and display results.
 */

public class WeightConvertor { // Operation class
	private double weight; // weight double
	
	public WeightConvertor(double weight) { // constructor method
		this.weight = weight; // set weight
	} // end constructor method
	
	public void Compute() { // compute method
		double kg = weight * 0.453; // compute kg
		double lbs = weight * 2.205; // compute lbs
		System.out.println(weight + " killograms = " + lbs + " pounds"); // display kg
		System.out.println(weight + " pounds = " + kg + " kilograms"); // display lbs
	} // end compute method
} // end operation class
