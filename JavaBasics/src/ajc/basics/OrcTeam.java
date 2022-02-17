package ajc.basics;

import java.util.HashMap;

public class OrcTeam {
	private String					name;
	private	Orc						chief;
	private	HashMap<String, Orc>	team;
	
	public OrcTeam(String name, Orc chief) {
		this.setChief(chief);
		this.team = new HashMap<String, Orc>();
		this.addToTeam(chief);
		this.setName(name);
	}
	
	static public String	randomOrcName() {
		int				nameLength;
		StringBuffer	sb;
		char			randChar;
		
		// V1 Need to use Random for V2
		sb = new StringBuffer();
		nameLength = (int) ((Math.random() * 10) + 3);		
		for (int i = 0; i < nameLength; i++) {
			randChar = (char) ((Math.random() * ('z' - 'a')) + 'a');
			System.out.print(randChar);
			sb.append(randChar);
		}
		System.out.println(sb.toString());
		return sb.toString();
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
		
		sb = new StringBuffer(this.name);
		sb.append(":\n\tChef : ").append(this.chief.getName()).append("\n\t").append("membres :");
		for (Orc orc : this.team.values()) {
			sb.append("\n\t\t- ").append(orc.getName());
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
