/**
 * Operation class to determine total, min and max in array of doubles
 * @author Benjamin Man
 *
 */
public class ArrayCompute {
	public static double doubleAverage(double array[]) { // returns average
		double sum = total(array);
		return sum / array.length;
	}
	
	public static double total(double array[]) { // returns total sum
		double sum = 0;
		for(double i : array) {
			sum += i;
		}
		return sum;
	}
	
	public static int max(double array[]) { // returns greatest in array
		double max = array[0];
		int maxIndex = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static int min(double array[]) { // returns least in array
		double min = array[0];
		int minIndex = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
