import java.util.Scanner;
public class FactorialApp {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter an integer 0-25: ");
	    int n = sc.nextInt();
	    int result = n;
	    for(int i=n-1; i>0; i--) {
	        result *= i;
	    }
	    System.out.println(n + "! = " + result);
	}
}
