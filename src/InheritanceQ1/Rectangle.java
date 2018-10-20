package InheritanceQ1;
public class Rectangle extends Shape{

	private int length, breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
		setName("Rectangle");
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int getLength(){
		return length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	@Override
	public double calculateArea() {
		return length*breadth;
	}
	
}
