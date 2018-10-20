package Classes_and_Objects_1B;

public class ExtraType {
	String name;
	long runs;
	
	public String getName() {
		return name;
	}
	
	public long getRuns() {
		return runs;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public void displayDetails() {
		System.out.println("ExtraType Details");
		System.out.println("ExtraType:" + getName()
				+ "\n" + "Runs:" + getRuns()
				);
	}
}
