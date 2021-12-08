/*
 * Operation class to convert between hours/minutes/seconds to days
 */
public class ConvertToDays {
	public static void convert(double hr, double min, double sec) { // gets days based on hrs/min/sec
		double secInDays = toDays(toHr(toMin(sec))); // convert each to days
		double minInDays = toDays(toHr(min));
		double hrInDays = toDays(hr);
		double days = secInDays + minInDays + hrInDays; // add them up
		
		int weeks = (int) Math.floor(days / 7); // weeks if more than 7 days
		double remainingDays = days / 7 - weeks; // remainder of dividing
		if(weeks == 0) { // display in days/weeks+days
			System.out.println(days + " days");
		}
		else {
			System.out.println(weeks + " weeks " + remainingDays + " days");
		}
	}
	
	private static double toMin(double sec) {
		return sec / 60;
	}
	
	private static double toHr(double min) {
		return min / 60;
	}
	
	private static double toDays(double hr) {
		return hr / 24;
	}
}