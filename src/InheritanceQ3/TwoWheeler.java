package InheritanceQ3;

public class TwoWheeler extends Vehicle{
	private boolean kickStartAvailable;
	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
		this.kickStartAvailable = kickStartAvailable;
	}
	
	public boolean getKickStartAvailable() {
		return kickStartAvailable;
	}
	
	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	
	@Override
	public void displayDetailInfo() {
		System.out.println("---Detail Information---");

		if (kickStartAvailable == true) {
			System.out.println("Kick Start Available:YES");
		}
		else {
			System.out.println("Kick Start Available:NO");
		}
	}
}
