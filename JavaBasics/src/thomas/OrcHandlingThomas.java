package thomas;

import java.util.ArrayList;
import java.util.Scanner;

import ajc.basics.Orc;

public class OrcHandlingThomas {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Orc> orcs = new ArrayList<>();
		
		System.out.println("Hello");
		do {
			showMenu();
			String res = sc.next().toLowerCase();
			switch(res) {
				case "1" : 
					orcs.add(addOrc());
					System.out.println("Ajout ok");
					break;
				case "2" : 
					removeOrc(orcs);
					break;
				case "3" : 
					displayOrcs(orcs);
					break;
				case "4" : 
					displayTotalForce(orcs);
				    return;
				case "9" : 
					System.out.println("Au revoir");
				    return;
			}
			
		}while(true);
		
		
		
	}
	
	public static void displayOrcs(ArrayList<Orc> Orc) {
		for (int i = 0; i < Orc.size(); i++) {
			Orc current = Orc.get(i);
			System.out.println((i + 1) + ": " + current.getName());
		}
	}
	
	public static void displayTotalForce(ArrayList<Orc> orcs){
		int cumul = 0;
		for (Orc orc : orcs) {
			cumul += orc.getForce();
		}
		
		System.out.println(orcs.stream().mapToInt(o -> o.getForce()).sum());
		
		System.out.println("Force Totale: "+cumul);
	}
	
	public static Orc addOrc() {
		System.out.println("Nom?");
		String name = sc.next();
		System.out.println("Force?");
		int force = Integer.parseInt(sc.next());
		System.out.println("Health?");
		int health = Integer.parseInt(sc.next());
		
		return new Orc(name, health, force);
	
	}
	
	public static void removeOrc(ArrayList<Orc> orcs) {
		System.out.println("Lequelle souhaitez vous supprimer?");
		displayOrcs(orcs);
		int number = Integer.parseInt(sc.next());
		if(number > 0 && number <= orcs.size()) {
			orcs.remove(number-1);
			System.out.println("Suppression ok");
		}else {
			System.out.println("Suppression impossible");
		}
	}
	
	public static void showMenu() {
		System.out.println("\nQue voullez vous faire?");
		System.out.println("1 / Ajouter un Orc");
		System.out.println("2 / Supprimer un Orc");
		System.out.println("3 / Lister les Orcs");
		System.out.println("4 / Afficher la force totale");
		System.out.println("9 / Quitter \n");
	}
	
	
}