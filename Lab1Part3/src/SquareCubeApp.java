public class SquareCubeApp{
	public static void main(String[] args){
		System.out.printf("%-10s %-10s %-10s\n", "Number", "Square", "Cube");
		for(int i=1; i<=10; i++){
			SquareCube object = new SquareCube(i);
			object.DisplayResult();
		}
	}
}
