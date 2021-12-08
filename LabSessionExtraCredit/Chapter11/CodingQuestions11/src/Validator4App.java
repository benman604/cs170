/**
 * Driver class to test Validator4
 */

import java.util.Scanner;

public class Validator4App {

	public static void main(String[] args) { // main method
		Scanner sc = new Scanner(System.in);
		System.out.println(Validator4.validatePositiveDouble(sc, "Enter a positive double: ", -1.3)); // validate inputs
		System.out.println(Validator4.validatePositiveInt(sc, "Enter a positive integer: ", -3));
	}

}
