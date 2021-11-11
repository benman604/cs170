
public class Triangle {
	double base;
	double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getTriangleArea() {
		return 0.5 * base * height;
	}
	
	@Override
	public String toString() {
		return "Triangle:\n"
				+ "Base: " + base + "\n"
				+ "Height: " + height + "\n"
				+ "Area: " + getTriangleArea();
	}
}
