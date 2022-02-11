package exercices;

import ajc.basics.Car;
import ajc.basics.House;

public class Exercices {
	public static void exercice3() {
		Car		horse;
		House	evil;
		
		horse = new Car();
		horse.displayInfos();
		evil = new House(null, null, 23);
		evil.displayInfos();
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
	
	public static void main(String[] args) {
		exercice1();
		exercice2();
		exercice3();
	}
}
