/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Operation class for triangular pyramid
 */

public class TriangularPyramid extends Triangle { // operation class extending triangle
	// Overide computeArea()
	@Override
	public float computeArea() { 
		float triangle = this.getBase() * this.getHeight() / 2; // triangle area
		float square = this.getBase() * this.getBase(); // bottom square area
		return((triangle * 4) + square); // 4 triangle sides, one square base
	}
} // end operation class
