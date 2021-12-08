/*
 * Driver class to test Result
 */
import java.util.Scanner; // import scanner
public class ResultApp{ // driver class

    public static void main(String[] args) { // main method
        boolean done = false; // stop when this is true
        Scanner sc = new Scanner(System.in); // input scanner
        while(!done) { // input loop
            System.out.print("Enter a score (-1 to stop): "); // prompt
            int value = sc.nextInt(); // get int input
            if(value == -1) {
            	done = true;
            	break;
            }
            Result calculator = new Result(value); // create object
            System.out.println(calculator.calculate()); // calculate
        }
        
    }

}
