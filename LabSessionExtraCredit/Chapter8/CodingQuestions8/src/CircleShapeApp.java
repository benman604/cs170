//Demo the driver class for circular shape computing  in polymorphism display

public class CircleShapeApp{

	public static void main(String[] args) {
 		Circle circle = new Circle(12.98);
 		Sphere sphere = new Sphere(25.55);
 		Cone cone = new Cone(10.48, 12.5); // create cone object with diameter and height

 		Shape shape = circle;

 		shape.computeArea();
 		System.out.println("circle area: " + shape.getArea());
 		shape.computeVolume();
 		System.out.println("circle volume: " + shape.getVolume());

		shape = sphere;
 		shape.computeArea();
 		System.out.println("Sphere area: " + shape.getArea());
 		shape.computeVolume();
 		System.out.println("Sphere volume: " + shape.getVolume());
 		
 		// Set current shape to cone object
 		shape = cone;
 		shape.computeArea();
 		System.out.println("Cone area: " + shape.getArea());
 		shape.computeVolume();
 		System.out.println("Cone volume: " + shape.getVolume());
 	}

}