
public class CirclePoint extends Point{

	private double radius;
	
	public CirclePoint(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public void print() {
		super.print();
		System.out.println("Radius: " + radius);
	}
	
	public double getFlaecheninhalt() {
		return (Math.PI * Math.pow(2, radius));
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
