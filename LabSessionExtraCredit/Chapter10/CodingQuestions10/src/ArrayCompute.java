public class ArrayCompute {
	public static double doubleAverage(double array[]) {
		double sum = total(array);
		return sum / array.length;
	}
	
	public static double total(double array[]) {
		double sum = 0;
		for(double i : array) {
			sum += i;
		}
		return sum;
	}
	
	public static int max(double array[]) {
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
	
	public static int min(double array[]) {
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
