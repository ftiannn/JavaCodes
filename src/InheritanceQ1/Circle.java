package InheritanceQ1;
public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
		setName("Circle");
	}
	
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
		
	@Override
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	
}
