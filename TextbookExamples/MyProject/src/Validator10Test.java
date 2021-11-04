//Demo: test Validator10

import java.util.*;

public class Validator10Test {
	public static void main(String[] args) {
		String prompt = "Please enter an integer 0 - 99";
		Scanner sc = new Scanner(System.in);
		
		int myData = Validator10.intData(sc, prompt);
		
		System.out.println("Verified: inData = " + myData);
		
		int intData = Validator10.intDataWithRange(sc, prompt, 0, 99);
		
		System.out.println("Verified: inData = " + intData);
		
		double doubleData = Validator10.doubleDataWithRange(sc, "Please enter a dobule (-13.3 - 100.89) ", -13.3, 100.89);
		
		System.out.println("Verified: doubleData = " + doubleData);
				
		String choice = Validator10.continueYN(sc, "contiune (y/n)? ");
		System.out.println("Verified choice: " + choice);
	}

}