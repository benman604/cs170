
public class Cone extends Circle{ // Inherit circle
	double height; // height variable
	
	public Cone(double diameter, double height) { // constructor
		super(diameter/2); // push radius to circle constructor
		this.height = height; // set height
	}
	
	@Override
	public void computeArea() { // override area
		area = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
	}
	
	@Override
	public void computeVolume() { // override volume
		volume = Math.PI * Math.pow(radius, 2) * (height / 3);
	}
}
