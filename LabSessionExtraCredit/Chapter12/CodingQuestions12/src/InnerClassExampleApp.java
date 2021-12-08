/*
 * Driver class to test InnerClassExample
 */
public class InnerClassExampleApp {

	public static void main(String[] args) {
		InnerClassExample outer = new InnerClassExample(); // create outer
		InnerClassExample.Inner inner = outer.new Inner(); // create inner
		System.out.println(inner.innerMethod());
	}

}
