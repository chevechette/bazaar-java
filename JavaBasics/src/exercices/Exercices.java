package exercices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ajc.basics.Car;
import ajc.basics.House;
import ajc.basics.City;
import ajc.basics.Orc;
import ajc.basics.Computer;
import ajc.basics.Commande;
import ajc.basics.Edessert;
import ajc.basics.Edrink;
import ajc.basics.Emeal;

public class Exercices {
	public static void exercice1() {
		Car		backToFuture;
		Car		tardis;
		
		// Method 1 w/out constructor. Pathetic.
		// This will ONLY work as long as those properties are public.
		// And we're private people 'ere.
		
//		backToFuture.color = "grey";
//		backToFuture.model = "Dolorean";
//		backToFuture.year = 1985;
		
		// Method 2 w/ constructor
		backToFuture = new Car("grey", "Dolorean", 1985);
		tardis = new Car("blue", "Type 40 Battle TARDIS", 1968);
		
		backToFuture.displayInfos();
		tardis.displayInfos();
	}
	
	public static void exercice2() {
		Car		unknown;
		Car		french;
		Car		corvette;
		
		unknown = new Car();
		french = new Car("pink");
		corvette = new Car("nuclear", "covette", 3000);
		
		unknown.displayInfos();
		french.displayInfos();
		corvette.displayInfos();
	}
	
	public static void exercice3() {
		// Exercice added some getters/setters
		// As well as a new house class
		House	sherlock;
		House	babaYaga;
		Car		wreck;
		
		sherlock = new House(null, null, -32);
		sherlock.displayInfos();
		babaYaga = new House("On chicken legs", "Woods", 9000);
		babaYaga.displayInfos();
		wreck = new Car();
		wreck.displayInfos();
		wreck.setColor("Dirty yellow");
		wreck.setYear(2022);
		wreck.setModel(null);
		wreck.displayInfos();
		System.out.println(wreck.getYear());
		System.out.print(babaYaga);
	}
	
	public static void exercice4() {
		City	chicago;
		City	irkutsk;
		City	shenzhen;
		
		chicago = new City("Chicago", "U.S.A.", 2.746388, false);
		irkutsk = new City("Irkutsk", "Russia", 0.617473, true);
		shenzhen = new City("Shenzhen", "China", 7.494398, false);
		
		System.out.println(chicago.toString());
		System.out.println(irkutsk.toString());
		System.out.println(shenzhen.toString());
		
		System.out.println(shenzhen.makeCompare(chicago));
	}
	
	public static void exercice5() {
		Orc		grugct;
		Orc		grugctTheSecond;
		Orc		jeanJacques;
		
		grugct = new Orc("Grugct", 50, 5);
		grugctTheSecond = new Orc("Grugct", 50, 5);
		jeanJacques = new Orc("Jean-Jacques", 60, 10);

		System.out.println(grugct.equals(grugctTheSecond));
		System.out.println(grugct.equals(jeanJacques));
		
		while (grugct.isAlive() && jeanJacques.isAlive()) {
			System.out.println(grugct);
			System.out.println(jeanJacques);
			grugct.attack(jeanJacques);
			jeanJacques.attack(grugct);
		}
		System.out.println(grugct);
		System.out.println(jeanJacques);
	}
	
	public static void	exercice6() {
		// Sujet de l'exercice : variable statiques.
		// Il y a un static int défini tel que Computer.maxMemory
		// qui limite les possibilité de Computer.setMemory()
		
		Computer	hal;
		Computer	skynet;
		
		hal = new Computer("HAL", 10);
		skynet = new Computer("Skynet", 123431);
		
		System.out.println(hal);
		System.out.println(skynet);
		Computer.setMaxMemory(200000);
		hal.setMemory(12333);
		System.out.println(hal);		
	}
	
	public static void	exercice7( ) {
		Commande	food;
		System.out.println("==========OPTION DRINK==========");
		for (Edrink choiceDrink : Edrink.values()) {
			System.out.println(choiceDrink);
		}
		
		System.out.println("==========OPTION MEAL==========");
		for (Emeal choiceDrink : Emeal.values()) {
			System.out.println(choiceDrink);
		}

		System.out.println("==========OPTION DESSERT==========");
		for (Edessert choiceDrink : Edessert.values()) {
			System.out.println(choiceDrink);
		}
		food = new Commande("Rogers", Edrink.LIMONADE, Emeal.BORSCH, Edessert.TIRAMISU);
		System.out.println(food);
		System.out.println(food.getPrixTotal());
		
	}
	
	public static void	exercice8() {
		ArrayList<Orc>			orcs;
		HashMap<String, Orc>	hashedOrc;
		
		orcs = new ArrayList<>();
		orcs.add(new Orc("Jeremy", 40, 12));
		orcs.add(new Orc("Francis", 40, 12));
		orcs.add(new Orc("Bertrand", 40, 12));
		hashedOrc = new HashMap<>();
		for (Orc orc : orcs) {
			System.out.println(orc);
			hashedOrc.put(orc.getName(), orc);
		}
		hashedOrc.remove("Francis");
		System.out.println(hashedOrc);
	}
	
	public static void	exerciceStream() {
//		Liste de computers
//		Filter uniquement les HPs.
//		Convertique la puissance en MHz (3->3000)
//		Afficher ces valeurs
//		Utiliser les streams
		ArrayList<Computer>	compList;
		ArrayList<Computer>	updatedCompList;
		ArrayList<Integer>	freqList;
		Iterator<Computer>	it;
		Computer			pc;
		
		compList = new ArrayList<>();
		compList.add(new Computer("HP", 123, 1));
		compList.add(new Computer("Dell", 23, 4));
		compList.add(new Computer("HP", 13, 2));
		compList.add(new Computer("HP", 12, 54));
		compList.add(new Computer("Acer", 43, 243));
		it = compList.iterator();
		while (it.hasNext()) {
			pc = (Computer) it.next();
			System.out.println(pc);
		}
		updatedCompList = compList.stream()
					.filter(comp -> comp.getModel().equals("HP"))
					.map(comp -> {comp.setProcessorFreq(comp.getProcessorFreq() * 1000); return comp;})
					.collect(Collectors.toCollection(ArrayList::new));
		freqList = updatedCompList.stream()
					.mapToInt(comp -> comp.getProcessorFreq())
					.boxed()
					.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(updatedCompList);
		System.out.println(freqList);
	}
	
	public static void main(String[] args) {
//		exercice1();
//		exercice2();
//		exercice3();
//		exercice4();
//		exercice5();
//		exercice6();
//		exercice7();
//		exercice8();
		exerciceStream();
	}
}
