package Shapes;

public class Shapes {
	
	private static int numberOfSides;
	private static float radius;
	
	
	public Shapes(int numberOfSides, float radius) {
		this.numberOfSides = numberOfSides;
		this.radius = radius;
		
		if (numberOfSides == 1){
			System.out.println("The Area of Circle is "+ CalculateArea(numberOfSides, radius));
		}
		
		else if (numberOfSides == 3) {
			System.out.println("The Area of Triangle is "+ CalculateArea(numberOfSides,radius));
		}
		
		else if (numberOfSides == 4) {
			System.out.println("The Area of Square is " + CalculateArea(numberOfSides, radius));
		}
		
		else {
			System.out.println("No Shapes Present");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Shapes first = new Shapes(3, 15);
	    Shapes second = new Shapes(4, 15);
	    Shapes third = new Shapes(5, 15);
	}

	public static int CalculateArea(int sides, float radius){
		int area = 0;
		
		if (sides == 1) {
			area = (int)(3.14*radius*radius);
		}
		
		else if (sides == 3) {
			area = (int)(0.433*radius*radius);
		}
		
		else if (sides == 4 ) {
			area = (int)(radius*radius);
		}
		
		return area;
		
	}



}
