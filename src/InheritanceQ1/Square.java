package InheritanceQ1;


public class Square extends Shape {
	private int side;

	public Square(int side) {
		super();
		this.side = side;
		setName("Square");
	}
	
	public String getShapeName() {
		return shapeName;
	}
	
	public void setSide(int side) {
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}
	
	@Override
	public double calculateArea() {
		return side*side;
	}
	
}
