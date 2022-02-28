package thomas.iface;

public class Boat extends Vehicule implements Flottant{
	
	public Boat(String model) {
		super(model);
	}

	@Override
	public void naviguer() {
		System.out.println("Le bateau combat les flots");
	}

	@Override
	public void jeterAncre() {
		System.out.println("Le bateau jette l'ance");		
	}

	@Override
	public void leverAncre() {
		System.out.println("Le bateau leve l'ance");		
	}
}
