package Basic;
import Shapes.Shapes;


public class SimpleInterestCalculator {

	/**
	 * @param args
	 */
	
	public static double principalamt;
	public static int numberofyears;
	
	public SimpleInterestCalculator(double principalamt, int numberofyears) {
		this.principalamt = principalamt;
		this.numberofyears = numberofyears;
		
		System.out.println("The Interest amount for a principal " + principalamt + " and years " + numberofyears + "is: " + calculateSimpleInterest(numberofyears, principalamt));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterestCalculator first = new SimpleInterestCalculator(200000,12);
		SimpleInterestCalculator second = new SimpleInterestCalculator(50000,12);
		SimpleInterestCalculator third = new SimpleInterestCalculator(50000,5);
	}
	
	public static double calculateSimpleInterest(int years, double amt){
		double interest = 0;
		if (amt > 100000) {
			if (years > 10) {
				interest = amt * years * 10/100;
			}
			else {
				interest = amt * years *9.5/100;
			}
		}
		
		else {
			if (years > 10) {
				interest = amt * years * 5 / 100;
			}
			else {
				interest = amt * years * 4.5/100;
			}
		}
		
		return interest;
	}

}
