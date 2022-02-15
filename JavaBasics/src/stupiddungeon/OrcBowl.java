package stupiddungeon;

import java.util.HashMap;

import ajc.basics.Orc;
import ajc.basics.OrcTeam;

public class OrcBowl {
	public static void main(String[] args) {
		OrcTeam 				reds;
		OrcTeam 				blues;
		Orc						redChief;
		Orc						blueChief;
		HashMap<Orc, OrcTeam>	teams;
		
		redChief = new Orc("Sarge", 60, 12);
		blueChief = new Orc("Church", 60, 12);
		reds = new OrcTeam(redChief);
		reds.addToTeam(new Orc("Griff", 10, 40));
		reds.addToTeam(new Orc("Simmons", 10, 40));
		reds.addToTeam(new Orc("Donut", 10, 40));
		blues = new OrcTeam(blueChief);
		blues.addToTeam(new Orc("Tucker", 10, 40));
		blues.addToTeam(new Orc("Caboose", 10, 40));
		blues.addToTeam(new Orc("Tex", 10, 40));
		teams = new HashMap<>();
		teams.put(blueChief, blues);
		teams.put(redChief, reds);
		for (OrcTeam team : teams.values()) {
			System.out.println(team);
		}
		System.out.println("Get reaaaaady to rumble.");
	}
}
