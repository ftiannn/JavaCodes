package InheritanceQ3;

public class FourWheeler extends Vehicle {
	private String audioSystem;
	private int numberOfDoors;
	
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem, int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}
	
	public String getAudioSystem() {
		return audioSystem;
	}
	
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	public void setNumberofDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	@Override
	public void displayDetailInfo() {
		System.out.println("---Detail Information---");
		System.out.println("Audio System:" + getAudioSystem());
		System.out.println("Number of Doors:" + getNumberOfDoors());
	}
}
