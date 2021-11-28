
public class InnerClassExampleApp {

	public static void main(String[] args) {
		InnerClassExample outer = new InnerClassExample();
		InnerClassExample.Inner inner = outer.new Inner();
		System.out.println(inner.innerMethod());
	}

}
