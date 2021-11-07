import javax.swing.*;

public class Validator {
	
	public static double validateDoubleWithRangeAndJOptionPane(JFrame frame, String prompt, double min, double max) { // validates BigDecimal via JOptionPane
		boolean isValid = false;
		double data = 0;

		while(!isValid) { 
			try {
				   String input = JOptionPane.showInputDialog(frame, prompt);

				   if (input.isBlank())     //Not a double					   												
						throw new NumberFormatException("\nData input error.  Please enter a BegDecimal type data...");	 
						data = Double.parseDouble(input);	//Receive double

						if (data < min || data > max)		//not in the right range
					       throw new Exception("Data is out of range " + min + " - " + max); //throw the error message
						isValid = true;				
			 }								//End of try

			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(frame, e);
			 }						//End of catch
			catch (Exception e) {
				JOptionPane.showMessageDialog(frame, e);
			 }
			} //End of while
			return data;
	} // end validateBigDecimalWithRangeAndJOptionPane
	
	public static int validateIntWithRangeAndJOptionPane(JFrame frame, String prompt, int min, int max) { // validates interger with JOptionPane
		boolean isValid = false;
		int data = 0;

		 while(!isValid) {
		  try {
	 		String strinput = JOptionPane.showInputDialog(frame, prompt);
	 		data = Integer.parseInt(strinput);

			if (data < min || data > max) 				//less than min
					throw new Exception("Data is out of range " + min + " - " + max);		//Throw the exception
			isValid = true;   //otherwise data is correct
		  }		//End of try
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(frame, e);
		 }						//End of catch
		catch (Exception e) {
			JOptionPane.showMessageDialog(frame, e);
		 }
		} 						//End of while
		return data;
	 }	//End of validateIntWithRangeAndJOptionPane()
	
	public static String validateYNWithJOptionPane(JFrame frame, String prompt) { // validates yes/no with JOptionPane
		boolean isValid = false; 
		int choice;
		String result = "y";
		while (!isValid) {
			try {
				choice = JOptionPane.showConfirmDialog(frame, prompt);
				System.out.println(choice);
				switch(choice) {
				case 0:
					result = "y";
					break;
				case 1:
					result = "n";
					break;
				}
				isValid = true;
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(frame, e);
				continue;
			}
		}   //end of while loop
		return result;
	}  //end of validateYNWithJOptionPane()
	
}	   //End of Validator