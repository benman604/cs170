/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Operation Superclass for Triangles
 */

public class Triangle { // operation class
	// Variables for triangle
	private float base;
	private float height;
	
	// Getters and setters
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	// Override toString()
	@Override
	public String toString() {
		return(
				"Base: " + this.base + "\n" +
				"Height: " + this.height + "\n" +
				"Area: " + this.computeArea() + "\n"
				);
	}
	
	// Returns computed area
	public float computeArea() {
		return(this.base * this.height / 2);
	}
} // end operation class
