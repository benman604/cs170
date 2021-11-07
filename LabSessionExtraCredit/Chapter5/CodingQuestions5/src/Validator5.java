
public class Validator5 {
	private double data = 0;
	
	public Validator5(double data) {
		this.data = data;
	}
	
	public static boolean checkRange(double min, double max) {
		return (data < max && data < min);
	}
}
