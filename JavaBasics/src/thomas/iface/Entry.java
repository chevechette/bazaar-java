package thomas.iface;

import java.util.ArrayList;
import java.util.List;

public class Entry {

	public static void main(String[] args) {
		List<Vehicule> park = new ArrayList<>();
		
		park.add(new Boat("SuperBateau"));
		park.add(new Amphibious("SuperAmphi"));
		park.add(new Car("Peugeot"));
		
		for (Vehicule vehicule : park) {
			if(vehicule instanceof Roulant) {
				((Roulant) vehicule).rouler();
			}
			if(vehicule instanceof Flottant) {
				((Flottant) vehicule).naviguer();
			}
		}
		Port p = new Port();
		p.flotte.add(new Amphibious("SuperAmphi"));
		
	}

}
