package thomas.iface;

public class Amphibious extends Vehicule implements Flottant, Roulant{
	
	public Amphibious(String model) {
		super(model);
	}

	@Override
	public void rouler() {
		System.out.println("L'amphibie s'avance sur le sable");
	}

	@Override
	public void naviguer() {
		System.out.println("L'amphibie combat les flots");
	}

	@Override
	public void jeterAncre() {
		System.out.println("L'amphibie jette l'ance");		
	}

	@Override
	public void leverAncre() {
		System.out.println("L'amphibie leve l'ance");		
	}
}
