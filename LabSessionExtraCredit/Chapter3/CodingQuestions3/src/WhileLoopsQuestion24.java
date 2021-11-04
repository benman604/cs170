
public class WhileLoopsQuestion24 {
	public static void main(String[] args) {
		int number = 2; 
		int count = 0;
		boolean done = false; 
		while (done != true) {
			number += 2;
			count++;
			System.out.println(number);
			if (number == 64)
				done = true;
		}
		System.out.println("Loop executed " + count + " times");
	}
}
