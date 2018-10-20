package tax;

public class TaxCalculator {
	
	private static float basicSalary;
	private static boolean citizenship;

	public TaxCalculator(float basicSalary, boolean citizenship) {
		this.basicSalary = basicSalary;
		this.citizenship = citizenship;
		System.out.println("The Tax of the employee  for  the $" + basicSalary + " is $" + CalculateTax(basicSalary));
		System.out.println("The nett salary of the employee is $" + deductTax(basicSalary, CalculateTax(basicSalary)));
		validateSalary(deductTax(basicSalary, CalculateTax(basicSalary)), citizenship);
	}
	
	
	public static float CalculateTax(float basicSalary){
		float tax = ((30*basicSalary)/100);
		return tax;
	}
	
	public static int deductTax(float salary, float tax) {
		int netsalary = (int)Math.round(salary-tax);
		return netsalary;
	}
	
	public static void validateSalary(int netsalary, boolean citizenship){
		if (netsalary > 100000 && citizenship == true) {
			System.out.println("The salary and citizenship eligibility: Yes");
		}
		else {
			System.out.println("The salary and citizenship eligibility: No");
		}
	}
}
