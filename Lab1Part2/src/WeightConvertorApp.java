import java.util.Scanner;

public class WeightConvertorApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter weight: ");
			String input = keyboard.next();
			
			try {
				double weight = Double.parseDouble(input); 
				WeightConvertor convertor = new WeightConvertor(weight);
				convertor.Compute();
			} 
			catch(Exception e){
				break;
			}
		} 
		
		keyboard.close();
	}

}
