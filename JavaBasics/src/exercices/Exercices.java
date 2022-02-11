package exercices;

import ajc.basics.Car;
import ajc.basics.House;
import ajc.basics.City;

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
	
	public static void main(String[] args) {
//		exercice1();
//		exercice2();
//		exercice3();
		exercice4();
	}
}
