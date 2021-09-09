import java.util.Scanner;

public class WeightConvertorApp {

	public static void main(String[] args) {
		double input = 0;
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter weight: ");
			input = keyboard.nextDouble();
			
			if(input == 0) {
				System.out.println("nani?!");
				break;
			}
			
			WeightConvertor convertor = new WeightConvertor(input);
			convertor.Compute();
		} 
		
		keyboard.close();
	}

}
