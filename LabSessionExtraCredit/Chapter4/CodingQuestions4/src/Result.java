/*
 * operation class to calculate if grade is pass, repeat, or fail
 */
public class Result {
	private int score;
	
	public Result(int score) { // constructor
		this.score = score;
	}
	
	public String calculate() { // returns string for passing/failing/repeating according to score
		if(score >= 60) {
			if(score > 70) {
				return "Pass";
			}
			else {
				return "Repeat";
			}
		}
		else {
			return "Fail";
		}
	}
}
