package Classes_and_Objects_1B;

public class Player {
	String name;
	String country;
	String skill;
	
	public String getName() {
		return name;
	}
	
	public String getCountry(){
		return country;
	}
	
	public String getSkill(){
		return skill;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	public void setSkill(String skill){
		this.skill = skill;
	}
	
	public void displayDetails() {
		System.out.println("Player Details");
		System.out.println("Player Name :" + getName()
				+ "\n" + "Country Name :" + getCountry()
				+ "\n" + "Skill :" + getSkill()
				);
	}
	
	public void menu(){
		System.out.println("Menu");
		System.out.println("1. Update Player Name" +
				"\n" + "2. Update Country Name" +
				"\n" + "3. Update Skill" +
				"\n" + "4. All informations Correct/Exit" +
				"\n" + "Type 1 or 2 or 3 or 4");
	}
	
	public void updatePlayer() {
		System.out.println("The current player name is " + getName());
		System.out.println("Enter the player name");
	}
	
	public void updateCountry() {
		System.out.println("The current country  is " + getCountry());
		System.out.println("Enter the country");
	}
	
	public void updateSkill() {
		System.out.println("The current skill is " + getSkill());
		System.out.println("Enter the skill");
	}
}
	
			
