/**
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 3
 * Submission Date: Oct 20 10pm
 * Brief Description: Operation Superclass for Triangles
 * @author Benjamin Man
 * @version 1.0
 */

public class Triangle { // operation class
	/**
	 * float measurement for base of triangle
	 */
	private float base;
	/**
	 * float measurement for height of triangle
	 */
	private float height;
	
	/**
	 * Getter method for base value
	 * @return Base value
	 */
	public float getBase() {
		return base;
	}
	/**
	 * Setter method for base value
	 * @param base Value to set base
	 */
	public void setBase(float base) {
		this.base = base;
	}
	/**
	 * Getter method for height value
	 * @return Height value
	 */
	public float getHeight() {
		return height;
	}
	/**
	 * Setter method for height value
	 * @param height Value to set height
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	/**
	 * Returns string with triangle measurements and values
	 * @return String containing triangle values
	 */
	@Override
	public String toString() {
		return(
				"Base: " + this.base + "\n" +
				"Height: " + this.height + "\n" +
				"Area: " + this.computeArea() + "\n"
				);
	}
	
	/**
	 * Returns double area value
	 * @return double area value
	 */
	public float computeArea() {
		return(this.base * this.height / 2);
	}
} // end operation class