package thomas.bazar;

import thomas.parkingmanager.Repas;

public class RepasVegetarien implements Repas {
	String name;
	
	
	
	public RepasVegetarien(String name) {
		super();
		this.name = name;
	}


	@Override
	public void manger() {
		System.out.println("repas constitué d'une patate et d'une bonne ratatouille");
	}
}
