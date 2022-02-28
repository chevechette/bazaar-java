package thomas.bazar;

public class Avion extends Vehicule {
	
	private boolean trainAterrissageActif;
	
	public Avion(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("L'avion décolle");
	}

	@Override
	public void stop() throws CantLandException {
		if(!this.trainAterrissageActif) {
			throw new CantLandException();
		}
		System.out.println("L'avion attérit");
	}

	public void entrerTrainAtterissage() {
		System.out.println("Le train d'atterissage rentre");
		this.trainAterrissageActif = false;
	}
	
	public void sortirTrainAtterissage() {
		System.out.println("Le train d'atterissage sort");
		this.trainAterrissageActif = true;		
	}

	
	
}
