
public class TriangularPyramid extends Triangle {
	public TriangularPyramid(double base, double height) {
		super(base, height);
	}
	
	public double getPyramidArea() {
		return (getTriangleArea() * 4) + (base * base);
	}
	
	@Override
	public String toString() {
		return "Triangular Pyramid:\n"
				+ "Base: " + base + "\n"
				+ "Height: " + height + "\n"
				+ "Surface Area: " + getPyramidArea();
	}
}
