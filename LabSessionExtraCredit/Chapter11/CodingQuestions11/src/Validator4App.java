import java.util.Scanner;

public class Validator4App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Validator4.validatePositiveDouble(sc, "Enter a positive double: ", -1.3));
		System.out.println(Validator4.validatePositiveInt(sc, "Enter a positive integer: ", -3));
	}

}
