
public class Output {
	public static void printInfo(Printable printable, int quantity) {
		for(int i=0; i<quantity; i++) {
			printable.print();
		}
	}
}
