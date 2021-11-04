
public class Result {
	private int score;
	
	public Result(int score) {
		this.score = score;
	}
	
	public String calculate() {
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
