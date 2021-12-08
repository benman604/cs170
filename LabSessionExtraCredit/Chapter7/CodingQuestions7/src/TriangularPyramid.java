/*
 * operation subclass for pyramid
 */
public class TriangularPyramid extends Triangle {
	public TriangularPyramid(double base, double height) { // constructor
		super(base, height);
	}
	
	public double getPyramidArea() { // calculate and returns area of pyramid
		return (getTriangleArea() * 4) + (base * base);
	}
	
	@Override
	public String toString() { // return data in string
		return "Triangular Pyramid:\n"
				+ "Base: " + base + "\n"
				+ "Height: " + height + "\n"
				+ "Surface Area: " + getPyramidArea();
	}
}
