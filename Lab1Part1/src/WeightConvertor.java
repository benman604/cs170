
public class WeightConvertor {
	private double weight;
	
	public WeightConvertor(float weight) {
		this.weight = weight;
	}
	
	public void Compute() {
		double kg = weight * 0.453;
		double lbs = weight * 2.205;
		System.out.println(weight + " killograms = " + lbs + " pounds");
		System.out.println(weight + " pounds = " + kg + " kilograms");
	}
}
