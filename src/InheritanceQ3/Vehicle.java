package InheritanceQ3;

public class Vehicle {
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public String getMake(){
		return make;
	}
	
	public void setMake(String make){
		this.make = make;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public void setVehicleNumber(String vehicleNumber){
		this.vehicleNumber = vehicleNumber;
	}
	
	public String getFuelType(){
		return fuelType;
	}
	
	public void setFuelType(String fuelType){
		this.fuelType = fuelType;
	}
	
	public int getFuelCapacity(){
		return fuelCapacity;
	}
	
	public void setFuelCapacity(int fuelCapacity){
		this.fuelCapacity = fuelCapacity;
	}
	
	public int getCC() {
		return cc;
	}
	
	public void setCC(int cc) {
		this.cc = cc;
	}
	
	public String displayMake() {
		return make;
		}
	
	public void displayDetailInfo() {
		return;
	}
	
	public void displayBasicInfo() {
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number:" + getVehicleNumber());
		System.out.println("Fuel Capacity:" + getFuelCapacity());
		System.out.println("Fuel Type:" + getFuelType());
		System.out.println("CC:" + getCC());
	}
	
}
