package InheritanceQ3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		System.out.println("Enter the Vehicle Type:");		
		int type = sc.nextInt();
		sc.nextLine();
		System.out.println("Vehicle Make:");
		String make = sc.nextLine();
		System.out.println("Vehicle Number:");
		String vno = sc.nextLine();
		System.out.println("Fuel Type:");
		System.out.println("1.Petrol");
		System.out.println("2.Diesel");
		int ftype = sc.nextInt();
		sc.nextLine();

		String fuel;
		if (ftype == 1) {
			fuel = "Petrol";
		}
		else {
			fuel = "Diesel";
		}
		
		System.out.println("Fuel Capacity:");
		int cap = sc.nextInt();
		sc.nextLine();

		System.out.println("Engine CC:");
		int cc = sc.nextInt();
		sc.nextLine();

		switch(type) {
				case 1: 
					System.out.println("Audio System:");
					String audio = sc.nextLine();
					System.out.println("Number Of Doors:");
					int door = sc.nextInt();

					Vehicle v = new FourWheeler(make, vno, fuel, cap, cc, audio, door);
					System.out.println("***" + make + "***");
					v.displayBasicInfo();
					v.displayDetailInfo();
					break;
				case 2:
					System.out.println("Kick Start Available(yes/no):");
					String kick = sc.nextLine();
					boolean kicks;
					if (kick == "yes") {
						kicks = true;
					}
					else {
						kicks = false;
					}
					Vehicle v1 = new TwoWheeler(make, vno, fuel, cap, cc, kicks);
					System.out.println("***" + make + "***");

					v1.displayBasicInfo();
					v1.displayDetailInfo();
			}
		}
		
		
	}

