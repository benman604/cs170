
public class ConvertToDays {
	public static void convert(double hr, double min, double sec) {
		double secInDays = toDays(toHr(toMin(sec)));
		double minInDays = toDays(toHr(min));
		double hrInDays = toDays(hr);
		double days = secInDays + minInDays + hrInDays;
		
		int weeks = (int) Math.floor(days / 7);
		double remainingDays = days / 7 - weeks;
		if(weeks == 0) {
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