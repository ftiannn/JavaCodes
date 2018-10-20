package Classes_and_Objects_1B;

public class Wicket {
	public long over;
	public long ball;
	public String wicketType;
	public String playerName;
	public String bowlerName;
	
	
	public long getOver() {
		return over;
	}
	
	public long getBall() {
		return ball;
	}
	
	public String getWicketType() {
		return wicketType;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public String getBowlerName() {
		return bowlerName;
	}
	
	public void setOver(long over) {
		this.over = over;
	}
	
	public void setBall(long ball) {
		this.ball = ball;
	}
	
	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	
    public void displayDetails(){
        System.out.println("Wicket Details");
        System.out.println("Over : " + getOver());
        System.out.println("Ball : " + getBall());
        System.out.println("Wicket Type : " + getWicketType());
        System.out.println("Player Name : " + getPlayerName());
        System.out.println("Bowler Name : " + getBowlerName());
}

	
}
