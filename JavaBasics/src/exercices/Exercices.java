package exercices;

import ajc.basics.Car;

public class Exercices {
	public static void exercice1() {
		Car		backToFuture;
		Car		tardis;
		
		backToFuture = new Car();
		backToFuture.displayInfos();
		
		// Method 1 w/out constructor. Pathetic.
		backToFuture.color = "grey";
		backToFuture.model = "Dolorean";
		backToFuture.year = 1985;
		// Method 2 w/ constructor
		tardis = new Car("blue", "Type 40 Battle TARDIS", 1968);
		
		backToFuture.displayInfos();
		tardis.displayInfos();
	}
	
	public static void main(String[] args) {
		exercice1();	
	}
}
