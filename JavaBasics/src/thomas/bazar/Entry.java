package thomas.bazar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ajc.basics.Orc;


public class Entry {

	public static void main(String[] args) {	
		
		
		List<Orc> orcs = new ArrayList<Orc>();
		
		MyListOrc orcs2 = new MyListOrc();
		MyDoubleCollectionGeneric<Integer, String, Orc>  orcs3 = new MyDoubleCollectionGeneric<>();
		
		orcs3.list.add(20);
		orcs3.map.put("2132", new Orc(20,20));
		
		Cheval<RepasVegetarien> cv =  new Cheval<>(20);
		Cheval<RepasOmnivore> co =  new Cheval<>(10);
		
		cv.manger(new RepasVegetarien("Aubergines"));

		
		/**
		 * Sword, Axe a faire
		 * 
		 * Orc.equip(T weapon) 
		 * // peut avoir en parametre sois une hache soit une épée
		 * 
		 * 
		 * --------------
		 * |    ORC		|
		 * --------------
		 * |  weapon: T |
		 * |			|		
		 * |------------|
		 */
		
	}

}
