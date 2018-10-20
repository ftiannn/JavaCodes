package Classes_and_Objects_1B;

public class Team {
	public String name;
	public String coach;
	public String location;
	public String players;
	public String captain;
	
	public String getName() {
		
		return name;
	}
	
	public String getCoach() {
		return coach;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getPlayers() {
		return players;
	}
	
	public String getCaptain(){
		return captain;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCoach(String coach) {
		this.coach = coach;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	
	public void setPlayers(String players) {
		this.players = players;
	}
	
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	
	public void displayTeamDetails() {
		System.out.println("Team Details");
		System.out.println("Team : " + getName()
				+ "\n" + "Coach : " + getCoach()
				+ "\n" + "Location : " + getLocation()
				+ "\n" + "Players : " + getPlayers()
				+ "\n" + "Captain : " + getCaptain()
				);
	}
}
