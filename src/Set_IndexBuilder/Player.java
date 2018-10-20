package Set_IndexBuilder;

public class Player {
	private String name;
	private String skill;
	
	public Player(String name, String skill){
		this.name = name;
		this.skill = skill;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSkill() {
		return skill;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	@Override	
	public boolean equals(Object obj) {
			Player p = (Player) obj;
			return name.equals(p.name) && skill.equals(p.skill);
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}
