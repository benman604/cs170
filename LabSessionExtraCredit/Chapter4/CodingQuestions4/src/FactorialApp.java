/*
 * Driver class to find factorial of an integer
 */
import java.util.Scanner;
public class FactorialApp {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter an integer 0-25: ");
	    int n = sc.nextInt();
	    int result = n;
	    for(int i=n-1; i>0; i--) { // loop through number from self down to 0
	        result *= i; // multiply result 
	    }
	    System.out.println(n + "! = " + result); // print result
	}
}
