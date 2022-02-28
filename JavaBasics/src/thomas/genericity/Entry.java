package thomas.genericity;


public class Entry {

	public static void main(String[] args) {
		
		Orc<Axe> oAHache = new Orc<>("machin");
		Orc<Sword> oAEppee = new Orc<>("machin");

		oAHache.equip(new Axe("Hache"));
		oAEppee.equip(new Sword("Epée"));
		
		System.out.println(oAHache.getWeapon().getName());
		
		System.out.println(oAHache);
		System.out.println(oAEppee);
		
		Computer c = Computer.build()
				.addCpu(100f)
				.addMemory(200)
				.addName("HP");
		
		System.out.println(c);
		
	}
}
