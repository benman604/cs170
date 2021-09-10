import java.util.Scanner;
public class SquareCubeApp{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter lower bound: ");
		int lowerBound = keyboard.nextInt();

		System.out.print("Enter upper bound: ");
		int upperBound = keyboard.nextInt();

		System.out.printf("%-10s %-10s %-10s\n", "Number", "Square", "Cube");
		for(int i=lowerBound; i<=upperBound; i++){
			SquareCube object = new SquareCube(i);
			object.DisplayResult();
		}
	}
}
