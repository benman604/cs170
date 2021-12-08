/*
 * operation superclass to calculate area of triangle
 */
public class Triangle {
	double base;
	double height;
	
	public Triangle(double base, double height) { // constructor
		this.base = base;
		this.height = height;
	}
	
	public double getTriangleArea() { // calculate and returns area
		return 0.5 * base * height;
	}
	
	@Override
	public String toString() { // returns data in string
		return "Triangle:\n"
				+ "Base: " + base + "\n"
				+ "Height: " + height + "\n"
				+ "Area: " + getTriangleArea();
	}
}
