/*
 * Operation class accepting a Printable to print it
 */
public class Output {
	public static void printInfo(Printable printable, int quantity) { // prints printable quantity times
		for(int i=0; i<quantity; i++) { // loop quantity times
			printable.print(); // print printable
		}
	}
}
