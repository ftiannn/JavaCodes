package InheritanceQ1;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("1. Rectangle"
				+ "\n" + "2. Square"
				+ "\n" + "3. Circle"
				+ "\n" + "Area Calculator --- Choose your shape"
				);
		
		DecimalFormat df=new DecimalFormat("0.00");
		
		int i=in.nextInt();
		
		switch(i)
		{
			case 1:
				System.out.println("Enter length and breadth:");
				int l = in.nextInt();
				int b = in.nextInt();
				Shape s = new Rectangle(l,b);
				System.out.printf("Area of " + s.getShapeName() + " is:" + df.format(s.calculateArea()));
				break;
				
			case 2:
				System.out.println("Enter side:");
				int side = in.nextInt();
				Shape sq = new Square(side);
				System.out.printf("Area of " + sq.getShapeName() + " is:" + df.format(sq.calculateArea()));
				break;
			case 3:
				System.out.println("Enter Radius:");
				int rad = in.nextInt();
				Shape c = new Circle(rad);
				System.out.printf("Area of " + c.getShapeName() + " is:" + df.format(c.calculateArea()));
				break;
			default :
			System.exit(0);
		}
	}
}
