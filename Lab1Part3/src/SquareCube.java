public class SquareCube{
	public int value = 0;
	public SquareCube(int value){
		this.value = value;
	}

	public int ComputeSquare(){
		return (int)Math.pow(value, 2);
	}

	public int ComputeCube(){
		return (int)Math.pow(value, 3);
	}

	public void DisplayResult(){
		System.out.printf("%-10s %-10s %-10s\n", value, ComputeSquare(), ComputeCube());
	}
}
