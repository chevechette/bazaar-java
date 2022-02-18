package initiald;

public class Avion extends Vehicule {
	private boolean trainAtterissageActif;
	
	public Avion() {
		this(0, "Generic brand");
	}
	
	public Avion(int engine, String brand) {
		super(engine, brand);
		this.setTrainAtterissageActif(false);
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Plane");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Plane");
	}

	public boolean getTrainAtterissageActif() {
		return trainAtterissageActif;
	}

	private void setTrainAtterissageActif(boolean trainAtterissageActif) {
		this.trainAtterissageActif = trainAtterissageActif;
	}
	
	public void sortirTrainAtterissage() {
		this.setTrainAtterissageActif(true);
	}
	
	public void rentrerTrainAtterissage() {
		this.setTrainAtterissageActif(false);
	}
}
