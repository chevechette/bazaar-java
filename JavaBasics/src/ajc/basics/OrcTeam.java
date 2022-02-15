package ajc.basics;

import java.util.HashMap;

public class OrcTeam {
	private	HashMap<String, Orc>	team;
	private	Orc						chief;
	
	public OrcTeam(Orc chief) {
		this.setChief(chief);
		this.team = new HashMap<String, Orc>();
		this.addToTeam(chief);
	}
	
	static public String	randomOrcName() {
		int				nameLength;
//		StringBuffer	sb;
		char			randChar;
		
		// V1 Need to use Random for V2
		nameLength = (int) ((Math.random() * 10) + 3);		
		for (int i = 0; i < nameLength; i++) {
			randChar = (char) ((Math.random() * ('z' - 'a')) + 'a');
			System.out.print(randChar);
		}
		return "Uruk";
	}
	
	static public Orc		recruitOrc() {
		int	health;
		int	strength;
		
		health = (int) ((Math.random() * 50.0) + 50);
		strength = (int) ((Math.random() * 20.0) + 1);
		return new Orc(randomOrcName(), health, strength);
	}

	@Override
	public String toString() {
		StringBuffer	sb;
		
		sb = new StringBuffer("Chef : ");
		sb.append(this.chief.getName()).append("\n").append("membres :");
		for (Orc orc : this.team.values()) {
			sb.append("\n\t- ").append(orc.getName());
		}
		return sb.toString();
	}

	public HashMap<String, Orc> getTeam() {
		return team;
	}
	
	public void addToTeam(Orc newMember) {
		if (newMember == null || this.team.containsKey(newMember.getName())) {
			System.out.println("Orc was not recruited.");
			return;
		}
		this.team.put(newMember.getName(), newMember);
		System.out.println("Orc was successfully added.");
	}

	public void setTeam(HashMap<String, Orc> team) {
		this.team = team;
	}

	public Orc getChief() {
		return chief;
	}

	public void setChief(Orc chief) {
		this.chief = chief;
	}
}
