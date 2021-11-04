/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Driver class to test Triangle and TriangularPyramid
 */

public class TriangleAndPyramidApp { // driver class

	public static void main(String[] args) { // main method
		Triangle myTriangle = new Triangle(); // create triangle
		myTriangle.setBase(2); // set values
		myTriangle.setHeight(1);
		System.out.println(myTriangle.toString()); // output result
		
		TriangularPyramid myPyramid = new TriangularPyramid(); // create pyramid
		myPyramid.setBase(2); // set values
		myPyramid.setHeight(1);
		System.out.println(myPyramid.toString()); // output result
	}
}
