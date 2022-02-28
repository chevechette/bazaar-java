package thomas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import ajc.basics.Orc;

public class HashMapOrc {
	public static void main(String[] args) {
		
		HashMap<Orc, ArrayList<Orc>> teams = new HashMap<>();

		Orc chef1 = new Orc("A", 20, 20);
		Orc chef2 = new Orc("B", 20, 20);
		
		ArrayList<Orc> team1 = new ArrayList<Orc>();
		team1.add(new Orc("a1", 5, 5));
		team1.add(new Orc("a2", 5, 5));
		team1.add(new Orc("a3", 5, 5));
		
		ArrayList<Orc> team2 = new ArrayList<Orc>(Arrays.asList(new Orc("b1", 5, 5),new Orc("b2", 5, 5),new Orc("b3", 5, 5)));
		
		teams.put(chef1, team1);
		teams.put(chef2, team2);
				
		for (Orc chef : teams.keySet()) {
			System.out.println("\nChef de l'équipe: " + chef.getName());
			System.out.println("Equipe");
			for (Orc orc : teams.get(chef)) {
				System.out.println("\t" + orc.getName()); 
			}
		}
		
		
	}
}
