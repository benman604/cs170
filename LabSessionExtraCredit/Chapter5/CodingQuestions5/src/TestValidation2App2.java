//Demo: test the Validator class as data verifications

import javax.swing.*;

public class TestValidation2App2 {

	public static void main(String[] args) {

			double price = 0.0;
			int quantity = 0;
			
			String choice = "y";
			JFrame frame = new JFrame("Test Validation");
			
			while (choice.equalsIgnoreCase("y")) {
				price = Validator.validateDoubleWithRangeAndJOptionPane(frame, "Please eneter a price: ", 0, 99.9);  //verify double with range
				quantity = Validator.validateIntWithRangeAndJOptionPane(frame, "Please eneter the quantity: ", 1, 100); //verify int with range
				
				JOptionPane.showMessageDialog(frame, "Price: " + price + "\nQuatity: " + quantity + "\nTotal:" + price * quantity);
				
				choice = Validator.validateYNWithJOptionPane(frame ,"Continue (y/n)?");     //verify y/n
			}   //end of while loop
			
			JOptionPane.showMessageDialog(frame, "Good bye!");
	}  //end of main()
}   //end of the class
