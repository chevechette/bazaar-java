package dragons;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		Stable			troyRanch;
		Owner			oddyseus;
		Dragon			toothless;
		Dragon			dog;
		
		troyRanch = new Stable();
		oddyseus = new Owner("Oddyseus", "From Ithaque", LocalDate.of(1000, 10, 01), "Ithaque");
		toothless = new Dragon("Toothless", LocalDate.of(2022, 10, 12), troyRanch, oddyseus, ColorEnum.BLACK);
		dog = new Dragon("Dog", LocalDate.of(2022, 12, 12), troyRanch, oddyseus, ColorEnum.BROWN);
		
		System.out.println(troyRanch);
		System.out.println(oddyseus);
		System.out.println(toothless);
		System.out.println(dog);
		
		toothless.setStable(null);
		dog.setOwner(null);
		System.out.println(troyRanch);
		System.out.println(dog);
		System.out.println(toothless);
		System.out.println(troyRanch);
		System.out.println(oddyseus);
	}

}
