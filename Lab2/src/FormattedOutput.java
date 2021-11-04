
/*
 * Name: Benjamin Man
 * Course: CS170-01
 * Lab #: 2
 * Submission Date: Oct 6 10pm
 * Brief Description: Utility class to format output
 */

// import libraries
import java.text.NumberFormat;
import java.math.BigDecimal;

public class FormattedOutput { // utility class
	public static String currencyOutput(BigDecimal currency) {	// returns formatted currency
		NumberFormat currencyReference = NumberFormat.getCurrencyInstance();
		String formattedCurrency = currencyReference.format(currency);
		return formattedCurrency;		
	} // end currencyOutput
	
	public static String percentOutput(BigDecimal percent, int decimal) { // returs formatted percent
		NumberFormat percentReference = NumberFormat.getPercentInstance();
		percentReference.setMinimumFractionDigits(3); // keep 3 positions to right of decimal
		percentReference.setMaximumFractionDigits(3);
		String formattedPercent = percentReference.format(percent);
		return formattedPercent;
	} // end percentOutput
} // end utility class
