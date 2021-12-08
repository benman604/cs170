/*
 * Driver class to test Triangle
 */
public class TriangleApp {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(); // create triangle
		triangle.setBase(10);
		triangle.setHeight(10);
		System.out.println(triangle.toString()); // display triangle data
	}

}
